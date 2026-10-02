// find missing element in array 1 to n with dublicates 
import java.util.*;
class solution{
List<Integer> findmissingnumber( int[] arr){
	List<Integer> list1= new ArrayList<>();
int n = arr.length;
for ( int i = 0; i<n; i++){
int value = Math.abs(arr[i]);
int position = value-1;
if (arr[position]>0){
arr[position]= -arr[position];
}
}
for( int i= 0; i < n ; i++){
	if ( arr[i] >0){
	int missingnumber=i+1;
	list1.add(missingnumber);

	}
}
	System.out.print(list1);
return list1;
}
}
class main {
	public static void main( String arrg[]){
		int arr [] ={ 1,2,2,3,4,6,6};
		solution s1= new solution();
		s1.findmissingnumber(arr);

	}
}	
			








																																										