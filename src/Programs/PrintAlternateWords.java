package Programs;

import java.util.HashMap;

public class PrintAlternateWords {

	public static void main(String[] args) {
		String s="Java Selenium TestNG Cucumber";
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i+=2)
		{
		// System.out.println(str[i]);
		 
		 HashMap<String,Integer> hm=new HashMap<String,Integer>();
		 
		 for(String s1:str)
		 {
			 if(hm.containsKey(s1))
			 {
				 int count=hm.get(s1);
				 hm.put(s1, count++);
			 }
			 else
			 {
				 hm.put(s1, 1); 
			 }
			 
			
		 }
		 System.out.println("Occurence of alternate word is:" + hm);
		 
		}
	}

}
