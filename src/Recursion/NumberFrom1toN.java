package Recursion;
import java.util.Scanner;
public class NumberFrom1toN {
    public static void IncreasingNumber(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        IncreasingNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of n:");
       int n=sc.nextInt();
       IncreasingNumber(n);
    }
}
