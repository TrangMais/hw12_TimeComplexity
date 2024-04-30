package be6_day13_TO;

import java.util.Scanner;

public class SquareRoot {
	public static double mathSquareRoot(int num) {
		if(num < 2) {
			return num;
		}
		int result = 1;
		while(result*result <= num) {
			result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		double result = mathSquareRoot(num);
		System.out.println("Square Root of the number is: " + result);
		scanner.close();
	}

}
