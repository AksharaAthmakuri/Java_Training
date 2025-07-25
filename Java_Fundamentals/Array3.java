package arraysjava;
public class Task103 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,3,6,5};
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			System.out.println(arr[j]);
		}
	}
}
