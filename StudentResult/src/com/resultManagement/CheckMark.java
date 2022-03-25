package com.resultManagement;

public class CheckMark {

	public String a;
	public double gpa;

	public CheckMark(Double n) {
		if(n>=80 && n<=100) {
			a = "A+";
			gpa = 4.00;
		}
		else if(n>=75 && n<80) {
			a = "A";
			gpa = 3.75;
		}
		else if(n>=70 && n<75) {
			a = "A-";
			gpa = 3.50;
		}
		else if(n>=65 && n<70) {
			a = "B+";
			gpa = 3.25;
		}
		else if(n>=60 && n<65) {
			a = "B";
			gpa = 3.00;
		}
		else if(n>=55 && n<60) {
			a = "B-";
			gpa = 2.75;
		}
		else if(n>=50 && n<55) {
			a = "C+";
			gpa = 2.50;
		}
		else if(n>=45 && n<50) {
			a = "C";
			gpa = 2.25;
		}
		else if(n>=40 && n<45) {
			a = "D";
			gpa = 2.00;
		}
		else if(n<40) {
			a = "F";
			gpa = 0.00;
		}
		else {
			System.out.println("Invalid Marks");
		}
	}

}
