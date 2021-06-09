package com.teacher.execute;

import java.util.Scanner;

import com.main.execute.mainCalling;
import com.teacher.dao.TeacherDao;
import com.teacher.pojo.Teacher;

public class CallingTeacher {
	
	public void teacherCall() {
		int roll_no;String name;String email;String contact;String college;
		String salary; 
		String choice="0";
		Scanner sc=new Scanner(System.in);
		mainCalling mc=new mainCalling();
		TeacherDao sd=new TeacherDao();
		Teacher s=new Teacher();
		do {
			System.out.println("Enter A For InsertTeacher : ");
			System.out.println("      B For UpdateTeacher : ");
			System.out.println("      C For SelectTeacherById : ");
			System.out.println("      D For DeleteTeacher : ");
			System.out.println("      E For SelectAllTeachers : ");
			System.out.println("      F For selectAllTeacherByCollege : ");
			System.out.println("      Z For BackToMainMenu : ");

			choice=sc.next();
			switch (choice) {
			case "A":
				System.out.println("Enter Name  Email  Contact  College Salary");
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				college=sc.next();
				salary=sc.next();
				s.setName(name);s.setCollege(college);s.setContact(contact);
				s.setEmail(email);s.setSalary(salary);
				sd.addTeacher(s);
				System.out.println("Success");
				
				break;

			case "B":
				System.out.println("Enter Name  Email  Contact  College Salary  RollNo For Update");
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				college=sc.next();
				salary=sc.next();
				roll_no=sc.nextInt();
				s.setName(name);s.setCollege(college);s.setContact(contact);
				s.setEmail(email);s.setSalary(salary); s.setRollNo(roll_no);
				sd.updateTeacher(s);
				System.out.println("Success");
				break;

			case "C":
				System.out.println("Enter RollNo for To select Teacher");
				roll_no=sc.nextInt();
				sd.selectTeacherByRollNo(roll_no);
				break;

			case "D":
				System.out.println("Enter RollNo for To Delete Teacher");
				roll_no=sc.nextInt();
				sd.deleteTeacher(roll_no);
				break;

			case "E":
				sd.selectAllTeacher();
				break;

			case "F":
				System.out.println("Enter college name for To select Teacher");
				college=sc.next();
				sd.selectAllTeacherByCollege(college);
				break;
				
			case "Z":
				mc.callMain();
				break;

				
			default:
				System.out.println("Select A valid Choice");
				break;
		
		}
	}while(choice!="0");


	}

	public static void main(String[] args) {
		CallingTeacher ct=new CallingTeacher();
		ct.teacherCall();
	}
}