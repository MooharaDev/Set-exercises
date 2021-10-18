
public class Set8aExer2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int[] numSquare = new int[num.length];
		double[] numInvert = new double[num.length];
		
		for(int i=0; i<num.length; i++) {
			//let the values of the num array be random from 1-10
			num[i] = (int)(1+Math.random()*10);
			numSquare[i] = (int)(Math.pow(num[i], 2));
			System.out.print(" " + numSquare[i]);
			numInvert[i] = (num[i]/numSquare[i]);
			System.out.print(" " + numInvert[i]);
		}
		
		
		

	}

}
