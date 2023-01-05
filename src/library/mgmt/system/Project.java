package library.mgmt.system;

import java.util.Scanner;

public class Project
{
	public static void main(String[] args)
	{
		System.out.println("**************Library Management System*****************");
		System.out.println();
		System.out.println("Press 1 to add a book");
		System.out.println("Press 2 to issue a book");
		System.out.println("Press 3 to return a book");
		System.out.println("Press 4 to print complete issue details");
		System.out.println("Press 5 to exit");
	}
}

class Library
{
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
		
	}
}
