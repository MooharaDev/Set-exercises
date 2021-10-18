
public class Set8aExer4 {

	public static void main(String[] args) {
		int[] arr = {7,3,3,5,4,4,5,7,3,7,7,8,9,5,3,4,6,8,7,5};
		
		System.out.print(measures(arr));
		

	}
	
	
	public static String measures(int[] arr) {
		int[] freq = new int[arr.length];
		double mean;
		double median;
		int mode = 0;
		int max = 0;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum+= arr[i];
			freq[arr[i]]++;
			
		}
		
		// mean:
		mean = (double)sum/arr.length;
		
		// median:
		
	
		boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i+1]) {
	                temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
		if(arr.length % 2 == 0) {
				median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
			} else {
				median = arr[arr.length / 2];
			}
		// mode:
		for(int i=0;i<arr.length;i++) {
			if(freq[i] > max) {
				mode = i;
				max = freq[i];
			}
			System.out.println( i + "  " + freq[i] + " " + mode);
		}
		
		return "The mean is: " + mean + "\nThe median is: " + median + "\nThe mode is: " + mode;
	}

}
