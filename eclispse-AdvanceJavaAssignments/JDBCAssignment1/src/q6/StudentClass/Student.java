package q6.StudentClass;

public class Student {
	private int rno;
	private String name;
	private float marks;
	private String date;
	
	public Student(int rno,String name,float marks,String date){
		this.rno = rno;
		this.name = name;
		this.marks = marks;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
