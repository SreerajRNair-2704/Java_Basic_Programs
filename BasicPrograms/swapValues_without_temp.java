/* 
 
 Write a program to swap values of two variables without using a temporary variable.
   
 */

package BasicPrograms;

public class swapValues_without_temp {

	public static void main(String[] args) {
		int i =10;
		int j = 20;
		System.out.println("Value of variable i before swapping is "+i);
		System.out.println("Value of variable j before swapping is "+j);
		
		//Swap variables
		i = i+j;
		j = i-j;
		i = i-j; 
		System.out.println("Value of variable i after swapping is "+i);
		System.out.println("Value of variable j after swapping is "+j);

	}

}
