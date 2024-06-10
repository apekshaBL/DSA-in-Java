package Recursion;
import java.util.Scanner;
public class FrogJump {
    static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int min_cost(int[]array,int n,int idx){
        if(idx==n-1){
            return 0;
        }

        int a=Math.abs(array[idx]-array[idx+1])+min_cost(array,n,idx+1);
        if(idx==n-2){
            return a;

        }
        int b=Math.abs(array[idx]-array[idx+2])+min_cost(array,n,idx+2);
        return Math.min(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array of Integer height of stones");
        int[]height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println("Our array having height of stone is");
        PrintArray(height);
        System.out.println("The cost is:-");
        System.out.println(min_cost(height,n,0));


    }
}
