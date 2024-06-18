package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class PushAtBottom {
    public static void Display(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        int x=st.pop();
        Display(st);
        System.out.print(x+" ");
        st.push(x);
    }
    public static void Insert(int x,Stack<Integer>st){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int y=st.pop();
        Insert(x,st);
       st.push(y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of stack");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" elements of stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is");
        Display(st);
        System.out.println();
        System.out.println("Enter the element that to be pushed at bottom of stack");
        int s=sc.nextInt();
        System.out.println("Stack after insertion of " +s+ " at bottom is");
        Insert(s,st);
        Display(st);


    }
}
