import java.util.*;
class vish {
	void swapnumber(int arr[]){
		for ( int i =0 ; i< arr.length-1; i=i+2){
			int tem = arr[i];
			arr[i]=arr[i+1];
	arr[i+1]=tem;
		}
	}
}

class main{
	public static void main( String arry[]){
	int arr[]= { 1,2,3,4,5,6};
	for ( int i : arr){
			System.out.print(i  );
	}
		System.out.println("");
	vish v1= new vish();
	v1.swapnumber(arr);
for ( int value : arr){
	System.out.print(value  );
}
	}
}
		
		