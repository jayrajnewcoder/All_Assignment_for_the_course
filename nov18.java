import java.util.*;
public class nov18{ 
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number=");
        //Max of two number using ternary operator
        int n1 = sc.nextInt();
        System.out.print("Enter second number=");
        int n2 = sc.nextInt();
        int ans;
        ans = n1>n2?n1:n2;
        System.out.println("Maximum among two number is "+ans);
        //maximum of three number using ternary operator
        System.out.print("Enter third number=");
        int n3 = sc.nextInt();
        int finalans;
        finalans=n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("Max of three number is "+finalans);
        //number of digits in a number
        System.out.print("Enter the number whoose digits are to be count=");
        int number = sc.nextInt();
        int count=0;
        while (number!=0){
            number=number/10;
            count=count+1;
        }
        System.out.println("Number od digits in are "+count);
        
    }
    
}
