// kadane's algorithm for maximum sub array 
import java .util.*;
class solution {
	int maximumsubarray( int [] arr){
	int n = arr.length;
	int sum=0;
	int maximum=Integer.MIN_VALUE;
	for ( int i=0; i<n; i++){
		// SUM KO UPDATE KRNA 
		sum = sum +arr[i];
		// maximum ko upadate krna 
		maximum=Math.max(sum, maximum);// that's important this yo update the maximum 
		// agar negatime hai to sum ko 0 kr do
		if ( sum<0){
			sum = 0;
		}
	}
	System.out.println(" the maximum sum of sub array is " + ""+maximum);
	return maximum;
}
}
class main {
	public static void main( String arrg[]){
		Scanner sc= new Scanner( System.in);
		System.out.print(" enter the size of array:-");
		int a = sc.nextInt();
		int arr [] = new int [a];
					
				for (int i= 0; i<arr.length; i++){
						System.out.println(" enter the size of array:-"+  i);	
						arr[i] = sc. nextInt();
				}
						
		solution s1= new solution();
		s1.maximumsubarray(arr);
	
	}
}	