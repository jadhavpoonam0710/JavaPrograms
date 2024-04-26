package Programs;

import java.util.ArrayList;
import java.util.Collections;


public class MinAndMaxUsingCollection {

	public static void main(String[] args) {
		 ArrayList<Integer> arr = new ArrayList<Integer>(); 
		  
	        // Add elements in the list 
		 arr.add(3); 
		 arr.add(4); 
		 arr.add(15); 
		 arr.add(5); 
		 arr.add(100); 
	  
	        // Minimum in the list 
	        int minimum = Collections.min(arr); 
	  
	        // Maximum in the list 
	        int maximum = Collections.max(arr); 
	  
	        if (minimum == maximum) { 
	            System.out.println("All elements are equal"); 
	        } 
	        else { 
	            System.out.println("Min value of our list : "
	                               + minimum); 
	            System.out.println("Max value of our list : "
	                               + maximum); 
	        } 
	    } 

	}


