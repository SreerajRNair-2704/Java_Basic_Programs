/*
Write a program to find the largest number in the row with smallest number in the matrix --

2	4	5
3	4	7
1	2	9

*/

package ArrayConcept;

public class findLargestInRow_w_Smallest {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int smallest_val = arr[0][0];
		int min_Row = 0;
		
		//Find the column with smallest value first.
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j] < smallest_val) {
					smallest_val = arr[i][j];
					min_Row = i;					
				}
			}
		}
		System.out.println("Smallest number in the matrix is "+smallest_val);
		System.out.println("Smallest number is appearing in row " + min_Row);
		
		//As we got the row with smallest value as min_Row, search for the largest number in min_Row.
		int largest_val = arr[min_Row][0];
		for (int k=0;k<3;k++) {
			if(arr[min_Row][k] > largest_val) {
				largest_val = arr[min_Row][k];
			}
		}
		System.out.println("Largest number in the row with smallest number in the matrix is " +largest_val);

	}

}
