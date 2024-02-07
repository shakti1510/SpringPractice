package com.jsp.spring.FirstSpringProj;

public class Faculty {
	private Student s1;
	private Student s2;
	private Student s3;
	
	public Student getS1() {
		return s1;
	}

	public void setS1(Student s1) {
		this.s1 = s1;
	}

	public Student getS2() {
		return s2;
	}

	public void setS2(Student s2) {
		this.s2 = s2;
	}

	public Student getS3() {
		return s3;
	}

	public void setS3(Student s3) {
		this.s3 = s3;
	}

	public void findGuy() {
		System.out.println("the First Guy is:"+s1.getsName());
		System.out.println("the Second Guy is:"+s2.getsName());
		System.out.println("the Third Guy is:"+s3.getsName());
	}
}
