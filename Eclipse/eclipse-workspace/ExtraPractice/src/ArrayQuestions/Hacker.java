package ArrayQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class KeyValue{
	public Character Key;
	public Integer Val;
	public KeyValue() {
		Key = 0;
		Val = 0;
		// TODO Auto-generated constructor stub
	}
	public KeyValue(Character key2, Integer value) {
		// TODO Auto-generated constructor stub
		Key = key2;
		Val = value;
	}
	public Character getKey() {
		return Key;
	}
	public void setKey(Character key) {
		Key = key;
	}
	public Integer getVal() {
		return Val;
	}
	public void setVal(Integer val) {
		Val = val;
	}
	
}

public class Hacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		char [] ch = str.toCharArray();
		
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
		ArrayList<KeyValue> fin = new ArrayList<KeyValue>();
		
		for (Entry<Character, Integer> e : mp.entrySet()) {
	
				if( Character.isAlphabetic(e.getKey())) {				
					fin.add(new KeyValue(e.getKey(),e.getValue()));
					//System.out.println(e.getKey()+"  "+e.getValue());					
					}
		}
			
		
		 Collections.sort(fin, new Comparator<KeyValue>() {
		        @Override
		        public int compare(KeyValue o1, KeyValue o2) {
		            return o1.getKey().compareTo(o2.getKey());
		        }});
		
		 for (int i = 0; i < fin.size(); i++) {
			
			 System.out.print(fin.get(i).getKey() + ":"); 
			    for (int j = 0; j < fin.get(i).getVal(); j++) {
			    		System.out.print("*");
			    }
			    System.out.println("");
		}
		
	
		sc.close();
	}

}
