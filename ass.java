import java.util.*;
public class ass{ 
    public static void main(String[] args){
        //Take Two numbers and print theire relations
        float mult;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number=");
        int n1= sc.nextInt();
        System.out.print("Enter second number=");
        int n2= sc.nextInt();
        mult=n2/n1;
        System.out.println(n1 +" is "+mult+ " times of " +n2);
        

    }
    
}
