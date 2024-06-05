package Recursion;
import java.util.Scanner;
public class IndexOfTargetChar {
    static String getIndex(String name,char target,int idx){
        if(idx==name.length()){
            return " ";
        }
        String result=getIndex(name,target,idx+1);
        if(name.charAt(idx)==target){
            System.out.println(idx);
        }
            return " ";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        System.out.println("Enter the target char");
        char target=sc.nextLine().charAt(0);
        System.out.println("Character is present at");
        System.out.println(getIndex(name,target,0));

    }
}
