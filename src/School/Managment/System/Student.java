package School.Managment.System;

public class Student{
	private int id;
	private String name;
	private int grade;
	private int feePaid;
	private int feetotal;
	
	
	 /**
	  * fee for every students $30,000 per year.
	  * fee paid initially 0.
	  * @param id id for the student: unique.
	  * @param name name of the student.
	  * @param grade grade for the student.
	  */
	
	public Student(int id, String name,int grade)
	{
		this.feePaid=0;
		this.feetotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
	}
	//not going to alter student's name , studens's id.
	/**used to update the students's grade.
	 * 
	 * @param gradenew grade of the student.
	 */
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	/**
	 * Keep adding the fees to feesPaid Field.
	 * add the fees to the fee paid 
	 * the school is going to receive the funds.
	 * @param fees
	 */
	public void payFees(int fees) {
		feePaid+=fees;
		School.updateTotalMoneyEarned(feePaid);
		
	}
	/**
	 * @return the id of the student.
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name of the student.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the grade of the student.
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @return the feePaid of the student.
	 */
	public int getFeePaid() {
		return feePaid;
	}
	/**
	 * @return the Fee total of the student.
	 */
	public int getFeetotal() {
		return feetotal;
	}
	
	/**
	 * 
	 * @return the remaining fees.
	 */
	public int getRemianingFees() {
		return feetotal-feePaid;
	}
	@Override
	public String toString() {
		return "Student's name:" + name +
				" Total fees paid so far $"+ feePaid;
		
	}
	
}