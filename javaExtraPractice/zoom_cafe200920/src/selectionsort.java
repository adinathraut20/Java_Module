
import java.util.*;

class Sort {
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
   	System.out.println("Enter no of element : ");
	int n = sc.nextInt();
	System.out.println("Enter no of element : ");
    int arr[] = new int[n];
	for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();

   	 }
   	 int min = 0;
	// boolean flag = false;
	for(int i = 0;i<n;i++){
       		 min = i;
        	
		for (int j = i + 1; j < n; j++) {
       		     if (arr[min] > arr[j]) {
              		  int temp = arr[min];
              		  arr[min] = arr[j];
			  arr[j] = temp;
			  
            		}
       		 }
		System.out.print("Pass : "+(i+1)+"\n");
		for(int k : arr)
    		{
        		System.out.print(k+"  ");
    		}
		System.out.println("");
		
    	}
	
   }
}

