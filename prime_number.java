import java.util.*;
public class fifth {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked whehter prime or not=");
		int n = sc.nextInt();
		int count=0;
		if (n<=0){
			System.out.println("Number Should be greater than 0");
		}
		else if (n==1 || n==2){
			System.out.println("Not prime");
		}
		else{
		for (int i=1;i<n+1;i=i+1){
			if (n%i==0)
			count=count+1;
			
		
		}
	}
	if (count==2)		
	System.out.println("Prime");
	else
	System.out.println("Not prime");
}

}
