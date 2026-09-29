// first problem leat code
import java .util.*;
 class vish {
	   int [] twosum(int [] arr){
		 int n = arr.length;
		 int target= 10;
		 for( int i=0; i< n-1; i++){
			 for ( int j= i+1; j< n; j++){
				 if ( arr[i] + arr[j]== target)
				 {
			int ans [] = { i, j};
			return ans ;
					 }
			 }
		 }
	return null;
	 }
 }
	class main {
	 public static void main( String arry[]){
		 int arr []= { 2,1,3,5,4,6};
		 vish v1 = new vish();
		int ans []= v1.twosum(arr);
		 System.out.print(ans[0]);
		 		 System.out.print(ans[1]);
	 }
 }