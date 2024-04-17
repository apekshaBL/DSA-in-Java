package Arraylist;
import java.util.ArrayList;
public class ReverseArraylist {

    public static void reverseList(ArrayList<Integer>Number){
        int i=0;
        int j=Number.size()-1;
        while(i<j){
                Integer temp=Integer.valueOf(Number.get(i));
                Number.set(i,Number.get(j));
                Number.set(j,temp);
                i++;
                j--;
        }

    }

    public static void main(String[]args){
        ArrayList<Integer>Number=new ArrayList<>();
        Number.add(2);
        Number.add(4);
        Number.add(6);
        Number.add(8);
        Number.add(10);
        System.out.println(Number);
        System.out.println("Reverse arraylist is:-");
        reverseList(Number);
        System.out.println(Number);


    }
}
