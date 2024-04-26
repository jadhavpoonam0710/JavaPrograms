package Programs;

public class ZeroAtFirst {

	public static void main(String[] args) {
		int a[]= {3,4,0,5,0,0};
		int temp=0;
		
		for(int i=0;i<a.length;i++)
	
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
			}
		}

	System.out.println("Elements of array after moving zero's at the start of array");
	for(int i=0;i<a.length;i++)
		
	{
	  System.out.print(a[i]);
	}
	}
	
	}
	

