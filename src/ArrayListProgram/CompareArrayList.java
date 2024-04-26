package ArrayListProgram;

import java.util.ArrayList;

public class CompareArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("TestNG");
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Selenium");
		arr2.add("TestNG");
		
		System.out.println(arr1.equals(arr2));
		
		arr2.add("RestAssured");
		
		System.out.println(arr1.equals(arr2));
		
	}

}
