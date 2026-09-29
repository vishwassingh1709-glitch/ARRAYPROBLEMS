import  java . util.*;
  class vish {
	void threesum( int [] arr){
		 // List<List<Integer>>output = new ArrayList<>();
		  int n = arr.length;
		  for ( int i=0; i < n-2; i++){
			  for ( int j= i+1; j<n-1; j++){
				  for ( int k=j+1; k<n; k++){
					  if ( arr[i]+arr[j]+arr[k]==0){
						  List< Integer> list1= new ArrayList<>();
						  list1.add( arr[i]);
						    list1.add( arr[j]);
							  list1.add( arr[k]);
							  System.out.print(list1);
							 // output.add(list1);
							  		 // System.out.print(output);
									// return list1;
					  }
				  }
			  }
		  }
		 // return new ArrayList<>();
		  
	  }
  }
  class main {
	  public static void main ( String arrg[]){
		  int arr[] ={ -1, 0,1,2,-1,-4};
		  vish v1= new vish();
		 // List< Integer>output =
		 v1. threesum(arr);
			//	  System.out.print(output);
	  }
  }
	  
		  