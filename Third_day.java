import java.util.*;

public class second {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        //Swapping of two numbers
        System.out.println("Lets swap two variables");
        System.out.print("Enter the first number=");
        int first = sc.nextInt();
        System.out.print("Enter the second number=");
        int second = sc.nextInt();
        System.out.println("Before Swapping the two variables are "+first+" and"+second);
        int temp;
        temp=first;
        first=second;
        second=temp;
        System.out.println("After Swapping the two variables are "+first+" and"+second);
        
        //Factorial of Given Number
        int number = sc.nextInt();
        if (number<0){
            System.out.print("Number should be possitive");
        }
        else{
            int fact=1;
            for (int i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of the number is "+fact);
        }
        
        //sum of number
        int range = sc.nextInt();
        int sum=0;
        for (int i=0;i<=range;i++){
            sum=sum+i;
        }
        System.out.println("Sum of the numbers in given range is "+sum);

    

  
}    
}
