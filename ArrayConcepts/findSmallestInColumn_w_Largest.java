/*
Write a program to find the smallest number in the column with largest number in the matrix --

2	4	5
3	4	7
1	2	9

*/

package ArrayConcept;

public class findSmallestInColumn_w_Largest {

	public static void main(String[] args) {
		int arr[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int largest_val = arr[0][0];
		int max_Col = 0;
		
		//Find the column with smallest value first.
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (arr[i][j] > largest_val) {
					largest_val = arr[i][j];
					max_Col = j;					
				}
			}
		}
		System.out.println("Largest number in the matrix is "+largest_val);
		System.out.println("Largest number is appearing in column " + max_Col);
		
		//As we got the column with largest value as max_Col, search for the smallest number in max_Col.
		int smallest_val = arr[0][max_Col];
		for (int k=0;k<3;k++) {
			if(arr[k][max_Col] < smallest_val) {
				smallest_val = arr[k][max_Col];
			}
		}
		System.out.println("Smallest number in the column with largest number in the matrix is " +smallest_val);

	}

}
