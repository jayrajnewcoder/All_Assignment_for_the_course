import java.util.*;
public class multiarray {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //Lower traingular matrix
    System.out.println("Lets print lower traingular matrix");
    System.out.print("Enter number of rows for the matrix=");
    int frows = sc.nextInt();
    System.out.print("Enter number of column for the matrix=");
    int fcolumn = sc.nextInt();
    int farr[][] = new int[frows][fcolumn];
    for (int i=0;i<frows;i++){
        for (int j=0;j<fcolumn;j++){
            farr[i][j]=sc.nextInt();
        }
    }
    for (int i=0;i<frows;i++){
        for (int j=0;j<fcolumn;j++){
            if (i<j){
                System.out.print("0"+" ");
            }
            else{
                System.out.print(farr[i][j]+" ");
            }
        }
        System.out.println();
    }
    //Determine if given matrix is sparse matrix
    System.out.println("Lets Determine matrix is sparse matrix or not");
    System.out.print("Enter number of rows for the matrix=");
    int arows = sc.nextInt();
    System.out.print("Enter number of column for the matrix=");
    int acolumn = sc.nextInt();
    int aarr[][] = new int[arows][acolumn];
    System.out.println("Enter the array elements=");
    for (int i=0;i<arows;i++){
        for (int j=0;j<acolumn;j++){
            aarr[i][j]=sc.nextInt();
        }
    }
    int zerocount=0;
    int numbelement=(arows*acolumn)/2;
    for (int i=0;i<arows;i++){
        for (int j=0;j<acolumn;j++){
            if (aarr[i][j]==0){
                zerocount++;
            }
        }
    }
    if (zerocount>numbelement){
        System.out.println("Matrix is sparse matrix");
    }
    else{
        System.out.println("Matrix is not an sparse matrix");
    }


    //find the frquency of odd and even element in the matrix
    
    System.out.print("Enter number of rows for the matrix=");
    int rows = sc.nextInt();
    System.out.print("Enter number of column for the matrix=");
    int column = sc.nextInt();
    int arr[][] = new int[rows][column];
    System.out.println("Enter the array elements=");
    for (int i=0;i<rows;i++){
        for (int j=0;j<column;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    int evencount=0;
    int oddcount=0;
    for (int i=0;i<rows;i++){
        for (int j=0;j<column;j++){
            if (arr[i][j]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
    }
    System.out.println("Number of even elements i the array are "+evencount);
    System.out.println("Number of odd elements in the array are "+oddcount);

    }
}
