package Recursion;
import java.util.Scanner;
public class Palindrome3 {
    static boolean check(String str,int strIdx,int endIdx){
       if(strIdx>=endIdx){
           return true;
       }
      if(str.charAt(strIdx)!=str.charAt(endIdx)){
          return false;
      }
      return check(str,strIdx+1,endIdx-1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        boolean result=check(str,0,str.length()-1);
        if(result){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }




    }
}
