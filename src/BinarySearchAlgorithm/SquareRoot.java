package BinarySearchAlgorithm;
import java.util.Scanner;

public class SquareRoot {
    static int  squareRoot(int m){

        int str=0;
        int end=m;
        int square_root=-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            int value=mid*mid;
            if(value==m){
                return mid;
            }
            else if(value>m){
                end=mid-1;
            }
            else{
                square_root=mid;
                str=mid+1;
            }
        }
        return square_root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("square root of number is");
        System.out.println(squareRoot(n));
    }
}
