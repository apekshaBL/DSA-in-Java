package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of Stack");
        int n=sc.nextInt();
        System.out.println("Enter the " + " elements of the stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is");
        System.out.println(st);
        Stack<Integer>reverse=new Stack<>();
        while(st.size()!=0){
            int x=st.pop();
            reverse.push(x);
        }
        Stack<Integer>rev=new Stack<>();
        while(reverse.size()!=0){
            int x=reverse.pop();
            rev.push(x);
        }
        while(rev.size()!=0){
            int x=rev.pop();
            st.push(x);
        }
        System.out.println("Reverse stack is");
        System.out.println(st);

    }
}
