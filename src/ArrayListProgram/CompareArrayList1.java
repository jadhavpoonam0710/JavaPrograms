package ArrayListProgram;

import java.util.ArrayList;

public class CompareArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		
	  arr1.add("Java");
	  arr1.add("Selenium");
	  arr1.add("Cucumber");
	  
	  ArrayList<String> arr2=new ArrayList<String>();
		
	  arr2.add("Java");
	  arr2.add("Selenium");
	  arr2.add("Cucumber");
	  arr2.add("Cucumber");
	  
	  if(arr1.equals(arr2)==true)
	  {
		  System.out.println("Both ArrayList are equals");
		  
	  }
	  else
	  {
		  System.out.println("Both ArrayList are not equals");
		  
	  }
	  
	  

	}

}
