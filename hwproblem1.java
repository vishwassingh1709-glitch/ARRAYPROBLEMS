import java .util.*;
class vish {
	void swapnumber(int arr1[], int arr2[]){
		for ( int i=0; i<arr1.length-1; i++){
			for ( int j=0; j< arr2.length; j++){
				if( arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
			
		}
	}
}
		class main {
			public static void main( String arrry[]){
				int arr1[]={ 1,2,3,4,5,6};
					int arr2[]={ 4,7,9,2};
					vish v1= new vish();
					v1.swapnumber(arr1,arr2);
			}
		}