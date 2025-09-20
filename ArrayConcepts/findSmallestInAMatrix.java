/*
Write a program to find the smallest number in the below matrix --

2	4	5
3	4	7
1	2	9

*/

package ArrayConcept;

public class findSmallestInAMatrix {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int smallest_val = arr[0][0];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(arr[i][j]<smallest_val) {
					smallest_val = arr[i][j];
				}
			}
		}
		System.out.println("Smallest value of the matrix is "+smallest_val);
	}
}
