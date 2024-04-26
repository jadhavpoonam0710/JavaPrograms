package Programs;

import java.util.HashMap;

public class OccurenceOfAlternateWords {

	public static void main(String[] args) {
		String s="Selenium Java Selenium Cucumber";
		String str[]=s.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<s.length();i=i+2)
		{
			for(String s1:str)
			{
				if(hm.containsKey(s1))
				{
					int count=hm.get(s1);
					hm.put(s1,count++);
					
				}
				else
				{
					hm.put(s1,1);
				}
			}					
		}
		
		System.out.println("Occurence of alternate words are:" +hm);

	}

}
