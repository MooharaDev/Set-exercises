
public class Arrays {

	public static void main(String[] args) {

	
	
	
	
		int arr[] = new int[1000];
		int count[] = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			int rand = (int)(1 + Math.random() * 10);
			arr[i] = rand;
			count[rand-1]++;
			
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.print(i+1 + " ");
			System.out.println(count[i]);
		}
//	

 }
}



	