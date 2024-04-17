package Arraylist;
import java.util.ArrayList;

public class Basic {
    public static void main(String[]args){
        ArrayList<Integer>list1=new ArrayList<>(); //Integer type Arraylist
        //ArrayList<String>list2=new ArrayList<>(); //String type Arraylist
       // ArrayList<Double>list3=new ArrayList<>(); //Double type Arraylist

        //methods in Arraylist

        //adding elements in arraylist
        list1.add(23);
        list1.add(78);
        list1.add(100);
        System.out.println(list1);
        list1.add(890);
        System.out.println(list1);

        //to print entire Arraylist
        System.out.println("Elements of arraylist is :-");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        //printing arraylist without loop
        System.out.println(list1);

        //adding element at any index i
        list1.add(1,7890);
        System.out.println(list1);

        //changing element in arraylist
        list1.set(1,000);
        System.out.println(list1);

        //remove element of index from arraylist
        list1.remove(1);
        System.out.println(list1);

        //removing element from arraylist  without considering index
        list1.remove(Integer.valueOf(100));
        System.out.println(list1);

        //if you do like this you can add any data type in it
        ArrayList l1=new ArrayList();
        l1.add("appu");
        l1.add("mou");
        l1.add(34);
        System.out.println(l1);




    }
}
