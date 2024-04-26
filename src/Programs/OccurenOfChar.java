package Programs;

import java.util.Scanner;

public class OccurenOfChar {

	public static void main(String[] args) {
		
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter String");
  String a=sc.nextLine();
  
				//String str = "abracadabra-banana";
				//System.out.println(str);
				// count occurrence 
				int count = 0;
			    for (int i=0; i < a.length(); i++)
			    {
			        if (a.charAt(i) == a.charAt(i))
			        {
			             count++;
			        }
			        
			        else
			        {
			        	count=1;
			        }
			    }
				System.out.println("occurrence of each character: "+count);
			}
		

	}


