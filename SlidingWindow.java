import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] arr = new int[n];

		for(int i =0; i < n; i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println(getSolution(arr,n,k));
	}

	public static long getSolution(int[] arr, int n, int k){
		long result = 0;
		Deque<Integer> greaterOnes = new LinkedList<Integer>();
		Deque<Integer> smallerOnes = new LinkedList<Integer>();

		int i =0;
		for(i =0; i< k; i++){

			while(!greaterOnes.isEmpty() && arr[greaterOnes.getLast()] <= arr[i] ){
				greaterOnes.removeLast();
			}

			while(!smallerOnes.isEmpty() && arr[smallerOnes.getLast()] >= arr[i] ){
				smallerOnes.removeLast();
			}

			greaterOnes.addLast(i);
			smallerOnes.addLast(i);
		}

		for(;i < n ; i++){
			
			result += (arr[smallerOnes.getFirst()] + arr[greaterOnes.getFirst()]);

			while(!greaterOnes.isEmpty() && greaterOnes.getFirst() <= i - k){
				greaterOnes.removeFirst();
			}

			while(!smallerOnes.isEmpty() && smallerOnes.getFirst() <= i - k){
				smallerOnes.removeFirst();
			}

			while(!greaterOnes.isEmpty() && arr[greaterOnes.getLast()] <= arr[i] ){
				greaterOnes.removeLast();
			}

			while(!smallerOnes.isEmpty() && arr[smallerOnes.getLast()] >= arr[i] ){
				smallerOnes.removeLast();
			}

			greaterOnes.addLast(i);
			smallerOnes.addLast(i);

		}

		result += (arr[smallerOnes.getFirst()] + arr[greaterOnes.getFirst()]);
		return result;

		


	}

}
