import java.util.*;
import java.util.Arrays;
public class array2{ 
    public static void main(String[] args){
        //Occurance of first index of element
		int number;
		Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("Enter Number to find with first occurance=");
        number = sc.nextInt();
        System.out.print("Enter the size of the array=");
        int size = sc.nextInt(); // Size will be same for all array
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        } 
        int count=0;
        for (int i=0;i<size;i++){
            count++;
            if (array[i]==number){
                break;
            }
        }
        if (count==0){
            System.out.println("Element is not found in the given array");
        }
        else{
        System.out.println("Index of first occurance of element is "+count);}
        //Index of last occurance of element in array
        //Using same array and same element
        System.out.println("Let's find last occurance of element");
        int finalans=0;
        for (int i=0;i<size;i++){
            if (array[i]==number){
                finalans=i+1;
            }}
        if (finalans==0){
            System.out.println("Element is not fouund in the array");
        }
        else{
            System.out.println("Last index of given element is "+finalans);
        }
        //Difference of two arrays 
        //Taking size a 5 for both the array
        int[] farray = new int[5]; 
        int[] sarray = new int[5];
        int[] finalarray = new int[5];
        System.out.println("Enter the elements of first array=");
        for (int i=0;i<5;i++){
            farray[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of second array=");;
        for (int i=0;i<5;i++){
            sarray[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++){
            finalarray[i]=farray[i]-sarray[i];
        }
        System.out.println("Element after subtractions are");
        for (int i=0;i<5;i++){
            System.out.print(finalarray[i]+" ");
        }
        System.out.println();
        //Binary to decimal conversion
        int dec=0,rem,i=1;
        System.out.print("Enter the binary element to be converted in decimal number=");
        int bin = sc.nextInt();
        while (bin!=0){
            rem=bin%10;
            dec=dec+(rem*i);
            i=i*2;
            bin=bin/10;
        }
        System.out.println("Decimal number for given binary number is "+dec);
    }
    
}
