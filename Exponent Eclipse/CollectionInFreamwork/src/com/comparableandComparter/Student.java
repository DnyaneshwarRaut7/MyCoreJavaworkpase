package com.comparableandComparter;

public class Student implements Comparable<Student> {

	int sid;

	String sname;
	String saddress;

	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}

	@Override
	public int compareTo(Student o) {

		if (this.sid > o.sid)
		{
			return 1;
		}
		else if (this.sid == o.sid) 
		{

			return 0;
		}
		else
		{

			return -1;

		}
	}
}
