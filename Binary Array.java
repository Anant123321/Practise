/* Given is an array of zeros and ones...Task is to spot a zero and make all the elements of that row and column =0.
Eg- Given array is -
1 1 0
1 0 1
1 1 1

then output array is
0 0 0
0 0 0
1 0 0
*/
import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[][]=new int[n][n];
		int i=0,j=0;
		int r=1,c=1;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				arr[i][j]=scan.nextInt(); //array scanned

		for(j=0;j<n;j++)
			if(arr[0][j]==0)r=0;  // checking if top row has a zero
		
		for(i=0;i<n;i++)
			if(arr[i][0]==0)c=0; // checking if first column has a 0
		
		for(i=1;i<n;i++)  // checking if all elements other than top and bottom row are zero or not
		{
			for(j=1;j<n;j++)
			{
				if(arr[i][j]==0)  //if any element is zero..then element above this element in top row and
				{                 // element leftmost to this element in first column is made 0
					arr[0][j]=0;
					arr[i][0]=0;
				}
			}
		}
		for(j=1;j<n;j++)      // checking top row again..but element at 0,0 is not checked yet
		{
            if(arr[0][j]==0)
            {
            	for(i=1;i<n;i++) //if any element is 0,then make whole column 0.
            		arr[i][j]=0;
            }
		}

		for(i=1;i<n;i++)      // checking first column again..but element at 0,0 is not checked yet
		{
            if(arr[i][0]==0)
            {
            	for(j=1;j<n;j++)  //if any element is 0,then make whole column 0.
            		arr[i][j]=0;
            }
		}
		if(r==0)               //if r==0..make first row 0
			for(j=0;j<n;j++)
			{
				arr[0][j]=0;
			}
		if(c==0)               //if c==0..make first col. 0
			for(i=0;i<n;i++)
			{
				arr[i][0]=0;
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
/* 1 0 1
   1 1 0
   1 1 1

  Step1:-  if row1 has 0...make r=0
           is col1 has 0...make c=0
           thus, r=0,c=1
  Step 2:- leave first row nd first col..check rest of the elements
           1  0  1
           
           1  1 0 
           
           1  1 1
           i.e. 1 0
                1 1
  Step 3:- if any element is found 0.... make the top row and col element of
            corresponding element 0
            now the arrray becomes
             1 0 0
             0 1 0
             1 1 1
   Step 4:-  now check top row and if 0 comes...make the same column 0.
             now the array becomes
             1 0 0
             0 0 0
             1 0 0
   Step 5:-  now check the first col..if 0 comes...make corresponding row=0
             now the array becomes
             1 0 0
             0 0 0
             1 0 0
   Step 6:-  if r==0 make top row 0...if c==0..make first col 0

   Final Answer:- 0 0 0
                  0 0 0
                  1 0 0 