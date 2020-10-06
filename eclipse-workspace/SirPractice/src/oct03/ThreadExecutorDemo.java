package oct03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorDemo {

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(4);
		
		for(int i=1;i<=7;i++) {
			MyAdder m = new MyAdder();
			e.execute(m);
		}
		
		e.shutdown();

	}

}
class MyAdder implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		int sum = 1;
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum += i;
		}
		
		System.out.println("sum = "+sum);
		System.out.println(Thread.currentThread().getName()+" finished");
	}
}
