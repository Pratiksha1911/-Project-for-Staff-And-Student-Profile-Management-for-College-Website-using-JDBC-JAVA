package com.marks.execute;

import java.util.Scanner;

import com.main.execute.mainCalling;
import com.marks.dao.MarksDao;
import com.marks.pojo.Marks;
import com.marks.execute.CallingMarks;

public class CallingMarks {

	public void marksCall() {
		int roll_no;String name;String contact;String marks;String gread;
		String choice="0";
		Scanner sc=new Scanner(System.in);
		mainCalling mc=new mainCalling();
		MarksDao sd=new MarksDao();
		
		Marks s=new Marks();
	    
		do {
			System.out.println("Enter A For InsertStudentMarks : ");
			System.out.println("      B For UpdateStudentMarks : ");
			System.out.println("      C For SelectByIdStudentMarks : ");
			System.out.println("      D For DeleteStudentMarks : ");
			System.out.println("      E For SelectAllStudentMarks : ");
			System.out.println("      Z For BackToMainMenu : ");

			choice=sc.next();
			switch (choice) {
			case "A":
				System.out.println("Enter Name Contact  Marks gread ");
				name=sc.next();
				contact=sc.next();
				marks=sc.next();
				gread=sc.next();
				s.setName(name);s.setContact(contact);s.setMarks(marks);s.setGread(gread);
				sd. addtStudentsMarks(s);
				System.out.println("Success");
				
				break;

			case "B":
				System.out.println("Enter Name Contact Marks gread RollNo For Update");
				name=sc.next();
				contact=sc.next();
				marks=sc.next();
				gread=sc.next();
				roll_no=sc.nextInt();
				s.setName(name);s.setContact(contact);s.setMarks(marks);s.setGread(gread);
				s.setRollNo(roll_no);
				sd.updateStudentsMarks(s);
				System.out.println("Success");
				break;

			case "C":
				System.out.println("Enter RollNo for To select StudentsMarks");
				roll_no=sc.nextInt();
				sd.selectStudentsMarksByRollNo(roll_no);
				break;

			case "D":
				System.out.println("Enter RollNo for To Delete StudentsMarks");
				roll_no=sc.nextInt();
				sd.deleteStudentsMarks(roll_no);
				break;

			case "E":
				sd.selectAllStudentsMarks();
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
		CallingMarks cm=new CallingMarks();
		cm.marksCall();
	}
}

