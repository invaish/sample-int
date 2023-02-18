package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name: ASHA");
	}
	public void studentId() {
		System.out.println("Id: 2676");
	}
	
	private void studentDept() 
	{
		System.out.println("Dept: MCA");

	}
	
	public static void main(String[] args) {
		Student s =new Student();
		s.deptName();
		s.collegeName();
		s.collegeRank();
		s.collegeCode();
		s.studentDept();
		s.studentId();
		s.studentName();
		s.deptName();
	}

}
