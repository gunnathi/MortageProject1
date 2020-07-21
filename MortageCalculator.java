
public class MortageCalculator {
	
	private static byte MONTH_IN_YEAR=12;
    private static byte PERCENT=100;		
	
	
	private int principal;
	private float rateOfInterest;
	private int years;
	
	public MortageCalculator(int principal,float rateOfInterest, int years) {
		this.principal=principal;
		this.rateOfInterest=rateOfInterest;
		this.years=years;
	}
	
	public void  calculateMortage() {
		float monthlyInterest=this.rateOfInterest/PERCENT/MONTH_IN_YEAR;
		float numberOfPayments=this.years*MONTH_IN_YEAR;
		
		double mortage=principal*(monthlyInterest*Math.pow(1+monthlyInterest, numberOfPayments))/
		         (Math.pow(1+monthlyInterest, numberOfPayments)-1);
		  
		System.out.println("Mortage"+mortage);
		
	}
	

}
