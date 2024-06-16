package LinkedList;

public class MidOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linked_list{
        Node Head=null;
       int mid(){
           Node fast=Head;
           Node slow=Head;
           while(fast!=null && fast.next!=null){
               slow=slow.next;
               fast=fast.next.next;

           }

           return slow.data;
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
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        System.out.println("Our linked list is");
        linked_list list=new linked_list();
        list.Head=a;
        list.display();
        System.out.println("middle value of linked list is");
        System.out.println(list.mid());

    }
}
