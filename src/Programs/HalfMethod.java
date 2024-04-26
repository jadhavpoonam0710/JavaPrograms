package Programs;

public class HalfMethod {
	
	
		public static void main(String[] args) 
		{
			String a="AHCECLaLXO";
			char [] b=a.toCharArray();
			
			for(int i=0;i<a.length();i++)
			{
				if(i%2!=0)
				{
					System.out.print(b[i]);
				}
			}

	}


}
