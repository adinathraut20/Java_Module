import java.util.*;

class VirusScan{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];

		for(int i=0;i<n;i++){
			str[i]=sc.next();
		}
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<str[i].length()-1;j++){
				if(str[i].charAt(j) == '1'  && str[i].charAt(j+1) == '9'){
					count++;
					break;
				}
			}
		}
		System.out.println("Total Virus Found : "+count);
	}
}

			
