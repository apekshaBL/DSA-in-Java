package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class DisplayRecursive {
    public static void Display(Stack<Integer>st){
        if(st.empty()){
            return;
        }
        int x=st.pop();
        Display(st);
        System.out.print(x+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        System.out.println("Enter the size of Stack");
        int n=sc.nextInt();
        System.out.println("Enter the " +n+ "elements of Stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is");
        Display(st);

    }

}
