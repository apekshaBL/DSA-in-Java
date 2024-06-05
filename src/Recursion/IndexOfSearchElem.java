package Recursion;
import java.util.Scanner;
public class IndexOfSearchElem {
    static void PrintArray(int[]array,int idx){
        if(idx==array.length){
            return;
        }
        System.out.println(array[idx]);
        PrintArray(array,idx+1);
    }
    static int Searched(int[]array,int target,int idx){

        if(idx>=array.length-1){
            return -1;
        }
        if(array[idx]==target){
            return idx;
        }
        return Searched(array,target,idx+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        int[]array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array,0);
        System.out.println("Enter target");
        int target=sc.nextInt();
        System.out.println(Searched(array,target,0));

    }
}
