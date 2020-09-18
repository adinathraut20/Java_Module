/* 9. Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.
*/


import java.util.Scanner;

class DayConverterAdvance {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting Day From 1 Jan, 2020 \nEnter No. of Days : ");
		int days = sc.nextInt();
		int year = days/365;
		int dayM = days%365;
		if(dayM == 0){
			dayM+=1;
		}
		else{
			dayM+=1;
		}
		year = 2020 + year;
		boolean leapFlag = false;
		if( year%400 == 0 || ( year%100 != 0 && year%4 == 0)){
			dayM+=1;
			leapFlag = true;
		}
		String []arr = {"Janurary","Feburary","March","April","May","June","July","August","September","October","November","December"};
	//	System.out.print(arr[0]);
		int month=0,dayD=dayM;
		int date=1;
		for(int i=0;i<arr.length;i++){
			if(i == 1){
				if(leapFlag == true){
					if(dayM <= 29){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 29;
				}
				else{
					if(dayM <= 28){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 28;
				}
			}
			else if(i <= 6 ){
				if(i%2 == 0){
					if(dayM <= 31){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 31;
				}
				else{
					if(dayM <= 30){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 30;
				}
			}
			else{
				if(i%2 != 0){
					if(dayM <= 31){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 31;

				}
				else{
					if(dayM <= 30){
						date = dayM;
						month = i;
						break;
					}
					dayM -= 30;
				}		
			}
		}
		System.out.println("The Date Will be : "+date+" "+arr[month]+", "+year);
	}
}
		
