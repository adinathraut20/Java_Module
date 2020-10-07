// Map 


//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String,Integer> arr = new HashMap<String,Integer>();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            if(!arr.containsKey(name)){
                arr.put(name,phone);
            }
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(arr.containsKey(s)){
                System.out.println(s+"="+arr.get(s));
            }else{
                System.out.println("Not found");
            }
		}
	}
}



