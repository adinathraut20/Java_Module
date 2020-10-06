package oct01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadUsingNio {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = 
				new FileInputStream("E://cdac20//dir//my.txt");
		FileChannel channel = fis.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(8);
		while(channel.read(buffer)>0) {
			buffer.flip();
			for(int i=0;i<buffer.limit();i++) {
				System.out.print((char)buffer.get());
			}
			buffer.clear();
		}
		channel.close();
		

	}

}
