/*
 Question - Write a program to print the below pattern.
 
1	2	3	4	
5	6	7	
8	9	
10	
   
 */

package PatternPrinting;

public class numberPyramidA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int k=1;
		for (i=0;i<4;i++)
		{
			for (j=0;j<4-i;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			System.out.println("");
		}
	}

}
