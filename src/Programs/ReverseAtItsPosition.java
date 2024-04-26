package Programs;

public class ReverseAtItsPosition {

	public static void main(String[] args) {
		String s="Selenium Java";
				
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			String b=a[i];
		 
			for(int j=b.length()-1;j>=0;j--)
			{
				System.out.print(b.charAt(j));
			}
		}
	}
	}



