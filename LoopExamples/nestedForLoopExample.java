/*
 Question - Write a program using Nested For Loop to print the below values.
 0
 0.1
 0.2
 1
 1.1
 1.2
 2
 2.1
 2.2
  
 */

package LoopExamples;

public class nestedForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=2;i++)
		{
			System.out.println(i);
			for (int j=1;j<=2;j++)
			{
				System.out.println(i+"."+j);
			}
		}

	}

}
