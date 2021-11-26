import java.util.*;
import java.io.*;
public class array{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //add two 2-D matrices
        System.out.print("Enter Number of rows=");//Number of rows are same for other 2-D array also
        int rows = sc.nextInt();
        System.out.print("Enter Number of column=");//Number of column will be same for other 2-D array also
        int column = sc.nextInt();
        int farr[][] = new int[rows][column];
        int sarr[][] = new int[rows][column];
        int finalarray[][] = new int[rows][column];
        System.out.println("Enter elements for first array=");
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                farr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements for Second array=");
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                sarr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                finalarray[i][j]=farr[i][j]+sarr[i][j];
            }
        }
        System.out.println("After addition of two array matrix will be");
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(finalarray[i][j]+" ");
            }
            System.out.println();
        }
        //Print Element Columnwise
        int columnw[][] = new int[rows][column];
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                columnw[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
                System.out.print(columnw[i][j]+" ");
            }
        }        

    }
}
