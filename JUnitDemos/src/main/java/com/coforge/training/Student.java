package com.coforge.training;

import com.coforge.Exceptions.GreatorValueException;

public class Student {
	public int sum(int marks1,int marks2,int marks3) throws GreatorValueException{
		if (marks1<0||marks2<0||marks3<0)
			return 0;
		if(marks1>100||marks2>100||marks3>100)
			throw new GreatorValueException("value greator then 100");
	return marks1+marks2+marks3;
	
		
	}
	


}
