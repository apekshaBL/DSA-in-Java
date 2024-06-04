package Recursion;
import java.util.Scanner;
public class NumberfromNto1 {
    public static void reversedNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        reversedNum(n-1);


    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        reversedNum(n);


    }
}
