package oct2;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteUsingNio {

	public static void main(String[] args) throws IOException {
		FileOutputStream fis = 
				new FileOutputStream("E://cdac20//dir//my.txt");
		FileChannel channel = fis.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(8);
		String s = "This is some text to write.";
		for(int i=0;i<s.length();) {
			for(int j=0;j<buffer.limit() && i<s.length();j++,i++) {
				buffer.put((byte)s.charAt(i));
			}
			buffer.flip();
			channel.write(buffer);
			buffer.clear();
		}
		channel.close();
		
		System.out.println("success");
	}

}

