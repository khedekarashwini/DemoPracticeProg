package com.demo.practice;

import java.util.Scanner;

public class DemoReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int no,reminder, reverse = 0;
         
	      System.out.println("Enter an integer to reverse");
	      Scanner in = new Scanner(System.in);
	      no = in.nextInt();
	         
	      while(no != 0)
	      {
	          reminder = no%10;
	          reverse = reverse*10 + reminder;
	          no = no/10;
	      }
	       
	      System.out.println("Reverse of the number is " + reverse);
	  
	}

}
