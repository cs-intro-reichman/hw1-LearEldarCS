public class FVCalc {
	public static void main(String[] args){
		
	 	int currentValue = Integer.parseInt(args[0]);
        double rateIn = Double.parseDouble(args[1]);
        int nYears = Integer.parseInt(args[2]);
        
        double rateOut = rateIn / 100;
        double futureValue = currentValue*(Math.pow((1+rateOut), nYears));

        System.out.println("After " + nYears + " Years, $" + currentValue + " saved at " + rateIn + "% will yield $" + (int)futureValue);
    

	}
}