// write a program to print diamond pattern

import java.util.*;

class for5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int n = sc.nextInt();
		

		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=i+1;j++){

				System.out.print(" ");

			}
			for(int k=0;k<(2*(n-i-1)-1);k++){

				System.out.print("*");
			}
			System.out.println("");
		}
		
			
		/*for(int i=0;i<n;i++)
   {

     					
				for(int j=1;j<=n-i;j++)
     
					System.out.print(" ");
 
    
				for(int j=1;j<=2*i-1;j++)
       
					System.out.print("*");
 
    
					System.out.print("\n");
   
			}
 
   
				for(int i=n-1;i>=1;i--)
   {
 
    
					for(int j=1;j<=n-i;j++)
     
						System.out.print(" ");
     

					for(int j=1;j<=2*i-1;j++)
       
						System.out.print("*");
   
  
				System.out.print("\n");
   
			}
		System.out.println("");   */	
	}
}