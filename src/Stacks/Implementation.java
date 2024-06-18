package Stacks;
import java.util.Stack;
public class Implementation {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(67);
        st.push(34);
        st.push(8);
        st.push(56);
        System.out.println("Our Stack is");
        st.peek();
        System.out.println(st +" ");
        System.out.println("Top most element of stack is");
        System.out.println(st.peek());
        System.out.println("removing top element of stack");
        st.pop();
        System.out.println(st);
        System.out.println("Size of stack is");
        System.out.println(st.size());
        System.out.println("pushing in stack");
        st.push(344);
        System.out.println(st);
        System.out.println("stack is empty  ");
        System.out.println(st.isEmpty());
        System.out.println("Stack is empty");
        System.out.println(st.empty());

    }
}
