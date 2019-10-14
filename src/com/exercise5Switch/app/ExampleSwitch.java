package com.exercise5Switch.app;
import java.util.Scanner;
public class ExampleSwitch {

	public static void main(String[] args) {
		//Variables
		int nmes =0;
		char Ans = 'y';
		
		//Objects :v
		Scanner input = new Scanner(System.in);
		
		do {
			nmes=0;
		while (nmes<=0) {
		System.out.println("Give me a month number:");
		nmes = input.nextInt();
		
		
		if (nmes<=0) {
			System.out.println("No valid data");
		}
	}
		switch (nmes) {
		case 1: System.out.println("Junary");
		break;
		case 2:  System.out.println("February");
		break;
		case 3: System.out.println("March");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		case 6: System.out.println("June");
		break;
		case 7: System.out.println("July");
		break;
		case 8: System.out.println("August");
		break;
		case 9: System.out.println("September");
		break;
		case 10: System.out.println("Octuber");
		break;
		case 11: System.out.println("November");
		break;
		case 12: System.out.println("December");
		break;
		default: System.out.println("Not valid");
		break;
		}
		System.out.println("Do you want to try again?(y/n)");
		Ans = input.next().charAt(0);
	   }while (Ans == 'y');
	input.close();
	}
}
