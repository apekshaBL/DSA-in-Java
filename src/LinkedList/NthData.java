package LinkedList;
import java.util.Scanner;
public class NthData {
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

        int findData(int idx){
            Node fast=Head;
            Node slow=Head;
            for(int i=1;i<=idx;i++){
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
           return slow.data;

        }

        void display(Node Head){
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
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=a;
        linked_list list=new linked_list();
        System.out.println("Our linked list is");
        list.display(temp);
        System.out.println("Enter the end element whose value you want");
        int n=sc.nextInt();
        list.Head=a;
        System.out.println("The element at " +n+ " is");
        System.out.println(list.findData(n));



    }
}
