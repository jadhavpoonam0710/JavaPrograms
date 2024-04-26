package ArrayListProgram;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("TestNG");
		
		arr1.remove(0);
		System.out.println(arr1);
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("Java");
		arr2.add("Selenium");
		arr2.add("TestNG");
		
		arr2.removeAll(arr1);
		System.out.println(arr2);
		
	}

}
