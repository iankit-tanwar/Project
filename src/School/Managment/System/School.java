package School.Managment.System;

import java.util.List;

/**
 * 
 * Many teachers,many students.
 * Implements teachers and students
 * using an Array list.
 * created by @ankit
 *
 */

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/** 
	 * new school object is created.
	 * @param teachers list of teachers in the school.
	 * @param students list of students in the school.
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
	}

	/**
	 * @return the teachers it the school.
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * add a teacher to the school.
	 * @param teacher the teacher to be added.
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * @return the students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/** add a student to the school
	 * @param student the student to be added.
	 */
	public void addStudents(Student student) {
		students.add(student);
	}

	/**
	 * @return the totalMoneyEarned
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * adds the total money earned by the school.
	 * @param MoneyEarned money that is supposed to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * @return the totalMoneySpent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money that is spent by the school which 
	 * is the salary given by the school to its teachers.
	 * @param MoneySpent the money spent by school.
	 */
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneySpent -= MoneySpent;
	}

	
	
	
	

}
