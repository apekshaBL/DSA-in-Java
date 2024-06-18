package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class ReverseRecursively {
    public static void Display(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        Display(st);
        System.out.print(x+" ");
        st.push(x);
    }

    public static void Reverse(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int x=st.pop();
        System.out.print(x+" ");
        Reverse(st);
        st.push(x);

    }
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
        System.out.println("Our Stack is");
        Display(st);
        System.out.println();
        System.out.println("Reverse Stack is");
        Reverse(st);

    }
}
