package oct2;

public class ThreadDemo5 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" started");
		PrintMessage pm = new PrintMessage();
		MyRunnable3 m = new MyRunnable3(pm);
		Thread th1 = new Thread(m);
		Thread th2 = new Thread(m);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread().getName()+" finished");   
	}

}
class MyRunnable3 implements Runnable{
	PrintMessage p;
	MyRunnable3(PrintMessage p){
		this.p = p;
	}
	@Override
	public void run() {                      
		System.out.println(Thread.currentThread().getName()+" started");
		p.printMsg();
		System.out.println(Thread.currentThread().getName()+" finished");
	}                                       
}

class PrintMessage{
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
