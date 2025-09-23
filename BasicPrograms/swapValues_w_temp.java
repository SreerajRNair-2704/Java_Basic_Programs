/* 
 
 Write a program to swap values of two variables using a temporary variable.
   
 */

package BasicPrograms;

public class swapValues_w_temp {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("Value of variable i before swapping is "+i);
		System.out.println("Value of variable j before swapping is "+j);
		
		//Swap variables
		int temp = i;
		i = j;
		j = temp;
		System.out.println("Value of variable i after swapping is "+i);
		System.out.println("Value of variable j after swapping is "+j);

	}
}
