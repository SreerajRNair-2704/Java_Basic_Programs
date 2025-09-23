/*
 Question - Write a program to print the below pattern.
 
*	
*	*
*	*	*
*	*	*	*	
   
*/

package PatternPrinting;

public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=0;i<4;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print("*" +"\t");
				
			}
			System.out.println("");
		}

	}

}
