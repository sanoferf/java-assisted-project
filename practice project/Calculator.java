package com.simplilearn.calculator;
import java.util.Scanner;


public class Calculator {
	public static void main(String args[])
	{
		int Output;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int  Firstnumber=in.nextInt();
		System.out.println("Enter Second Number");
		int  Secondnumber=in.nextInt();
		System.out.println("Enter the operation to be performed");
		char operator=in.next().charAt(0);
		
		switch(operator)
		{
		case '+':
		{
		Output=Firstnumber+Secondnumber;
		System.out.println(Firstnumber+ "+"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '-':
		{
		Output=Firstnumber-Secondnumber;
		System.out.println(Firstnumber+ "-"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '*':
		{
		Output=Firstnumber*Secondnumber;
		System.out.println(Firstnumber+ "*"+Secondnumber+ "=" +Output);
		break;
		}
		
		case '/':
		{
		Output=Firstnumber/Secondnumber;
		System.out.println(Firstnumber+ "/"+Secondnumber+ "=" +Output);
		break;
		}
			
		}
		
		}
		
			
		
	}
	          
	          
	     
	



