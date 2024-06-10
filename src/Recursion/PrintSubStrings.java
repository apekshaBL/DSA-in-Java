package Recursion;
import java.util.Scanner;
public class PrintSubStrings {
    static void PrintSubString(String s,String CurrAns){
        if(s.length()==0){
            System.out.println(CurrAns);
            return;
        }
        char currChar=s.charAt(0);
        String remChar=s.substring(1);
        PrintSubString(remChar,CurrAns+currChar);
        PrintSubString(remChar,CurrAns);


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println("SubString is");
        PrintSubString(s,"");


    }
}
