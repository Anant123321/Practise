//Given is an array..of size n..and an integer k. Display the elements of array after k rotations(clockwise)
import java.util.*;
class Main
{
   public static void main(String arg[])
   {
   	Scanner scan=new Scanner(System.in);
   	int n=scan.nextInt();  
    int arr[]=new int[n];
    for(int l=0;l<n;l++)
    	arr[l]=scan.nextInt();
    int k=scan.nextInt();
    for(int i=0;i<k%n;i++)
    {
       int temp=arr[n-1];
       for(int j=n-1;j>0;j--)
       {
       	arr[j]=arr[j-1];
       }
       arr[0]=temp;
    }
    System.out.print(Arrays.toString(arr));
   }
}  