
public class Set8aExer1 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(1 + Math.random() * 10);
			System.out.println(arr[i]);
		}
		
		System.out.println(sum(arr));
		System.out.println(min(arr));
		System.out.println(max(arr));
		System.out.println(avg(arr));
		
		// this loop will go over every value of "arr" and will get the difference 
		// of each value from the average
		for(int i=0;i<arr.length;i++) {
			System.out.println(diffOfVal(arr, (avg(arr)))[i]);
		}
		
		

	}
	public static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static int min(int[] arr) {
		int min = 100;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int max(int[] arr) {
		int max = -1;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int avg(int[] arr) {
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length;i++) {
			sum += arr[i];
			avg = sum/(i+1);
		}
		return avg;
	}
	
	public static int[] diffOfVal(int[] arr, int avg) {
		int diff[] = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			diff[i] = arr[i] - avg;
			if(diff[i] < 0) diff[i] = -(diff[i]);
		}
		
		return diff;
		
	}
}


