/*
Write a sample program to create a multi-dimensional array with instructions below
1)3*3 matrix
2)Insert elements into the matrix.
3)Print elements in each index
4)Demonstrate difference between static memory allocation and dynamic memory allocation.
*/

package ArrayConcept;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// Static memory allocation method
		int arr[][]=new int[3][3];
		arr[0][0]=2;
		arr[0][1]=4;
		arr[0][2]=6;
		arr[1][0]=8;
		arr[1][1]=10;
		arr[1][2]=12;
		arr[2][0]=14;
		arr[2][1]=16;
		arr[2][2]=18;
				
		//Dynamic memory allocation method
		int ar[][]= {{1,3,5},{7,9,11},{13,15,17}};
		

		//Print all elements of the array arr
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(arr[i][j]);				
			}
		}
		System.out.println();
		
		//Print all elements of the array ar in a single line
		for (int k=0;k<3;k++) {
			for (int l=0;l<3;l++) {
				System.out.print(ar[k][l] + "\t");				
			}							
		}
		System.out.println();
		System.out.println();
		
		
		//Print in array format
		for (int m=0;m<3;m++) {
			for (int n=0;n<3;n++) {
				System.out.print(arr[m][n]+"\t");
			}
			System.out.println();
		}
	}

}
