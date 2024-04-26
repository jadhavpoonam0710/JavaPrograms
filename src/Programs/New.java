package Programs;

public class New {
	
	//public class A2b3c4 {

		public static void main(String[] args)
		
		{
			
	        String x = "a2b3c4";
	        
	        String letters[] = x.split("[0-9]+");
	        String numbers[] = x.split("[a-z]+");
	        
	        int num[] = new int[numbers.length];
	        int k = 0;
	        
	        for(int i = 0 ; i < numbers.length ; i++)
	        {
	            if(!numbers[i].equals("")) 
	            {
	                num[k] = Integer.parseInt(numbers[i]);
	                k++;
	            }
	        }
	        for(int i = 0 ; i < letters.length ; i++) 
	        {
	          for(int j = 0 ; j < num[i] ; j++)
	            {
	                System.out.print(letters[i]);
	            }
	        }
	    }
	//}


}
