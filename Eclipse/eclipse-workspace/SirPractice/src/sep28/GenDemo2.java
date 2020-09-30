package sep28;

class MyGen<T>{
	T t;
	MyGen(T t){
		this.t = t;
	}
	void show() {
		System.out.println(t);
	}
}

public class GenDemo2 {

	public static void main(String[] args) {
		MyGen<Integer> i = new MyGen<Integer>(12);
		i.show();
		MyGen<String> j = new MyGen<String>("ram");
		j.show();

	}

}
