package com.simplilearn.email;


	import java.util.Scanner;


	public class EmailValidation {
		
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				//Storing list of email id in an array
				 String Array[]= {"joi@gmail.com",
						          "sano4@gmail.com",
						          "varsha2@gmail.com",
						           "sami@gmail.com",
						           "maha@gmail.com",
						           "rose333@gmail.com",
						           "jana@96@gmail.com",
						           "bhary@gmail.com",
						           "zahir@gmail.com",
						           "sithi@gmail.com",
						           "limi@gmail.com"};
						
				 System.out.println("Enter the EmailId to search");
				//Get input from user to search emailid
			   String s=sc.next();
			   //Validating email
			      
			      for(int  i=0;i<Array.length;i++)
			       {
			    	  
			       if(Array[i].equals(s))
			       {
			       
			    	   System.out.println("EmailId validated");
			       
			       }
			      else {
			    	  System.out.println("Invalid email");
			      }
			       }
			    
			       
			       
			       
			       
			
				 
				        
				        

			       
			       }

			
	}


