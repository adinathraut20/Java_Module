package p1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NioServer {

	public static void main(String[] args) throws IOException {
		ServerSocketChannel ssc = ServerSocketChannel.open();
		InetSocketAddress isa = new InetSocketAddress("localhost",1111);
		ssc.bind(isa);
		ssc.configureBlocking(false);
		Selector sel = Selector.open();
		ssc.register(sel, SelectionKey.OP_ACCEPT);
		System.out.println("Server Started ===================");
		while(true) {
			System.out.println("waiting for clients ");
			sel.select();
			Set<SelectionKey> selKeys = sel.selectedKeys();
			Iterator<SelectionKey> it = selKeys.iterator();
			while(it.hasNext()) {
				SelectionKey myKey = it.next();
				if(myKey.isAcceptable()) {
					SocketChannel sc = ssc.accept();		
					sc.configureBlocking(false);
					sc.register(sel, SelectionKey.OP_READ);
					System.out.println("client connected+++++++++");
				}else if(myKey.isReadable()) {
					SocketChannel sc = (SocketChannel)myKey.channel();
					ByteBuffer buf = ByteBuffer.allocate(256);
					sc.read(buf);
					String msg = new String(buf.array()).trim();
					
					System.out.println("=============================msg from client "+msg);
					if(msg.equals("bye")) {
						sc.close();
						System.out.println("a client disconnected");
					}
				}
				it.remove();
			}
		}
		
		
	}

}
