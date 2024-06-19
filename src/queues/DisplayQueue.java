package queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class DisplayQueue {
        public static void display(Queue<Integer>q){
            Queue<Integer>helper=new ArrayDeque<>();
            while(q.size()>0){
                System.out.print( q.peek()+" ");
                helper.add(q.poll());
            }
            while(helper.size()>0){
                q.add(helper.poll());
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of queue");
        int n=sc.nextInt();
        System.out.println("Enter the elements of queue");
        Queue<Integer>q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            q.add(x);
        }
        System.out.println("Our queue is");
        display(q);




    }
}
