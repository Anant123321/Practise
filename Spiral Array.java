/*
Given is the size of an array..task is to fill it in a spiral manner
*/
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt();
	  int arr[][]=new int[n][n];
	  int start=0,end=0,i=0,j=0;
	   while(end<=n/2) // Number of spirals in an array
	   {
	   	start=end;
		  for(i=0+end;i<n-end;i++) 
	   		arr[start][i]=scan.nextInt();
	   	  i=i-1;
		  for(j=start+1;j<n-end;j++) 
		  	arr[j][i]=scan.nextInt();
		  j=j-1;
		  start=j;
		  for(i=i-1;i>=end;i--)
		  	arr[start][i]=scan.nextInt();
		  i=i+1;
		  for(j=start-1;j>end;j--)
		  	arr[j][i]=scan.nextInt();
		  end++;
	    }
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<n;j++)
	    	{
	    		System.out.print(arr[i][j]+" ");
	    	}
	    	System.out.println();
	    }
     }
}