/* We are given an array of n elements. We have to find the max difference between two indexes i and j such that:-
   1. j>i
   2. arr[j]>arr[i]
   Eg- in [2,4,3,1]
   max difference is 2..i.e. between i=0 and j=2 where arr[2](=3)>arr[0](=2)
   Happy Coding!!!
*/
import java.util.*;
class element implements Comparable<element> // to make pair of the element and the index of the element
{
	int ele,index;
	element(){}
	element(int a,int b)
	{
	  ele=a;
	  index=b;
    }
	public int compareTo(element obj) // to sort on the basis of element..so that the indeesx keep grouped to their elements after they(ele.) are soted
	{
		return this.ele-obj.ele;
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    ArrayList<element> arr=new ArrayList<element>(); // arraylist..not array because it seemed easy to sort it!!
	    int i=0;
	    for(i=0;i<n;i++)
	    {
	    	arr.add(new element(scan.nextInt(),i)); // adding elements and indexes to the object of class element
	    }
	    Collections.sort(arr);
	    int min=arr.get(0).index;  // getting starting index to compare with..
	    int max=0;                 // the max diffrence as of now is 0
	    for(i=1;i<n;i++)           // starting from 2nd element
	    {
	    	if(arr.get(i).index-min> max) // if difference of indexes is > max
	    	    max=arr.get(i).index-min;

	    	min= arr.get(i).index<min ?arr.get(i).index : min; //everytime we need to update the min. index for next comparison
	    	
	    }
	    System.out.println(max);  //most lovely part...the answer :)
	}
}