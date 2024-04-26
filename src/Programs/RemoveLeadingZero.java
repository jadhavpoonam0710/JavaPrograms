package Programs;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		String s="0000012345";
  
	StringBuffer sb=new StringBuffer(s);
	
	for(int i=0;i<s.length()&& s.charAt(i)=='0';i++)
	{
		
			sb.replace(0,i,"");
		
		
		System.out.println(sb.toString());
	}
	
	
	}
}
