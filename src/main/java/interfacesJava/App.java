package interfacesJava;

import java.util.Scanner;

public class App {

	//Main thread
	public static void main(String[] args){
		Scanner keyboardScanner = new Scanner(System.in);
		Scanner numScanner = new Scanner(System.in);
		Calculator objCalculator = new Calculator();
		Double number1;
		Double number2;
		System.out.println("Enter the desired operation:");
		System.out.println("+ : Addition");
		System.out.println("- : Subtraction");
		System.out.println("* : Multiplication");
		System.out.println("/ : Division");
		String operation = keyboardScanner.nextLine();
        System.out.println("Enter the first number: ");
        while(!numScanner.hasNextDouble()) 
        {
        	System.out.println("Not a valid number, try again: ");
        	numScanner.next();
        }
        number1 = numScanner.nextDouble();
		System.out.println("Enter the second number: ");
        while(!numScanner.hasNextDouble()) 
        {
        	System.out.println("Not a valid number, try again: ");
        	numScanner.next();
        }
		number2 = numScanner.nextDouble();
		Double result = objCalculator.executeOperation(number1, number2, operation);
		System.out.println("The result is " + result);
		System.out.println("END OF PROGRAM...");
	}
}
