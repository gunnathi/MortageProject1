import java.util.Scanner;
public class MortageMain {

	public static void main(String[] args) {
	
		int principal=(int)ConsoleInput.reader("Enter Prinicpal",1000,100000);
		float rateOfInterest=(int)ConsoleInput.reader("Enter rateOfInterest",1000,100000);
		int years=(int)ConsoleInput.reader("Enter years",1000,100000);
		
		MortageCalculator calculator=new MortageCalculator(principal,rateOfInterest,years);
		
		calculator.calculateMortage();
		
		
		
		

	}

}
