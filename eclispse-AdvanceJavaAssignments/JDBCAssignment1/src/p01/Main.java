/* 18. Create an event driven program as follows to manage the daily expenses
a. create a table expense with columns expense_id, item, price, purchase_date to store expense record.
b. create a java bean class named dto.Expense with properties expenseId, item, price, purchaseDate.
c. create a dao interface dao.ExpenseDao that has method declaration for insert, update, delete and select the expense record.
d. create a dao class dao.ExpenseDaoImple that implements ExpenseDao and overrides all methods.
e. create p01.Main class to demonstrate CRUD operation written in DAO class.
*/

package p01;

import java.util.Scanner;
import p01.dao.ExpenseDao;
import p01.dao.ExpenseDaoImple;
import p01.dto.Expense;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ExpenseDao e1 = new ExpenseDaoImple();
		while(true) {
			
			System.out.println("1 : Show Expense list");
			System.out.println("2 : Insert Expense record");
			System.out.println("3 : Update Expense record");
			System.out.println("4 : Delete Expense record");
			System.out.println("0 : Exit");
			int choice = sc.nextInt();
			switch(choice) {
				case 0:
						System.exit(0);
				case 1:
					e1.showExpense();
					break;
				case 2:
					System.out.print("Enter Details :\nExpense Id : ");
					int id = sc.nextInt();
					System.out.print("Item Name : ");
					String item = sc.next();
					System.out.print("Price : ");
					float price = sc.nextFloat();
					System.out.println("Date of Purchase (yyyy-mm-dd) : ");
					String date = sc.next();
					Expense ex = new Expense(id,item,price,date);
					e1.insertData(ex);
					break;
					
				case 3:
					System.out.print("Enter Details to Update :\nExpense Id : ");
					id = sc.nextInt();
					System.out.print("Item Name : ");
					item = sc.next();
					System.out.print("Price : ");
					price = sc.nextFloat();
					System.out.println("Date of Purchase (yyyy-mm-dd) : ");
					date = sc.next();
					ex = new Expense(id,item,price,date);
					e1.updateData(ex);
					break;
					
				case 4:
					System.out.println("Enter Expense Id to delete Record : ");
					id = sc.nextInt();
					e1.deleteData(id);
					break;
					
			}
		}

	}

}
