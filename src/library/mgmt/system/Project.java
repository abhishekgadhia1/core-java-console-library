package library.mgmt.system;

import java.util.Scanner;

public class Project
{
	public static void main(String[] args)
	{
		char yesNo;
		
		do
		{
			System.out.println("**************Library Management System*****************");
			System.out.println();
			System.out.println("Press 1 to add a book");
			System.out.println("Press 2 to issue a book");
			System.out.println("Press 3 to return a book");
			System.out.println("Press 4 to print complete issue details");
			System.out.println("Press 5 to exit");
		
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			
			
			switch(choice)
			{
				case 1: Library lib1 = new Library();
						lib1.add();
						break;
						
				case 2: Library lib2 = new Library();
						lib2.issue();
						break;
						
				case 3: Library lib3 = new Library();
						lib3.ret();
						break;
						
				case 4: Library lib4 = new Library();
						lib4.details();
						break;
						
				case 5: Library lib5 = new Library();
						lib5.exit();
						break;
						
				default: System.out.println("Invalid option");
			}
		System.out.println("You want to select next option Y/N");
		yesNo = s.next().charAt(0);
		}
		while(yesNo=='y'||yesNo=='Y');
		if(yesNo=='n'||yesNo=='N')
		{
			System.exit(1);
		}
	}
}

class Library
{
	static int bookID, bookNo, totalBooks;
	static String bookName, issueDate, returnDate;
	
	void add()
	{
		System.out.println("Enter book name, prize and book number.");
		Scanner s = new Scanner(System.in);
		String bookName = s.nextLine();
		float price = s.nextInt();
		int bookNo = s.nextInt();
		System.out.println("Your details are "+bookName+" "+price+" "+bookNo);
	}
	
	void issue()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Book name");
		String bookNameIssue = s.nextLine();
		System.out.println("Book ID");
		int bookID = s.nextInt();
		System.out.println("Issue date");
		String issueDate = s.nextLine();
		System.out.println("Number of books");
		int totalBooks = s.nextInt();
		System.out.println("Return date");
		String returnDate = s.nextLine();
		
	}
	
	int getID()
	{
		return bookID;
	}
	void ret()
	{
		System.out.println("Enter student name and book ID");
		Scanner s = new Scanner(System.in);
		String returnBookName = s.nextLine();
		int returnBookID = s.nextInt();
		if(returnBookID==bookID)
		{
			System.out.println("Total details");
			System.out.println("Book name : "+Library.bookName);
			System.out.println("Book ID : "+Library.bookID);
			System.out.println("Issue date : "+Library.issueDate);
			System.out.println("Total books issued : "+Library.totalBooks);
			System.out.println("Return date : "+Library.returnDate);
		}
		else
		{
			System.out.println("Please enter correct ID");
		}
	}
	
	void details()
	{
		//System.out.println("Total details");
		System.out.println("Book name : "+Library.bookName);
		System.out.println("Book ID : "+Library.bookID);
		System.out.println("Issue date : "+Library.issueDate);
		System.out.println("Total books issued : "+Library.totalBooks);
		System.out.println("Return date : "+Library.returnDate);
	}
	
	void exit()
	{
		System.exit(1);
	}
}










