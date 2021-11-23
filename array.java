/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Using single array for all three cases
		Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int size=10;
        int sum= 0;
        //Sum of all array elements
        for (int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }
        for (int i:array){
            sum=sum+i;
        }
        System.out.println("Sum of all array elements is "+sum);
        //Find Middle element in array
        int finalsize=Math.round(size/2);
        int sans = array[finalsize-1];
        System.out.println("Middle element in array is "+sans);
        //Print all possitive number in array
        System.out.println("All possitive element in array are=");
        for (int i=0;i<10;i++){
            if (array[i]>0){
                System.out.println(array[i]);
            }
        }
        
	}
}
