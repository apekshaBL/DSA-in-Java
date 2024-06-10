package Recursion;
import java.util.Scanner;
public class Palindrome2 {
    static boolean Check(String string,int strIdx,int endIdx){
        if(strIdx>=endIdx) {
            return true;
        }
            return (string.charAt(strIdx)==string.charAt(endIdx) && Check(string,strIdx+1,endIdx-1));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String string=sc.nextLine();
        System.out.println(Check(string,0,string.length()-1));

    }
}
