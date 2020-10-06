package oct2;

public class ThreadDemo2 {

	public static void main(String[] args) {
		System.out.println("main started");
		MyRunnable m = new MyRunnable();
		Thread th = new Thread(m,"child-1");           // new state
		th.start();                        // runnable
		System.out.println("main finished");   
	}

}
class MyRunnable implements Runnable{
	@Override
	public void run() {                       // running state
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);           // blocked state
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(i);
		}
	}                                       // dead state
}
