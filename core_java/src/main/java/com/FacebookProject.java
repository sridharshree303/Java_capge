package com;

import java.util.Scanner;

public class FacebookProject {

	public static void main(String[] args) {
		
		String ss="y";
		while(ss.equals("y")) {
		
		System.out.println("***********************MAIN MENU***************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to timeline profile");
		System.out.println("press 7 to view all profile");

		System.out.println("enter your choice");
		Scanner sc = new Scanner(System.in); // this line will help to take input from user on console

		int choice = sc.nextInt();

		FacebookProject f = new FacebookProject();

		switch (choice) {
		case 1:
			f.createprofile();
			break;
		case 2:
			f.viewprofile();
			break;
		case 3:
			f.editprofile();
			break;
		case 4:
			f.deleteprofile();
			break;
		case 5:
			f.searchprofile();
			break;
		case 6:
			f.timelineprofile();
			break;
		case 7:
			f.viewAllprofile();
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("do you want to continue press y/n");
		ss=sc.next();
		}

	}

	void createprofile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name : ");
		String name=sc.next();
		
		System.out.println("enter password : ");
		String password=sc.next();
		
		System.out.println("enter email : ");
		String email=sc.next();
		
		System.out.println("enter address : ");
		String address=sc.next();
		
		System.out.println("your detail is below");
		System.out.println("Name is "+name);
		System.out.println("Password is "+password);
		System.out.println("email is "+email);
		System.out.println("address is "+address);
		
		
		System.out.println("profile created");
	}

	void viewprofile() {
		System.out.println("profile viewed");
	}

	void editprofile() {
		System.out.println("profile edited");
	}

	void deleteprofile() {
		System.out.println("profile deleted");
	}

	void searchprofile() {
		System.out.println("profile found");
	}

	void timelineprofile() {
		System.out.println("timeline created");
	}

	void viewAllprofile() {
		System.out.println("all profile viewed");
	}

}
