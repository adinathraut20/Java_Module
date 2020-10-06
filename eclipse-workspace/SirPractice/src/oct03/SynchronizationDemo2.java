package oct03;

public class SynchronizationDemo2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		PrintMessage1 pm = new PrintMessage1();
		MyRunnable4 m = new MyRunnable4(pm);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread().getName()+" finished");   
	}

}
class MyRunnable4 implements Runnable{
	PrintMessage1 p;
	MyRunnable4(PrintMessage1 p){
		this.p = p;
	}
	@Override
	public void run() {                      
		System.out.println(Thread.currentThread().getName()+" started");
		
		synchronized (p) {
			p.printMsg();
		}
			
		System.out.println(Thread.currentThread().getName()+" finished");
	}                                       
}

class PrintMessage1{
	void printMsg() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(200);           
			}catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
