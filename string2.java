import java.util.*;
public class string2 {
    /**
     *
     */


    public static void main(String[] args){
        //Searching particular character in string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string=");
        String name = sc.nextLine();
        System.out.print("Enter the character to be search in the string");
        char ch =sc.next().charAt(0);
        char arr[] = new char[name.length()];
        arr=name.toCharArray();
        boolean isPresent=false;
        for (int i=0;i<name.length();i++){
            if (arr[i]==ch){
                isPresent=true;
            }
            else{
                isPresent=false;
            }
        }
        if (isPresent){
            System.out.println(ch+" is present in the string "+name);
        }
        else{
            System.out.println(ch+" is not present in the string "+name);
        }
        // Convert all first character of word in a string
        String outputname = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println(outputname);
        //Reverse a word in a string
        String s = "JAVA IS OBJECT ORIENTED PROGRAMMING LANGUAGE";
        String[] split = s.split(" ");
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
        result += (split[i] + " ");
        }
        System.out.println(result.trim());
        //Check string is pallindroe or not
        System.out.println();
        System.out.print("Enter the string to be checked whther it is pallindrome or not=");
        String aname=sc.nextLine();
        String reverse="";
        int first=0,last=aname.length()-1;
        for (int i=last;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        if (aname.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not Pallindrome");
        }
    }
}
