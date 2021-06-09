package com.library.execute;

import java.util.Scanner;

import com.library.dao.LibraryDao;
import com.library.pojo.Library;
import com.main.execute.mainCalling;
import com.library.execute.CallingLibrary;

public class CallingLibrary {
	Scanner sc = new Scanner(System.in);

	public void libraryCall() {
		String bname;String status; String sname; String issuedate;
		String duedate;
		String choice="0";
		Scanner sc=new Scanner(System.in);
		mainCalling mc=new mainCalling();
		LibraryDao ld=new LibraryDao();
		Library l=new Library();
	    
		do {
			System.out.println("Enter A for View All Books");
			System.out.println("      B for Check Status of Book: ");
			System.out.println("      C for List of Available Books:");
			System.out.println("      D for Deu Date over Students:");
			System.out.println("      Z For Exit : ");
			choice=sc.next();
			switch(choice){
			case "A": 
				ld.AllBooks();
				break;
				
			case "B":
				System.out.println("Enter book name:");
				bname=sc.next();
				l.setBname(bname);
				ld.BookStatus(bname);
				break;
				
			case "C":
				ld.NotIssued();
				break;
				
			case "D":
				ld.DueDate();
				break;
				

			case "Z":
				mc.callMain();
				break;
				
			}
			
		}while(choice!="0");
		
	}
	public static void main(String[] args) {
		CallingLibrary cl=new CallingLibrary();
		cl.libraryCall();
	}

}
