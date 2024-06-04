package Recursion;
import java.util.Scanner;
public class N_Multiples_Of_K {
    static void multiple(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
       multiple(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose multiple you want");
        int n=sc.nextInt();
        System.out.println("Enter the limit where multiple is required ");
        int k=sc.nextInt();
        multiple(n,k);

    }
}
