package com.student.execute;

import java.util.Scanner;

import com.main.execute.mainCalling;
import com.student.dao.StudentDao;
import com.student.pojo.Student;

public class CallingStudent {
	
	public void studentCall() {
		int roll_no;String name;String email;String contact;String college;
	    String fees;
		String choice="0";
		Scanner sc=new Scanner(System.in);
		mainCalling mc=new mainCalling();
		StudentDao sd=new StudentDao();
		Student s=new Student();
	    
		do {
			System.out.println("Enter A For InsertStudent : ");
			System.out.println("      B For UpdateStudent : ");
			System.out.println("      C For SelectStudentById : ");
			System.out.println("      D For DeleteStudent : ");
			System.out.println("      E For SelectAllStudent : ");
			System.out.println("      F For selectAllStudentByCollege : ");
			System.out.println("      Z For BackToMainMenu : ");
			choice=sc.next();
			switch (choice) {
			case "A":
				System.out.println("Enter Name  Email  Contact  College Fees");
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				college=sc.next();
				fees=sc.next();
				s.setName(name);s.setCollege(college);s.setContact(contact);
				s.setEmail(email);s.setFees(fees);
				sd.addStudent(s);
				System.out.println("Success");
				
				break;

			case "B":
				System.out.println("Enter Name  Email  Contact  College Fees  RollNo For Update");
				name=sc.next();
				email=sc.next();
				contact=sc.next();
				college=sc.next();
				fees=sc.next();
				roll_no=sc.nextInt();
				s.setName(name);s.setCollege(college);s.setContact(contact);
				s.setEmail(email);s.setFees(fees); s.setRollNo(roll_no);
				sd.updateStudent(s);
				System.out.println("Success");
				break;

			case "C":
				System.out.println("Enter RollNo for To select Student");
				roll_no=sc.nextInt();
				sd.selectStudentByRollNo(roll_no);
				break;

			case "D":
				System.out.println("Enter RollNo for To Delete Student");
				roll_no=sc.nextInt();
				sd.deleteStudent(roll_no);
				break;

			case "E":
				sd.selectAllStudentStudent();
				break;

			case "F":
				System.out.println("Enter college name for To select Student");
				college=sc.next();
				sd.selectAllStudentByCollege(college);
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
		CallingStudent cs=new CallingStudent();
		cs.studentCall();
	}


}
