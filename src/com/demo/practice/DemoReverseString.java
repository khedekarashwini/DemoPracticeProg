package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoReverseString {

	private static final List<?> c = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//***************Reverse string using array**************
	/*String str="My name is Ashwini";
	String str1 = "";
	String [] a=str.split(" ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+"");
	}
	System.out.println(" ");
	for (int i = a.length-1; i >=0; i--) {
		str1=str1+a[i]+" ";
		}
	System.out.print(str1);*/
		
		
		//***********2nd way using charAt()************
		/*String original;
		String rev=" ";
		System.out.println("Enter your string=");
		Scanner sc=new Scanner(System.in);
		original=sc.next();
		int len=original.length();
		for (int i=len-1; i >=0; i--) 
		{
			rev=rev+original.charAt(i);
		}
	System.out.println(rev);
	}*/
	
//****************Using Reverse method of stringBuffer************
    /* String original;
     String rev="";
     System.out.println("Enter your string=");
     Scanner sc=new Scanner(System.in);
     original=sc.next();
     StringBuffer sb=new StringBuffer(original);
     rev=sb.reverse().toString();
     System.out.println("Original string is="+original);
     System.out.println("reverse string is="+rev);*/
	
//*********************using tocahrArray()*************
	  /* String str="ashwini";
	   System.out.println("Original string is="+str);
	  String rev=" ";
	   char[] ch=str.toCharArray();
	   int len=ch.length;
	   for (int i=len-1; i>=0; i--) 
	   {
		   rev=rev+ch[i];
		
	   }
	   System.out.print("Reverse string is="+rev);*/
		
		//*********************using List Iterator******************
		String str="Ashwini Baburo Khedekar";
		char[] ch=str.toCharArray();
		List<Character> lst=new ArrayList<>();
	  for (char c : ch) 
	   
		lst.add(c);
		Collections.reverse(lst);
	  ListIterator ltr= lst.listIterator();
	 while(ltr.hasNext())
		 System.out.print(ltr.next());
      
	}
	
	
}