package com.ilinks.practice.java8;

interface Student{
	
	public void studentData(String name) throws Exception;
}

public class LambdaExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = name -> {
			throw new Exception("Lambda Exception");
		};
		
		try {
			student.studentData("Pradeep");
		}catch(Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}

	}

}
