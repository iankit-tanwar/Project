package School.Managment.System;

/**
 * 
 * Created by @Ankit on 10/12/2022.
 * this class is responsible for keeping the track
 * of teachers name ,id ,salary.
 
 *
 */
public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	/**
	 * 
	 * @return the id of the teacher.
	 */
	public int getId() {
		return id;
		
	}
	
	/**
	 * 
	 * @return the name of the student.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return the salary of the teacher.
	 */
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		
	}
	/**
	 * adds the salary
	 * removes the total money earned by the school.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned+= salary;
		School.updateTotalMoneySpent(salary);
		
		
	}
	@Override
	public String toString() {
		return "Name of the teacher:" + name 
				+ " Total salary earned so far $"
				+  salaryEarned;
	}
}
