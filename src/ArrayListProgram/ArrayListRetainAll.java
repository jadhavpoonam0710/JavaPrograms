package ArrayListProgram;

import java.util.ArrayList;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("TestNG");
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Selenium");
		arr2.add("TestNG");
		arr2.add("Cucumber");
		
		arr2.retainAll(arr1);
		
		System.out.println(arr2);
	}

}
