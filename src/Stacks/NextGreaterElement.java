package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static int[] NewGreater(int[]array){
        int n=array.length;
        int[]ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<array[i] ) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else {
                ans[i]=st.peek();
            }
            st.push(array[i]);

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int[]array=new int[n];
        for(int i=0;i<n;i++){
           array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("Array of new greater element is");
        int[] ans=NewGreater(array);
        PrintArray(ans);




    }
}
