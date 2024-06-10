package Recursion;
import java.util.Scanner;
public class ReverseString {
    static String Reversed(String name,int idx){
        if(idx==name.length()){
            return "";
        }
        String ans=Reversed(name,idx+1);
        return ans+name.charAt(idx);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        System.out.println("Reversed String is");
        System.out.println(Reversed(name,0));

    }
}
