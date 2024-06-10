package Recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class SubString {
    static ArrayList<String> getString(String name){
        ArrayList<String>ans=new ArrayList<>();
        if(name.length()==0){
            ans.add(" ");
            return ans;
        }
        char curr=name.charAt(0);
        ArrayList<String>SmallAns=getString(name.substring(1));
        for(String ss:SmallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
    return ans;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        System.out.println("Our SubString of enter string is");
        System.out.println(getString(name));

    }
}
