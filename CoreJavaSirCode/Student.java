package com.cdac.java;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int m1,m2,m3;
	public Student(int id, String name,int m1,int m2,int m3){
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	@Override
	public String toString() {
		return id+" "+name+" "+m1+" "+m2+" "+m3;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
//		this - obj1
//		obj - obj2
		System.out.println("Equals called!");
		if(obj == null)
			return false;
		if( !(obj instanceof Student))
			return false;
		Student s = (Student) obj;
		if(s.name == name && s.id == id && s.m1 == m1 && s.m2 == m2 && s.m3 == m3)
			return true;
		return false;
	}

	@Override
	public int compareTo(Student o) {
		//first object - calling object - this
		//second object - o
		
		if(this.id > o.id)
			return 1;
		if(this.id < o.id)
			return -1;
		return 0;
	}
}