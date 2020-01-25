/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int func(int[] arr, int size)
    {
    
        int range=0;
        Arrays.sort(arr);
        if(size%2!=0)range=1+(size/2);
        else
        range=size/2;
        for(int j=0 ; j<range ; j++)
        {
            if(arr[j]==arr[j+(size/2)])
            {
                return arr[j];
            }
        }
        return -1;
    }
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int i=0;i<testCases;i++)
	    {
	        int size = scan.nextInt();
	        int arr[] = new int[size];
	        for(int j=0;j<size;j++)
	        {
	            arr[j] = scan.nextInt();
	        }
	        if(size==1)System.out.println(arr[0]);
            else
            System.out.println(func(arr,size));
	    }
	}
}
