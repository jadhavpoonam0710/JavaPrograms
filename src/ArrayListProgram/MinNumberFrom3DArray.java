package ArrayListProgram;

public class MinNumberFrom3DArray {

	public static void main(String[] args) {
		
		int a[] []= {{2,3,4},{4,5,6},{7,1,8}};
		
		int min=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			
			if(a[i][j]<min)
			{
			  min=a[i][j];	
			}
			}
		 
		}
		
		System.out.println("Minimum number from array is" + min);

	}

}
