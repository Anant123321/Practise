/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int check(int []arr, int target)
    {
        int sum=0,len=arr.length;
        for(int i=0,j=len-1;i<j-2;)
        {
            int l = i+1;
            int r = j-1;
            while(l<r)
            {
                int tempSum = arr[l] + arr[r] + arr[i] + arr[j];
                //System.out.println(arr[i]+" "+arr[l]+" "+arr[r]+" "+arr[j]+" "+tempSum);
                if(tempSum==target)return 1;
                if(tempSum<target)l++;
                else
                {
                    r--;
                }
                sum=tempSum;
            }
            if(sum<target)i++;
            else
            {
                j--;
            }
        }
        return 0;
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
	        int target = scan.nextInt(); 
	        Arrays.sort(arr);
	        System.out.println(check(arr,target));
	    }
		
	}
}
