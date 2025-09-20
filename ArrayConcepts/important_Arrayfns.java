//Important array functions

package ArrayConcept;

import java.util.Arrays;

public class important_Arrayfns {
  public static void main(String[] args) {
    //Arrays.toString()
		int arr[] = { 2, 6, 1, 4, 9 };
		System.out.println(Arrays.toString(arr)); //Arrays.toString() converts array to a string

    //Arrays.copyOf()
		int abc[] = Arrays.copyOf(arr, 1); //Arrays.copyOf() creates a copy of a specific array with specified number of elements to be copied
		int mno[] = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(mno));

    //Arrays.copyOfRange()
		int efg[] = Arrays.copyOfRange(arr, 1, 4); //Arrays.copyOfRange() creates a copy of an array from a particular index to a particular index.
		System.out.println(Arrays.toString(efg)); //Prints elements from index 1 till 4 ;  That is output will be [6,1,4]

    //Arrays.sort()
		Arrays.sort(arr); //Arrays.sort() sorts an array
		System.out.println(Arrays.toString(arr));

    //Arrays.binarySearch()
		int search_val = Arrays.binarySearch(arr,4); //Arrays.binarySearch() searches an element from a sorted array and returns the index number of the element if found.
		System.out.println(search_val);

    int invalid_search_val = Arrays.binarySearch(arr,10);
		System.out.println(invalid_search_val); //If the index not found, it returns - (insertion point) - 1, where the insertion point is where the key would fit in a sorted array.

    //Arrays.equals()
		int pqr[] = Arrays.copyOf(arr,5);
		System.out.println(Arrays.equals(arr, pqr)); //Compares two arrays and returns true if elements are same and placed at same index.
		System.out.println(Arrays.equals(arr, abc)); // Even if elements are same , but index numbers are different then returns false.

    //Arrays.fill()
		int jkl[] = new int[5];
		Arrays.fill(jkl, 3); //fills a new array with same number in all the indexes/mentioned array size.
		System.out.println(Arrays.toString(jkl));

    //Arrays.hashCode()
		System.out.println(Arrays.hashCode(arr)); //Creates a unique hash number for the array. {hashing is for ensuring security}

  }
}

    
    
