package oct01;

import java.io.*;



public class FileDemo9 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream f = 
				new FileInputStream("E:\\cdac20\\dir\\my.txt");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Employee emp = (Employee)o.readObject();
		
		System.out.println(emp); 
				
		f.close();
		System.out.println("success");
	}

}
