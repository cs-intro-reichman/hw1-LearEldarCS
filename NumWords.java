public class NumWords {
	public static void main(String args[]) {

		int numInput = Integer.parseInt(args[0]);

        int hundreds = numInput / 100;
        int tens = (numInput / 10) % 10;
        int ones = (numInput % 10) % 10;

        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


	}
}
