package Recursion;
import  java.util.Scanner;
public class Palindrome {
    static String Check(String name,int idx){

        if(idx==name.length()){
            return "";
        }
        String ans=Check(name,idx+1);

        return ans+name.charAt(idx);
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        if(Check(name,0).equals(name)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
