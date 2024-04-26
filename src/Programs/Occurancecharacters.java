package Programs;

public class Occurancecharacters {

	public static void main(String[] args)
	{
		String s="poonam";
		int count=0;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			System.out.println("Occurence of" +  a[i] + " " + "is" + ":" +count);
			count=0;
			
		}
	    
	    

	}

	}


