package Programs;

import java.util.*;

public class Demo1 
{ 
	public static void main(String[] args) { 
		String str = "Jacobsons poonam jadhav poonam"; 
		
		String s[]=str.split(" ");
		for(int i = 0; i<=s.length-1 ; i=i+2){ 
			HashMap<String,Integer> hm=new HashMap<String,Integer>();
			
			for(String b:s)
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
}