package Programs;

import java.util.Arrays;
import java.util.List;

public class MatrixUsingList {

	public static void main(String[] argv) throws Exception
	    {
	 
	        // Try block to check for exceptions
	        try {
	 
	            // Creating Arrays of String type
	            Object a[][]= {{1,1,1},
	            		       {1,1,1},
	                            {1,1,1}};
	                
	                                  
	               	 
	            // Getting the list view of Array
	            List<Object> list = Arrays.asList(a);
	 
	            // Printing all the elements in list object
	            System.out.println("The list is: " + list);
	        }
	 
	        // Catch block to handle exceptions
	        catch (NullPointerException e) {
	 
	            // Print statement
	            System.out.println("Exception thrown : " + e);
	        }
	    }

}
