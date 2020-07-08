package interfacesJava;

//Class responsible that is going to handle all the math operations
public class Calculator implements MathOperations{
	
	//Method responsible for the operations
	public double executeOperation(double num1, double num2, String operator) {
		double result = 0;
		switch(operator) {
		case "+":
			System.out.println("+ : Addition");
			result = this.sum(num1, num2);
			break;
		case "-":
			System.out.println("- : Subtraction");
			result = this.sub(num1, num2);
			break;
		case "*":
			System.out.println("* : Multiplication");
			result = this.mult(num1, num2);
			break;
		case "/":
			System.out.println("/ : Division");
			result = this.div(num1, num2);
			break;
		}			
		return result;
	}
				
	//Simple addition method
	public double sum(double num1, double num2) {
		return num1 + num2;
	}

	//Simple subtraction method
	public double sub(double num1, double num2) {
		return num1 - num2;
	}

	//Simple division method
	public double div(double num1, double num2) {
		return num1 / num2;
	}

	//Simple multiplication method
	public double mult(double num1, double num2) {
		return num1 * num2;
	}

}
