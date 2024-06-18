package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of Stack");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" elements of stacks");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is");
        System.out.println(st);
        System.out.println("Enter the element that you want to insert at the bottom of Stack");
        int z=sc.nextInt();
        Stack<Integer>demo=new Stack<>();
        while(st.size()!=0){
            int x=st.pop();
            demo.push(x);
        }
        st.push(z);
        while(demo.size()!=0){
            int x=demo.pop();
            st.push(x);
        }
        System.out.println("After inserting "+z+ " at bottom our stack is");
        System.out.println(st);

    }
}
