package Recursion;
import java.util.Scanner;
public class RemoveCharFromString {
    static String remove(String name,int idx,int target){
        if(idx==name.length()){
            return " ";
        }
        String smallAns=remove(name,idx+1,target);
        char currChar=name.charAt(idx);
        if(currChar!=target){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name= sc.nextLine();
        System.out.println("Enter the character to be searched in String");
        char target=sc.next().charAt(0);
        System.out.println("String after removing occurrence of character is");
        System.out.println( remove(name,0,target));




    }
}
