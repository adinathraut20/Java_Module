package oct03;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); 
		
		Counter c1 = new Counter();
		Thread th1 = new Thread(c1);
		th1.setPriority(Thread.NORM_PRIORITY-3);
		
		Counter c2 = new Counter();
		Thread th2 = new Thread(c2);
		th2.setPriority(Thread.NORM_PRIORITY+3);
		
		th1.start();
		th2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		c1.flag = false;
		c2.flag = false;
		try {
			th1.join();
			th2.join();
		}catch (InterruptedException e) {
		
		}
		
		System.out.println("C1 = "+c1.count);
		System.out.println("C2 = "+c2.count);
	}

}
class Counter implements Runnable{
	long count;
	volatile boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			count++;
		}
	}
}
