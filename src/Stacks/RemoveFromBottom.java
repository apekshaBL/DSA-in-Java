package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class RemoveFromBottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n=sc.nextInt();
        System.out.println("Enter the elements " +n+ " of stack");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Our Stack is");
        System.out.println(st);
        Stack<Integer>demo=new Stack<>();
        while(st.size()!=0){
            int x=st.pop();
            demo.push(x);
        }
        demo.pop();
        while(demo.size()!=0){
            int x=demo.pop();
            st.push(x);
        }
        System.out.println("Stack after removing element from its bottom is");
        System.out.println(st);

    }
}
