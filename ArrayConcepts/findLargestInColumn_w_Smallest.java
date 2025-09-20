/*
Write a program to find the largest number in the column with smallest number in the matrix --

2	4	5
3	4	7
1	2	9

*/

package ArrayConcept;

public class findLargestInColumn_w_Smallest {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int smallest_val = arr[0][0];
		int min_Col = 0;
		
		//Find the column with smallest value first.
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j] < smallest_val) {
					smallest_val = arr[i][j];
					min_Col = j;					
				}
			}
		}
		System.out.println("Smallest number in the matrix is "+smallest_val);
		System.out.println("Smallest number is appearing in column " + min_Col);
		
		//As we got the column with smallest value as min_Col, search for the largest number in min_col.
		int largest_val = arr[0][min_Col];
		for (int k=0;k<3;k++) {
			if(arr[k][min_Col] > largest_val) {
				largest_val = arr[k][min_Col];
			}
		}
		System.out.println("Largest number in the column with smallest number in the matrix is " +largest_val);
	}

}
