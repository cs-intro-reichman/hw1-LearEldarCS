public class Ascend {
	public static void main(String[] args) {

		int lim = Integer.parseInt(args[0]); //the range input 

        int a = (int) ((Math.random()* lim) + 1);
        int b = (int) ((Math.random()* lim) + 1);
        int c = (int) ((Math.random()* lim) + 1);

        System.out.println(a + " " + b + " " + c);

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c); 
        int mid = (a + b + c) - (max + min); 

        System.out.println(min + " " + mid + " " + max);

	}
}
