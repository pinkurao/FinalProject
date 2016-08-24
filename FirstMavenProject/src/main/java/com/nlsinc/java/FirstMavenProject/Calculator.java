package com.nlsinc.java.FirstMavenProject;

public class Calculator {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public int sub(int a, int b){
		return a-b;
	}
	
	public int mul (int a, int b){
		return a*b;
	}
	
	public int div(int a, int b){
		return a/b;
	}
	
	public void ifElse(int a , int b){
		
		if(a<b){
			System.out.println("a less than b");
		}
		else if(a>b){
			System.out.println("b is grtaer than a");
		}
		else{
			System.out.println("a==b");
		}
		
	}
	
	public void infinte(){
		while(true);
	}

	
	

}
