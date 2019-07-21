/*
given is n ranges of integers. Task is to merge the interecting ranges.
*/
import java.util.*;
class Main
{
	public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),i=0;
		LinkedList<range> arr=new LinkedList<range>();
        for(i=0;i<n;i++)
        {
        	arr.add(new range(scan.nextInt(),scan.nextInt())); // add first and last integer of the range
        }
        Collections.sort(arr); //sort the ranges based on the first element of the range
        for(i=0;i<n-1;i++)
        {
        	if(arr.get(i).b>=arr.get(i+1).a) // where second range starts is lesser than where first range ends
        	{                                // eh in 1,6 and 5,20...5 lies in 1,6 
               arr.get(i).b= arr.get(i).b>arr.get(i+1).b ? arr.get(i).b : arr.get(i+1).b; //change the upper bound of first range
               arr.remove(i+1);  // remove second range as it is merged
               n--; // after removing the range size of the list reduces by one
               i--;
        	}
        }
        for(i=0;i<arr.size();i++)System.out.print("("+arr.get(i).a+","+arr.get(i).b+")");

	}
} 
class range implements Comparable<range>
{
	int a,b;
    range(){}
    range(int val1,int val2)
    {
        a=val1;
        b=val2;
    }
    public int compareTo(range obj)
    {
    	return this.a-obj.a;
    }
}
