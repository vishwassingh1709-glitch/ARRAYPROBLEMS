import java .util.*;
class vish {
	public static void main( String arry[]){
System.out.println(" enter the size of array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[]= new int [n];


for ( int i=0 ; i<n; i++){
	System.out.println(" enter the element"); 
	arr[i]= sc.nextInt();
	arr[i] *= 10;
}
System.out.println( " the value of array is " );
for ( int val: arr){
System.out.println( val);
}
}
}