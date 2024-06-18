package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class CopyStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of stack");
        int n=sc.nextInt();
        System.out.println("Enter the elements of stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our stack is");
        System.out.println(st);
        Stack<Integer>rt=new Stack<>();
        while(st.size()!=0){
            int x=st.pop();
            rt.push(x);
        }
        Stack<Integer>ct=new Stack<>();
        while(rt.size()!=0){
            int x=rt.pop();
            ct.push(x);
        }
        System.out.println("Copying the same stack in stack ct");
        System.out.println(ct);

    }
}
