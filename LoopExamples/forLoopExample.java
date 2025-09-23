/*
 Question - Write a for a program with the below conditions-
 
 1)Value of i initially set to 0, loop till 20
 2)Incremented by 2
 3)When it reaches 16, print "value of i has now become 16."
  
 */

package LoopExamples;

public class forLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0;i<=20;i=i+2) {
			if (i==16)
				System.out.println("Value of i has now become " +i);
			else
				System.out.println(i);
		}
	}
}
