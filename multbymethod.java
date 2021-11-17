import java.util.*;
public class multbymethod{ 
    public static void main(String[] args){
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number=");
        int first = sc.nextInt();
        System.out.print("Enter second number=");
        int second = sc.nextInt();
        mult obj = new mult();
        ans= obj.letssolve(first,second);
        System.out.println(ans);
    }
    
}
class mult{
    int letssolve(int f,int s){
        int ans;
        ans = f*s;
        return ans;        
    }
}






