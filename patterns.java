import java.util.*;

public class patterns {
    public static void main(String[] args) throws Exception {
    //Print reverse pyramid
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter How many rows you want=");
    int number = sc.nextInt();
    for(int i = number; i >= 1; i--)
    {
          
        
        for(int j = i; j < number; j++)
        {
            System.out.print(" ");
        }
          
        
        for(int j = 1; j <= (2 * i - 1); j++)
        {
            System.out.print("*");
        }
      
        System.out.println("");
    }   
    System.out.println();
    System.out.println();
    //Diamond pattern
		int space = number - 1;
	
		for (int i = 0; i < number; i++)
		{
			
			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			
			for (int j = 0; j <= i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space--;
		}
	
		
		space = 0;
	
		
		for (int i = number; i > 0; i--)
		{
			
			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			
			for (int j = 0; j < i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
			space++;
	

        }
    }
}
