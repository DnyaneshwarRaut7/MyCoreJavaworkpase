package com.inheritanceexample;

public class Student extends Object {

	private int rollno;
	private String name;
	private double mark;

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}
     public void setName(String name) {
    	 this.name= name;
    }
     public String getName() {
    	 return name;
     }
     
     public void setMark(double mark) {
    	 this.mark = mark;
     }
     public double getMark() {
    	 return mark;
     }
     
     @Override
    public String toString() {
       	return rollno+""+name+""+mark;
    }
 }
