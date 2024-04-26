package Programs;

import java.util.HashMap;

public class OccurenceWord {

	public static void main(String[] args) {
		
		String s="Java Selenium Java";
		
		String a[]=s.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(String b:a)
		{
			if(hm.containsKey((b)))
			{
				int count=hm.get(b);
				hm.put(b,++count);
			}
			else
			{
				hm.put(b,1);
			}
			
		}
		System.out.println("Occurence of words is: " + hm);
	}

}
