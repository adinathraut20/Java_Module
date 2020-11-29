package p1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class NioClient {

	public static void main(String[] args) throws IOException {
		InetSocketAddress isa = new InetSocketAddress("localhost",1111);
		SocketChannel sc = SocketChannel.open(isa);
		sc.configureBlocking(false);
		System.out.println("connected to server");
		Scanner scan = new Scanner(System.in);
		String msg = "bye";
		do {
			System.out.println("Write message and enter");
			msg = scan.next();
			byte ar[] = msg.getBytes();
			ByteBuffer buf = ByteBuffer.wrap(ar);
			sc.write(buf);
			buf.clear();
			System.out.println("msg sent");
		}while(!msg.equals("bye"));
		sc.close();
	}

}
