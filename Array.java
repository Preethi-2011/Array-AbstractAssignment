public class OorEArray{
	public static void main(String[]args) {
		int[] arr= {5,6,7,8,9,10};
		for(int i=0;i<arr.length;i++)
		{
		 if(arr[i]%2==0) {
			 System.out.println("Even numbers:" +arr[i]);
		 }
		 else {
			 System.out.println("Odd numbers:" +arr[i]);
		 }
		}
	}
}
