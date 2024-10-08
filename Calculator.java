import java.util.Scanner;
//set up the program

/* NOTES: 
Create a simple calculator that:

Asks for two numbers
Performs one operation (start with addition)
Shows the result

Extend to include:
Subtraction
Multiplication
Division (think about division by zero!)

Day 3-4: Menu System
3. Create a menu that:

Shows options for each operation
Lets user choose operation
Keeps running until user wants to exit

Add error handling:

What if user enters letters instead of numbers?
How to handle invalid menu choices?
*/
public class Calculator {
	public static void main (String[]args){
	//display menu 
	double sum = 0;
	

	System.out.println("1. add");
	System.out.println("2. subtract");
	System.out.println("3. multiply");
	System.out.println("4. divide");
	System.out.println("5. Exit");
	

	//Get user input 
	Scanner scrn = new Scanner(System.in);
	System.out.println("Enter an operation");
	String operation = scrn.next();
	
	
	
	//next step to add condtions for when they type add subtract or multply 
	//if they enter exit and want to stop
	if (operation.equals("exit")) {
		System.out.println("finished");
	
	}
	
	
	
	int num1 = scrn.nextInt();
	System.out.println("Enter first number:");
	int num2 = scrn.nextInt();
	System.out.println("Enter second number:");

	
	//switch case or if else
	switch(operation) {
			case "add": 
				sum = num1 + num2 ;
				System.out.println(sum);
				break;
			case "subtract": 
				sum = num1 - num2;
				System.out.println(sum);
				break;
			case "multiply": 
				sum = num1 * num2;
				System.out.println(sum);
				break;
			case "divide": 
				sum = num1 / num2;
				System.out.println(sum);
				break;
			default: //if user enters anything else than the options
				break; 
	
	
	}
	

	
	
	
	}

}

