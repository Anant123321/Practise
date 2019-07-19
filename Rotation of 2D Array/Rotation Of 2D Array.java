//Given is an array..of size n..Rotate the array by 90 degrees
import java.util.*;
class Main
{
   public static void main(String arg[])
   {
   	Scanner scan=new Scanner(System.in);
   	int n=scan.nextInt();  
    int arr[][]=new int[n][n];
    for(int l=0;l<n;l++)
    {
    	for(int m=0;m<n;m++)
    	{
            arr[l][m]=scan.nextInt();
    	}
    }
    for(int i=0;i<n/2;i++)
    {
    	for(int j=i;j<n-1-i;j++)
    	{
    		 int temp=arr[i][j];
    		 arr[i][j]=arr[n-1-j][i];
    		 arr[n-1-j][i]=arr[n-1-i][n-1-j];
    		 arr[n-1-i][n-1-j]=arr[j][n-1-i];
    		 arr[j][n-1-i]=temp;
    	}
    }
    for(int l=0;l<n;l++)
    {
    	for(int m=0;m<n;m++)
    	{
            System.out.print(arr[l][m]+" ");
    	}
    	System.out.println();
    }
   }
}