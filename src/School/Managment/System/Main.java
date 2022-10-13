package School.Managment.System;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher Lizzy =new Teacher(1,"Lizzy",500);
		Teacher Mellisa =new Teacher(2,"Mellisa",700);
		Teacher vanderhorn =new Teacher(3,"vanderhorn",600);
		List<Teacher> teacherList =new ArrayList<>();
		
		teacherList.add(Lizzy);
		teacherList.add(Mellisa);
		teacherList.add(vanderhorn);
		
		Student tamasha =new Student( 1,"Tamasha", 4);
		Student rakshith =new Student( 2, "Rakshith",  12);
		Student ankit =new Student( 3,  "Ankit",  10);
		List<Student> studentList =new ArrayList<>();
		
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(ankit);
		
		School ghs =new School(teacherList,studentList);
		//System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
		
		tamasha.payFees( 5000);
		
		rakshith.payFees(6000);
		System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());
		
		System.out.println("MAKING SCHOOL PAY SALARY");
		Lizzy.receiveSalary(Lizzy.getSalary());
		System.out.println("GHS has spent for salary to " +Lizzy.getName()+" and now has $"+ghs.getTotalMoneyEarned());
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " +vanderhorn.getName()+" and now has $"+ghs.getTotalMoneyEarned());
		
		System.out.println(ankit);
		
		Mellisa.receiveSalary(Mellisa.getSalary());
		System.out.println(Mellisa);

	}

}
