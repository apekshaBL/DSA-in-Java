package LinkedList;
import java.util.Scanner;
public class RemoveFromNthEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linked_list{
        Node Head=null;
        Node tail=null;

        void removeNth(int idx){
            Node fast=Head;
            Node slow=Head;
            for(int i=1;i<=idx;i++){
                fast=fast.next;
            }
            if(fast==null){
                Head=Head.next;
                return;
            }
            while(fast.next!=tail){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        }


        void display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        linked_list list=new linked_list();
        System.out.println("Our linked list is");
        list.Head=a;
        list.display();
        System.out.println("Enter the index from end whose value we have to remove");
        int n=sc.nextInt();
        System.out.println("linked list after remove value of " +n+ " is");
        list.removeNth(n);
        list.display();



    }
}
