package com.resultManagement;

public class CheckMark {

	public String a;

	public CheckMark(Double n) {
		if(n>=80 && n<=100) {
			a = "A+";
		}
		else if(n>=75 && n<80) {
			a = "A";
		}
		else if(n>=70 && n<75) {
			a = "A-";
		}
		else if(n>=65 && n<70) {
			a = "B+";
		}
		else if(n>=60 && n<65) {
			a = "B";
		}
		else if(n>=55 && n<60) {
			a = "B-";
		}
		else if(n>=50 && n<55) {
			a = "C+";
		}
		else if(n>=45 && n<50) {
			a = "C";
		}
		else if(n>40 && n<45) {
			a = "C-";
		}
		else if(n==40) {
			a = "D";
		}
		else if(n<40) {
			a = "D";
		}
		else {
			System.out.println("Invalid Marks");
		}
	}

}
