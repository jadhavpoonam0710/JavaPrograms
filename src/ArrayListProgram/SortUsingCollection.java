package ArrayListProgram;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingCollection {

	public static void main(String[] args) {
		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("Java");
		arr1.add("Selenium");
		arr1.add("Cucumber");
		
		Collections.sort(arr1);
		System.out.println(arr1);
		

	}

}
