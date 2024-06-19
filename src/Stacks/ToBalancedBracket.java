package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class ToBalancedBracket {
    public static String BalancedBracket(String str){
        Stack<Character>st=new Stack<>();
        Stack<Character>rt=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0){
                    rt.push(ch);
                }
                else {
                    st.pop();
                }
            }
        }
        // Create the balanced string
        StringBuilder balancedStr = new StringBuilder();
        while (rt.size()>0) {
           balancedStr.append('('); // Add necessary opening brackets
            rt.pop();
        }
        balancedStr.append(str);
        while (st.size()>0) {
           balancedStr.append(')'); // Add necessary closing brackets
            st.pop();
        }

        return balancedStr.toString();


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String of Brackets");
        String brackets=sc.nextLine();
        System.out.println("Our Entered String of Brackets is :-");
        System.out.println(brackets);
        System.out.println(BalancedBracket(brackets));


    }
}
