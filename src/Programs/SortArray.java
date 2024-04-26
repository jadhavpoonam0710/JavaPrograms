package Programs;

public class SortArray {

	public static void main(String[] args) {
		int arr[]= {20,10,40,80,15};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Elements from array in ascending order is:" + " ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
				
	}

}
