/*
Write a sample program to create an single dimensional with instructions below
1)Array of 5 elements.
2)Insert elements into the array.
3)Print elements in each index
4)Demonstrate difference between static memory allocation and dynamic memory allocation.
*/
package ArrayConcept;

public class demoArray {

	public static void main(String[] args) {
		// Static memory allocation method
		int arr[]=new int[5];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		for (int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println(); //For breaking line
				
		//Dynamic memory allocation method
		int dyn_arr[] = {1,3,5,7,9};
		for (int j=0;j<dyn_arr.length;j++)
		{
			System.out.print(dyn_arr[j]+"\t");
		}
	}
}

	
	
	
	
