package ArrayListProgram;

import java.util.ArrayList;

public class AddElementAtIndex {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("TestNG");
		
		System.out.println(arr1);
		
		arr1.add(1,"Cucumber");
		
		System.out.println(arr1);
		
	}

}
