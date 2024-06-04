package Recursion;
import java.util.Scanner;
public class NFactorial {
      static int Factorial(int n){
          if(n==0){
              return 1;
          }
          Factorial(n-1);
          int num= n*Factorial(n-1);
          return num;


    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(Factorial(n));


    }
}
