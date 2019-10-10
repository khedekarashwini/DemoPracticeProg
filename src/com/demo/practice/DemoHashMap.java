package com.demo.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm= new HashMap<>();
		 System.out.println(hm.put(13, "Abc"));
		 hm.put(10, "ghc");
		 hm.put(15, "mnb");
		 hm.put(14, "axz");

	//*********1st way using Iterator**********
		 Set<Entry<Integer, String>> sc=hm.entrySet();
	      Iterator itr = sc.iterator();
          while(itr.hasNext())
          {
       	   System.out.println(itr.next());
          }
	    /* Collection<Integer> sc=hm.keySet();
	     Iterator itr=sc.iterator();
    
    while(itr.hasNext())
    {
   	 System.out.println(itr.next());
    }

    Collection<String> sc=hm.values();
    Iterator itr=sc.itr();

    
    while(itr.hasNext())
    {
   	 System.out.println(itr.next());
    }*/
//*********2nd way iterate hashmap using for loop*******
 /*for( Map.Entry<Integer, String> mtr:hm.entrySet())
 System.out.println("Key="+mtr.getKey()+
		 "values="+mtr.getValue());
	}
	for(Integer mtr:hm.keySet())
		System.out.println("keyset="+mtr);
		
	for(String mtr:hm.values())
		System.out.println("Values="+mtr);*/

//***********3rd using for Each Loop*************
    hm.forEach((k,v) -> System.out.println("Key = "
            + k + ", Value = " + v)); 
  //*****4th way Iterating over keys and searching for values (inefficient)***
    for (Integer name : hm.keySet())  
    { 
        // search  for value 
        String url = hm.get(name); 
        System.oust.println("Key = " + name + ", Value = " + url); 
    } 

}
}