package Programs;

public class CountVowels {

	public static void main(String[] args) {
		
		String s="Poonam";
		int vcount=0;
		int cCount=0;
		
		for(int i=0;i<s.length();i++)
		{
		 char ch=s.charAt(i);
		 
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		 {
			 vcount++;
		 }
		 
		 else
		 {
			 cCount++;
		 }
		}
		
		System.out.println("Number of vowels are: " + vcount);
		System.out.println("Number of consonants[ are: " + cCount);
		
	
	}

}
