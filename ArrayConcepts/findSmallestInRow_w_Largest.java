/*
Write a program to find the smallest number in the row with largest number in the matrix --

2	4	5
3	4	7
1	2	9

*/

package ArrayConcept;

public class findSmallestInRow_w_Largest {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int largest_val = arr[0][0];
		int max_Row = 0;
		
		//Find the column with smallest value first.
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j] > largest_val) {
					largest_val = arr[i][j];
					max_Row = i;					
				}
			}
		}
		System.out.println("Largest number in the matrix is "+largest_val);
		System.out.println("Largest number is appearing in row " + max_Row);
		
		//As we got the column with largest value as max_Row, search for the smallest number in max_Row.
		int smallest_val = arr[max_Row][0];
		for (int k=0;k<3;k++) {
			if(arr[max_Row][k] < smallest_val) {
				smallest_val = arr[max_Row][k];
			}
		}
		System.out.println("Smallest number in the row with largest number in the matrix is " +smallest_val);

	}

}
