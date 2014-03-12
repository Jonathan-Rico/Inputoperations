import java.util.Scanner;
public class Inputoperations {

	public static void main(String[] args) {
		
	System.out.printf("Hello, please enter two integer numbers below.\nThe program will add, subtract, multiply and divide these numbers together\n\n");
				
	Scanner input = new Scanner( System.in );
				
	int x = input.nextInt();
	int y = input.nextInt();
	int sum = x+y;
	int subtract = x-y;
	int multiply = x*y;
	int divide = x/y;
	int remainderofdivision = x%y;		
	System.out.printf("\nHello, the numbers you have given for input are %d and %d\n\n", x, y);
	System.out.printf("The sum is %d\nThe difference is equal to %d\nThe Multiplication is equal to %d\nThe Division is equal to %d\n", sum, subtract, multiply, divide);
	System.out.printf("The remainder of the division is %d", remainderofdivision);
		

	}

}
