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
	int sum = 0;
	

	System.out.println("1. add");
	System.out.println("2. subtract");
	System.out.println("3. multiply");
	System.out.println("4. divide");
	System.out.println("5. Exit");

	//next step to add condtions for when they type add subtract or multply 
	//if they enter exit and want to stop
	Scanner scrn = new Scanner(System.in);
	String operation = scrn.nextLine().trim().toLowerCase();

	//if they dont want too continute then done but i wonder if it should be a while loop??
	if (operation.equals("exit")) {
		System.out.println("finished");
		
		
	} 
	
	//declare numbers 
	int num1;
	int num2;
	

	
	//switch case or if else
	switch(operation) {
			case "add": 
				System.out.println("enter number 1:");
				num1 = scrn.nextInt();
				System.out.println("enter number 2:");
				num2 = scrn.nextInt();
				sum = num1 + num2 ;
				System.out.println(sum);
				break;
			case "subtract":
				System.out.println("enter number 1:");
				num1 = scrn.nextInt();
				System.out.println("enter number 2:");
				num2 = scrn.nextInt();
				sum = num1 - num2;
				System.out.println(sum);
				break;
			case "multiply":
				System.out.println("enter number 1:");
				num1 = scrn.nextInt();
				System.out.println("enter number 2:");
				num2 = scrn.nextInt();
				sum = num1 * num2;
				System.out.println(sum);
				break;
			case "divide": 
				System.out.println("enter number 1:");
				num1 = scrn.nextInt();
				System.out.println("enter number 2:");
				num2 = scrn.nextInt();
				sum = num1 / num2;
				System.out.println(sum);
				break;
			default: //if user enters anything else than the options
				System.out.println("That operation doesnt exist");
				break; 
	
	
	}
	

	
	
	
	}

}

