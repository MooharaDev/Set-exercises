
public class Set8aExer3 {

	public static void main(String[] args) {
		int[] y = new int[20];
		int[] z = new int[y.length];
		for(int i=0; i<y.length; i++) {
			y[i] = (int)(1+Math.random()*10);
		}
		for(int i=0;i<y.length;i++) {
			if(i != 0 && i != y.length - 1) {
				z[i] = (y[i-1] + y[i] + y[i+1]) / 3;
			} else {
				z[i] = y[i];
			}
			System.out.println(y[i] + " " + z[i]);
		}
		

	}

}
