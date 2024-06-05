package Recursion;
import java.util.Scanner;
public class PowerOfNumber {
    static int Power(int p,int q){
        if(q==1 || q==0){
            return p;
        }
        int n=Power(p,q-1);
        return n*p;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        System.out.println("Enter the power");
        int q=sc.nextInt();
        System.out.println(Power(p,q));
    }
}
