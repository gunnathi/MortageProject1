import java.util.Scanner;
public class ConsoleInput {
	private static Scanner scan=new Scanner(System.in);
	
	public static double reader(String prompt, double min,double max) {
		double value;
		while(true) {
			System.out.print("prompt");
			value=scan.nextDouble();
			if(value>=1000 && value<=100000)
				break;
				System.out.println("Enter the value bewteen +min and +max");
			
			
			
		}
		return value;
	}

}
