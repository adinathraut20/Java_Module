package ArrayQuestions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Hacker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		char [] ch = str.toCharArray();
		Arrays.sort(ch);
		
		 Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++){
			if(ch[i] == ' ') {
				continue;
			}
			if(!mp.containsKey(ch[i])) {
				mp.put(ch[i], 1);
				continue;
			}else {
				int y = mp.get(ch[i]) + 1;
				mp.put(ch[i], y);
				continue;
			}
				
		}
		char prevCh = ch[0];
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				continue;
			}
			if(prevCh == ch[i] && i>0) {
				continue;
			}
			else {
				System.out.print(ch[i]+":");
				for(int j=0;j<mp.get(ch[i]);j++) {
					System.out.print("*");	
				}
				prevCh = ch[i];
			}
			System.out.println("");
		}
			
		sc.close();
	}

}
