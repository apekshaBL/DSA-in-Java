package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the number of elements of stacks");
        int n=sc.nextInt();
        System.out.println("Enter the " +n+ " number of elements of the stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is-");
        System.out.println(st);
        Stack<Integer>reverse=new Stack<>();
        while(st.size()!=0){
//            int x=st.peek();
//            reverse.push(x);
//            st.pop();
            int y=st.pop();
            reverse.push(y);
        }
        System.out.println("Reverse stack is");
        System.out.println(reverse);
        

    }
}
