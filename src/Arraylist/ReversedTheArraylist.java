package Arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReversedTheArraylist {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("reversed arraylist is");
        Collections.reverse(list);
        System.out.println(list);

    }
}
