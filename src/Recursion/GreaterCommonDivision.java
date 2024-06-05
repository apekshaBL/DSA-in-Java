package Recursion;
import java.util.Scanner;
public class GreaterCommonDivision {
    static int gcd(int n,int m){
        if(m==0){
            return n;
        }
        return gcd(m,n%m);

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(gcd(n,m));

    }

}
