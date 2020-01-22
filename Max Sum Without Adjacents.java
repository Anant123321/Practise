/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int check(int arr[])
    {
        int inc=0,exc=0,sum=0;
        // inc means including the last index
        // exc means excluding the last index
        for(int i=0;i<arr.length;i++)
        {
            sum=Math.max(inc,exc+arr[i]);
            exc=inc;
            inc=sum;
        }
        return sum;
    }
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int z=0;z<testCases;z++)
	    {
	        int size = scan.nextInt();
	        int arr[] = new int[size];
	        for(int p=0;p<size;p++)
	        {
	            arr[p] = scan.nextInt();
	        }
	        System.out.println(check(arr));
	    }
	
	}
}
