package com.main.execute;

import java.util.Scanner;

import com.library.execute.CallingLibrary;
import com.marks.execute.CallingMarks;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import com.student.execute.CallingStudent;
import com.teacher.execute.CallingTeacher;

public class mainCalling {
	Scanner sc = new Scanner(System.in);

	public void callMain() {
		int choice=0;
		CallingStudent cs=new CallingStudent();
		CallingTeacher ct=new CallingTeacher();
		CallingLibrary cl=new CallingLibrary();
		CallingMarks cm=new CallingMarks();


		do {
			System.out.println("Enter 1: Student Information ");
			System.out.println("      2: Teacher Information ");
			System.out.println("      3: Library Information");
			System.out.println("      4: Student Marks ");
			choice=sc.nextInt();

			switch(choice) {
			case 1:
				cs.studentCall();
				break;

			case 2:
				ct.teacherCall();
				break;

			case 3:
				cl.libraryCall();
				break;

			case 4:
				cm.marksCall();
				break;

			}

		}while(choice!=0);
	}

	public static void main(String[] args) {
		mainCalling mc=new mainCalling();
		mc.callMain();

	}
}
