package Recursion;
import java.util.Scanner;
public class SumOfDigitOfNum {
    static int SumOfDigit(int n ) {
        if (n >= 0 && n <= 9) {
            return n;
        }
        int firstNum = SumOfDigit(n / 10);
        int lastNum = SumOfDigit(n % 10);
        int sum = firstNum + lastNum;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(SumOfDigit(n));
    }

}
