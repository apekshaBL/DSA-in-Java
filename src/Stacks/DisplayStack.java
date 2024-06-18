package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class DisplayStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of Stack");
        int n=sc.nextInt();
        System.out.println("Enter the " +n+ " elements of stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        Stack<Integer>demo=new Stack<>();
        System.out.println("Our Stack is");
        while(st.size()!=0){
            int x=st.pop();
            demo.push(x);
        }
        while(demo.size()!=0){
            int x=demo.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();

    }
}
