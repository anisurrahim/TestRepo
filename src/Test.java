
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// System.out.println("Hello...");

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
		
		System.out.println("You have entered: Num1=" + num1 + " and Num2=" + num2 +" and Char="+chr);
		////////
		
		if ("+".equals(chr)) {
			int add = num1 + num2;
			{
				System.out.println("Answer is = "+add);
			}
		}
		else if ("-".equals(chr)) {
			if (num1 > num2) {
				int sub1 = num1 - num2;
				{
					System.out.println("Answer is = "+sub1);
				}

			} else {
				int sub2 = num2 - num1;
				{
					System.out.println("Answer is = "+sub2);
				}
			}
		}
		else if ("/".equals(chr)) {
			int division = num1 / num2;
			//{
				System.out.println("Answer is = "+division);
			//}
		}
		else if ("*".equals(chr)) {
				int multi = num1 * num2;
				//{
					System.out.println("Answer is = "+multi);
				//}
		} 
		else {
				System.out.println("You have entered Wrong Function");
		}
				
	}
}
