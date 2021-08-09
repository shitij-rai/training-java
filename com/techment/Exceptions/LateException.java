package com.techment.Exceptions;

class StudentLateException extends Exception{
	
	public StudentLateException(String msg) {
		super(msg);
	}
}

class StudentLogin{
	
	void login(int time) throws StudentLateException{
		
		if(time>9) 
			throw new StudentLateException("You are marked absent.");
		else
			System.out.println("You are marked present.");
	}
}

public class LateException {

	public static void main(String[] args) {

		StudentLogin student = new StudentLogin();
		
		try {
			student.login(11);
		}
		catch(StudentLateException e) {
			System.out.println(e.getMessage());
		}
	}

}
