package oct03;

public class ThreadCommunicationDemo {

	public static void main(String[] args) {
		Adder a = new Adder();
		Reader r = new Reader(a);
		
		Thread addr = new Thread(a);
		Thread read = new Thread(r);
		
		
		read.start();
		addr.start();
		
		
	}

}
class Adder implements Runnable{
	int sum;
	boolean flag = false;
	@Override
	synchronized public void run() {
		for(int i=1;i<=1000;i++) {
			sum += i;
			try {
				Thread.sleep(1);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		flag = true;
		notify();
		System.out.println("notified =============== ");
		
		// some extra code
		
		
	}
}
class Reader implements Runnable{
	Adder ad;
	public Reader(Adder ad) {
		this.ad = ad;
	}

	@Override
	public void run() {
		synchronized (ad) {	
		if(!ad.flag) {
			try {
				System.out.println("waiting to be notified ++++++");
				ad.wait();
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("sum = "+ad.sum);
		}
	}
}
