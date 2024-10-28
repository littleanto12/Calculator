import java.util.Scanner;
/*
NOTE: making sure to take only +-x/ only
*/
public class Calculator {
	//instance variables
	private double results;
	private String operation;
	private double num1;
	private double num2;

	//constructor 
	public Calculator(){
		Scanner scrn = new Scanner(System.in);
		results = 0;
		System.out.println("enter number 1: ");
		num1 = scrn.nextDouble();
		System.out.println("enter operation: ");
		this.operation = scrn.next();
		System.out.println("enter number 2: ");
		num2 = scrn.nextDouble();
	}
	//getters
	public String getResults(){
		if (results % 1 == 0) {
			return String.format("%.0f", results);
		} else {
			return String.valueOf(results);
		}
	}

	public String getOperation(){
		return operation;
	}

	public double num1(){
		return num1;
	}

	public double num2(){
		return num2;
	}

	//setters
	public void setResults(double results){
		this.results = results;
		/*
		if (results % 1 == 0) {
			this.results = (int)results;
		} else {
			this.results = results;
		}
		*/
	}

	public void setOperation(String operation){
		this.operation = operation;
	}

	public void setNum1(double num1){
		this.num1 = num1;
	}

	public void num2(double num2){
		this.num2 = num2;
	}


	//switch case or if else
	public double userChoice(){
		switch(operation) {
				case "add": 
					results = num1 + num2 ;
					break;
				case "subtract": 
					results = num1 - num2;
					break;
				case "multiply": 
					results = num1 * num2;
					break;
				case "divide": 
					if (num2 != 0){
						results = num1 / num2;
					}
					break;
				default: //if user enters anything else than the options
					break; 
		}
		return results;
	}

	public void theResults(){
		userChoice(); // doing calculations
		System.out.println(getResults()); //showing results 
	}
	

	public static void main (String[]args){
		//object created
		Calculator calculator = new Calculator();
		//calling menu 
		calculator.theResults();
	
	}

}

