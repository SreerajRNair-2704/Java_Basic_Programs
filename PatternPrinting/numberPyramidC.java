/*
 Question - Write a program to print the below pattern.
 
1	
1	2	
1	2	3	
1	2	3	4	
   
 */
package PatternPrinting;

public class numberPyramidC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for (i=1;i<=4;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
	}

}
