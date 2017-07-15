package hello;

import java.util.Scanner;

public class Test {

	String firstName = "";
	String lastName = "";
	
	public int sayHell(){		
		System.out.println("Hello "+ firstName +" "+lastName);
		return 50;
	}
	public Test (){
		System.out.println("From Default Constructor");		
	}
	
	public Test (String fname){
		firstName = fname;
		System.out.println("From Constructor"+firstName);	
	}
	
	public Test (String fname, String lname){
		firstName = fname;
		lastName = lname;
		System.out.println("From Constructor "+firstName +" lastName");	
	}
	
	public static void main(String[] args) {
		
		int i = 5;
		boolean j = true;
		
		Employee emp1 = new Employee();
		emp1.setFname("Anisur");
		emp1.setLname("Rahim");
		emp1.setAge(50);
		
		System.out.println(emp1.printObj());
		
		if (i <= 5)
			System.out.println("I am Five or Less");
		if (i >= 5)
			System.out.println("I am Five or More");
				
		Test test = new Test("Abdul", "Miah");
		
		test.firstName = args[0];
		test.lastName = args[1];
		
		System.out.println(test.firstName +" " +test.lastName);
		int age = test.sayHell();
		
		System.out.println("Your age is return from function: "+age);
		
		 System.out.println("Hello...");
		 /*
		Scanner keybord = new Scanner(System.in);
		System.out.println("Please enter 1st num");
		int num1;
		num1 = keybord.nextInt();
		System.out.println("Please enter 2nd num");
		int num2;
		num2 = keybord.nextInt();		

		System.out.println("Please enter chr");
		String chr;
		chr = keybord.next();
		
		System.out.println("You have entered: Num1 " + num1 + " and Num2 " + num2 +" and Char "+chr);
				
		if ("+".equals(chr)) {
			int add = num1 + num2;
			System.out.println("Answer is = "+add);			
		}
		else if ("-".equals(chr)) {
			if (num1 > num2) {
				int sub1 = num1 - num2;
				System.out.println("Answer is = "+sub1);				

			} else {
				int sub2 = num2 - num1;
				System.out.println("Answer is = "+sub2);				
			}
		}
		else if ("/".equals(chr)) {
			int division = num1 / num2;
			System.out.println("Answer is = "+division);			
		}
		else if ("*".equals(chr)) {
			int multi = num1 * num2;
			System.out.println("Answer is = "+multi);			
		} 
		else {
			System.out.println("You have entered Wrong Function");
		}	
		*/			
	}//end of main
}//end of class
