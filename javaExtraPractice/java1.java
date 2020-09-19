import java.util.Scanner;


class Calculator {
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			boolean flag = true;
			int no,a1,a2;
			
			while(flag){

			System.out.println("Enter the number: \nPress 1 for Addn :\nPress 2 for subtn :\nPress 3 for multi :\nPress 4 for Div :\nPress 5 to Power :\nPress 6 to Exit\nEnter your choice : ");
			no = sc.nextInt();
			switch (no){
			
				case 1 :
					System.out.println("For Addition Enter two no :");
					int sum;
					a1 = sc.nextInt();
					a2 = sc.nextInt();
					sum = a1 + a2;
					System.out.println("Addition is : "+sum+"\n");
					break;
				case 2 :
					System.out.println("For Substraction Enter two no : ");
					int sub;
					a1 = sc.nextInt();
					a2 = sc.nextInt();
					sub = a1 - a2;
					System.out.println("Substraction is : "+sub+"\n");
					break;
				case 3 :
					System.out.println("For Multiplication Enter two no : ");
					int mul;
					a1 = sc.nextInt();
					a2 = sc.nextInt();
					mul = a1 * a2;
					System.out.println("Multiplication is : "+mul+"\n");
					break;
				case 4 :
					System.out.println("For Division Enter two no : ");	
					int div;
					a1 = sc.nextInt();
					a2 = sc.nextInt();
					div = a1 / a2;
					System.out.println("Division is : "+div+"\n");
					break;
				case 5 :
					System.out.println("For Power Enter two no : ");	
					int pow;
					a1 = sc.nextInt();
					a2 = sc.nextInt();
					pow =a1;
					for(int i=1;i<a2;i++)
					{
						pow = pow * a1;
					}
					System.out.println("Power is : "+pow+"\n");
					break;
				case 6 :
					System.out.println("Exit\n");
					flag = false;
					break;
				default:
					System.out.println("Invalid Input\n");
					break;
				}
			}
	}
	}
			
