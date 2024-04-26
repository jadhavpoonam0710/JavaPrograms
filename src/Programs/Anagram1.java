package Programs;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		String s1="Listen";
		String s2="Silent";
		
		String a1=s1.toLowerCase();
		String a2=s2.toLowerCase();
		
		if(a1.length()==a2.length())
		{
			char ch1[]=a1.toCharArray();
			char ch2[]=a2.toCharArray();

			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 if(Arrays.equals(ch1,ch2))
			 {
				 System.out.println("String is anagram");
			 }
			 
			 else
			 {
				 System.out.println("String is not anagram");
			 }
		}
      
	}

}
