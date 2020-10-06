package oct2;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		MyThread th = new MyThread();           // new state
		th.start();                        // runnable
		System.out.println("main finished");   
	}

}
class MyThread extends Thread{
	@Override
	public void run() {                       // running state
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}                                       // dead state
}
