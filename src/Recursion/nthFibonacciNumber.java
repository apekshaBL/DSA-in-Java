package Recursion;
import java.util.Scanner;
public class nthFibonacciNumber {
    static int NthNumber(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int m=NthNumber(n-1);
        int p=NthNumber(n-2);
        int Num=p+m;
        return Num;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term in fibonacci series:");
        int n=sc.nextInt();
        System.out.println(NthNumber(n));

    }
}
