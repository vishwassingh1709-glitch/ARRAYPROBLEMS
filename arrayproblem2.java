 import java.util.*;
 class vish { 

void  findtarget( int arr[], int target){ // maine yaha void isliye use kiya kyu ki main kuch return nhi krwana chahta 
 for ( int i=0; i<arr.length; i++){
 if ( arr[i] == target){
 System.out.println( " element is found and at index"+i);

  }
  else
  {
	  System.out.println( " element is not found ");
  }
 }
 }
 }


// }
// }
 class main{
public static void main( String arry[])
{
Scanner sc= new Scanner( System.in);
System.out.println( " enter the size of array");
int n = sc.nextInt();
int arr []= new int[n];
for ( int i=0; i<n; i++){
System.out.println(" enter the element of array");
arr[i]=sc.nextInt();
}
vish v1= new vish();
// boolean found=v1.findtarget(arr,7);
// System.out.println(" element is found" +found);
System.out.println(" enter the target element you will find in your array");
int a= sc.nextInt();
v1.findtarget(arr,a);
}
 }
// }
// }