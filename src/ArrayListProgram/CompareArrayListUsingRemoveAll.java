package ArrayListProgram;

import java.util.ArrayList;

public class CompareArrayListUsingRemoveAll {

	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("TestNG");

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Selenium");
		arr2.add("TestNG");
		arr2.add("Cucumber");

		System.out.println("*********Before removing arr1 from arr2*******");
		arr2.removeAll(arr1);

		System.out.println(arr2);
		
		arr1.removeAll(arr2);

//		arr2.add("RestAssured");

		System.out.println(arr1);
		
		System.out.println("*********Before removing arr1 from arr2*******");
		arr2.removeAll(arr1);

		System.out.println(arr2);

	}

}
