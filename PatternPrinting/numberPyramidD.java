/*
 Question - Write a program to print the below pattern.
 
3	
6	9	
12	15	18

 */
package PatternPrinting;

public class numberPyramidD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int k=3;
		for (i=0;i<3;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(k+"\t");
				k=k+3;
			}
			System.out.println();
		}
	}

}
