package q9.StudentClass;

import java.util.Date;

public class Student {
	private int rno;
	private String name;
	private float marks;
	private Date time;
	
	public Student(int rno,String name,float marks,Date time){
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

	public Date getDate() {
		return time;
	}

	public void setDate(Date time) {
		this.time = time;
	}
	
}
