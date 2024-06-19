package queues;
import java.util.*;

public class BasicImplementation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
       // Queue<Integer> b = new ArrayDeque<Integer>();
        q.add(89);
        q.add(80);
        q.add(23);
        q.add(34);
        q.add(3);
        q.add(0);
        q.add(55);
        System.out.println(q);
        q.remove();//remove the 1st in
        System.out.println(q);
        q.poll();//remove 1st in
        System.out.println(q);
        System.out.println(  q.peek());// 1st in
        System.out.println(q.element()); //1st in
        System.out.println(q);
        System.out.println(q.size());




    }

}




