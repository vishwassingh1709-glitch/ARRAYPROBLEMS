import java.util.*;

class average {
	static double getaverage(int [] arr){
		double sum = 0;
		for ( int i: arr){
			sum+=i;
		}
		int size = arr.length;
double avg= sum/ size;
System.out.println(avg);
	return avg;
	}
}
class main{
public static void main(String []arrg){
average a1= new average();
Scanner sc = new Scanner( System.in);
System.out.println(" enter the size of array");
int n = sc.nextInt();	
int [] arr= new int[n];
for ( int i=0; i< n; i++)
{
	System.out.println(" enter the element");
	arr[i]=sc.nextInt();
}
System.out.println(" The average of array is ");
a1.getaverage(arr);

}
}