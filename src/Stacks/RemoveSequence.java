package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class RemoveSequence {
    public static void PrintArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    static int[] Sequence(int[]array){
        Stack<Integer>st=new Stack<>();
        int n=array.length;
        for(int i=0;i<n;i++) {
            if (st.size() == 0 ||st.peek()!=array[i]) st.push(array[i]);
            else if( array[i]==st.peek() ){
                if( i==n-1 || array[i]!=array[i+1])st.pop();
            }
        }
        int p=st.size();
        int [] newArray=new int[p];
        int m=newArray.length;
        for(int i=m-1;i>=0;i--){
            newArray[i]=st.pop();
        }
        return newArray;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Our array is");
        PrintArray(array);
        System.out.println("The consecutive sequence of numbers is");
        int[]ans= Sequence(array);
        PrintArray(ans);
    }
}
