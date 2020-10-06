package oct03;

public class SynchronizationDemo3 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		PrintMessage2 pm = new PrintMessage2();
		MyRunnable5 m = new MyRunnable5(pm);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread().getName()+" finished");   
	}

}
class MyRunnable5 implements Runnable{
	PrintMessage2 p;
	MyRunnable5(PrintMessage2 p){
		this.p = p;
	}
	@Override
	public void run() {                      
		System.out.println(Thread.currentThread().getName()+" started");
		p.printMsg();
		System.out.println(Thread.currentThread().getName()+" finished");
	}                                       
}

class PrintMessage2{
	void printMsg() {
		System.out.println("started printing ====================  ");
		synchronized (this) {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(200);           
				}catch (InterruptedException e) {
				
				}
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
}
