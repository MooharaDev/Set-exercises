
public class Set8aExer5 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4,5}, // month
				{2500, 2650, 2800, 3200, 1950}, // food
				{495, 580, 350, 550, 600}, // transport
				{1100, 950, 810, 980,1050}, // Misc.
				{0, 0, 0 ,0, 0}  // total
		};
		
		
		int maxFood = maximum(arr,1);
		int minFood = minimum(arr,1);
		int avgFood = average(arr,1);
		
		System.out.println(minFood);
		System.out.println(maxFood);
		System.out.println(avgFood);
		
		int maxTransport = maximum(arr,2);
		int minTransport = minimum(arr,2);
		int avgTransport = average(arr,2);
		
		System.out.println(minTransport);
		System.out.println(maxTransport);
		System.out.println(avgTransport);
		
		int maxMisc = maximum(arr,3);
		int minMisc = minimum(arr,3);
		int avgMisc = average(arr,3);
		
		System.out.println(maxMisc);
		System.out.println(minMisc);
		System.out.println(avgMisc);
		
		// 
		
		for(int i=0;i<arr.length; i++) {
			// this gives the total for each line
			arr[arr.length-1][i] = arr[1][i] + arr[2][i] + arr[3][i];

			
			
		}
		

	}
	
	public static int maximum(int[][] arr, int catagory) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[catagory][i] > max) {
				max = arr[catagory][i]; 
			}
			
		}
		
		return max;
	}
	
	public static int minimum(int[][] arr, int catagory) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[catagory][i] < min) {
				min = arr[catagory][i]; 
			}
			
		}
		
		return min;
	}




public static int average(int[][] arr, int catagory) {
	int avg = 0;
	int sum = 0;
	for(int i=0; i<arr.length; i++) {
		sum += arr[catagory][i];
		
	}
	avg=sum/arr[catagory].length;
	
	return avg;
}

}
