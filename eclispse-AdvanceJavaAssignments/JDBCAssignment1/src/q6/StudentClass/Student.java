package q6.StudentClass;

public class Student {
	private int rno;
	private String name;
	private float marks;
	private long time;
	
	public Student(int rno,String name,float marks,long time){
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		this.time = time;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
}
