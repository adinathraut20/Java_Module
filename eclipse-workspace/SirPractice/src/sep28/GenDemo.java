package sep28;

class MyGen1<T,P>{
	T t;
	P p;
	MyGen1(T t,P p){
		this.t = t;
		this.p = p;
	}
	void show() {
		System.out.println(t+" "+p);
	}
}

public class GenDemo {

	public static void main(String[] args) {
		MyGen1<Integer,String> i = 
				new MyGen1<Integer,String>(12,"ram");
		i.show();
		MyGen1<Float,Double> j = 
				new MyGen1<Float,Double>(12F,45.5);
		j.show();

	}

}
