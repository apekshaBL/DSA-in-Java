package Recursion;
import java.util.Scanner;
public class Alternate_Sum_Of_N_number {
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return Sum(n-1)-n;
        }
        else{
            return Sum(n-1)+n;
        }


    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(Sum(n));

    }
}
