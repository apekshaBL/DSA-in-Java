package Arraylist;
import java.util.ArrayList;
import java.util.Collections;


public class SortingArraylist {
    public static void main(String[]args){
        ArrayList<String>Names=new ArrayList<>();
        Names.add("appu");
        Names.add("mou");
        Names.add("maina");
        Names.add("moude");
        Names.add("apsara");
        System.out.println(Names);
        System.out.println("Sorted Arraylist in Increasing Order is-");
        Collections.sort(Names);
        System.out.println(Names);
        System.out.println("Sorted ArrayList in Decreasing Order is");
        Collections.sort(Names,Collections.reverseOrder());
        System.out.println(Names);

        ArrayList<Integer>Num=new ArrayList<>();
        Num.add(56);
        Num.add(12);
        Num.add(13);
        Num.add(1);
        Collections.sort(Num);
        System.out.println("Sorted in Increasing Order is");
        System.out.println(Num);
        System.out.println("Sorted in decreasing Order is");
        Collections.sort(Num,Collections.reverseOrder());
        System.out.println(Num);
    }

}
