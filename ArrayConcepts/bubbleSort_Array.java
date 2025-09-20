/*

Write a program to sort the below array without using any Array functions.

array = {2,6,1,4,9}

*/
package ArrayConcept;

public class bubbleSort_Array {

	public static void main(String[] args) {
		int arr[] = {2,6,1,4,9};
		int temp;
		for (int i=0;i<5;i++) {
			for (int j=i+1;j<5;j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int k=0;k<5;k++) {
			System.out.print(arr[k]+"\t");
		}
	}

}
