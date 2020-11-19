import java.util.Scanner;

public class BasicCalculator {


	public static void main(String[] args) {
		Scanner userInput=new Scanner(System.in);
		
			String tryAgain = ("");
			do {
		
		
		System.out.println("this is a basic calculator");
		System.out.println("what operation would you like to do:sum,sub,multi,div?");
		
		String opt=userInput.next();
		System.out.println("give me a number");
		int num1=userInput.nextInt();
		
		System.out.println("give me another number");
		int num2=userInput.nextInt();
		
		if(opt.equalsIgnoreCase("sum")) {
			sum(num1,num2);
		}
		else if(opt.equalsIgnoreCase("sub")) {
			sum(num1,num2);
		}
		else if(opt.equalsIgnoreCase("div")) {
			div(num1,num2);
		}
		else if(opt.equalsIgnoreCase("multi")) {
			multi(num1,num2);
		  }
		
		else {
			System.out.println("invalid input");
			
		}
		System.out.println("do you want to try againY/N?");
		tryAgain=userInput.next();

	}	while (tryAgain.equalsIgnoreCase ("Y"));

	
		}
	public static void sum(int x,int y) {
	System.out.println(x+y);	
	}

	public static void div(float x,float  y) {
	System.out.println(x/y);	
	}

	public static void multi(int x,int y) {
		System.out.println(x*y);
		
	}
}


