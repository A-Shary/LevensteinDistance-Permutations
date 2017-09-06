/*
 * Author:ºîÏşÓåShary
 * Date:2017/9/6 23:53
 * */

package timeComplexity;

import java.util.Arrays;

	public class timeComplexitymain {
		
		/*
		 * ´òÓ¡Êı×é£º
		 * */
		public static void printArray(int arr[]) 
		{
			System.out.print("[");
			for (int i = 0; i < arr.length; i++) 
			{
				if (i != arr.length-1) {
					System.out.print(arr[i] + ",");
				}else {
					System.out.println(arr[i] + "]");
				}
			}
		}

		public static void main(String[] args)
	{
		//Test1:
		System.out.println("Test1: ");
		int arr[] = {1,2,1};
		System.out.println("\nBefore Sorting: ");
		printArray(arr);
		System.out.println("\nAfter Sorting: " );
		Test1 sort = new Test1();
		System.out.println(sort.permutation(arr));
		
			
			
		//Test2
		System.out.println("\n"+"Test2:\n");
		Test2 min = new Test2();
		System.out.println("The shortest distance is:" + min.getDistance("ddnce s my thing","dance is my favorite thing")+"\n");
	    System.out.println("The shortest distance is:" + min.getDistance("happns", "happiness")+"\n");
	    System.out.println("The shortest distance is:" + min.getDistance("", "Reading")+"\n");
			
	}

}
