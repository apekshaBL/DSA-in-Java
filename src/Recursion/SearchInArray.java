package Recursion;
import java.util.Scanner;
public class SearchInArray {
    static void PrintArray(int []array,int idx){
        if(idx==array.length){
            return;
        }
        System.out.println(array[idx]);
        PrintArray(array,idx+1);
    }
    static boolean Search(int[]array,int  target,int idx){
        if(idx>=array.length){
            return false;
        }
        if(array[idx]==target){
            return true;
        }
        if(Search(array,target,idx+1)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array");
        int []array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array,0);
        System.out.println("Enter target element");
        int target=sc.nextInt();
        if(Search(array,target,0)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }

    }
}
