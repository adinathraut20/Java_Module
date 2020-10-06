/* 51. Create a program that helps banks to maintain records. It should have following facilities. 
 * o Anybody can create current or saving account with following initial information: account number,
 *  name, balance, and branch. o display account detail for a particular accounts. o display total money
 *   deposited in bank. o allow deposit and  withdrawal in an account  . o for saving account opening balance
 *    and minimum balance must be 5000. o for current account opening balance and minimum balance must be 1000. 
 *    o can not withdraw the amount from the account that makes balance less than the minimum balance. 
 */

package p51_60;


import java.util.Scanner;

abstract class Account{
	protected int accNo;
	protected String name;
	protected double balance;
	protected String branch;
	static double total;
	abstract public void display();
}

class SavingAcc extends Account{
	
	SavingAcc(int accNo,String name,double balance,String branch){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
		total += balance;
	}
	public void display() {
		System.out.println("Account no : "+accNo+"\nName :"+name+"\nBalance : "+balance+"\nBranch : "+branch);
		
	}
}

class CurrentAcc extends Account{
	
	CurrentAcc(int accNo,String name,double balance,String branch){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	public void display() {
		System.out.println("Account no : "+accNo+"\nName :"+name+"\nBalance : "+balance+"\nBranch : "+branch);
		
	}
}

public class q51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		Account[] arr = new Account[1];
		while(flag) {
			System.out.println("Create Account press : 1\nDisplay Balace press : 2\nDisplay Total Bank Balance press : 3\nExit press : 4");
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1:
					System.out.print("Enter No of Customers : ");
					int no = sc.nextInt();
					arr = new Account[no];
					for (int i = 0; i < arr.length; i++) {
						System.out.print("Enter type of Account : \nSaving press : (1)\nCurrent : (2)\nEnter your choice : \n");
						int type = sc.nextInt();
						if(type != 1 && type != 2) {
							i--;
							System.out.println("Invalid Entry!!!");
							continue;
						}
						System.out.print("Enter "+(i+1)+" customer Details :\nAccount No. : ");
						int acc = sc.nextInt();
						System.out.print("Name : ");
						String name = sc.next();
						System.out.print("Branch : ");
						String branch = sc.next();
						System.out.print("Intial Amount : ");
						double balance = sc.nextDouble();
						if(type == 1) {
							
							if(balance <5000) {
								System.out.println("Insufficient Amount!!!\nAmount should be Rs. 5000 or more for Savings\nEnter details again");
								i--;
								continue;
							}
							arr[i] = new SavingAcc(acc, name, balance, branch);
							continue;
						}
						if(type == 2) {
							
							if(balance <1000) {
								System.out.println("Insufficient Amount!!!\nAmount should be Rs. 1000 or more for Current\nEnter details again");
								i--;
								continue;
							}
							arr[i] = new CurrentAcc(acc, name, balance, branch);
							continue;
						}	
					}
					break;
			case 2:
									
						for(Account i : arr) {
							i.display();
							System.out.println("\n");
						}
						break;
			case 3:
				
					System.out.println("Total Bank Amount : "+Account.total+"\n");
					break;
			case 4:
					flag = false;
					break;
			}
		}
		sc.close();
	}
}