import java.util.*;
public class first {
    public static void main(String[] args) throws Exception {
        //First - Print User Input Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be printed = ");
        int n = sc.nextInt();
        System.out.println("You Entered a number "+n);
        
        //Print Numbers In Given Range When First Number and last number is given in different line
        int first = sc.nextInt();
        int last = sc.nextInt();
        System.out.println("Printing number in given range");
        for (int i=first;i<=last;i++){
            System.out.println(i);
        }

        //print Numbers in reverse order with given range
        System.out.println("Printing numbers in given range i reverse order");
        for (int i=last;i<=first;i--){
            System.out.println(i);
        }

        //print Table of 2 
        System.out.println("Lets print Table of 2");
        for (int i=2;i<=20;i=i+2){
            System.out.println(i);
        }

        //print Table of 2 in reverse order
        System.out.println("Lets print table of 2 in reverse order ");;;
        for (int i=20;i<=2;i=i-2){
            System.out.println(i);
        }

        //Print Smaller number 
        System.out.println("Enter the first number to be checked=");
        int First = sc.nextInt();
        System.out.println("Enter the second number to be checked=");
        int Second = sc.nextInt();
        if (First>Second){
            System.out.println(First+" is greater than "+Second);
        }
        else if (Second>First){
            System.out.println(First+" is smaller than "+Second);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
