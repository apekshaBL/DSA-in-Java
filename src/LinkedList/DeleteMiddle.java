package LinkedList;

public class DeleteMiddle {
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
        void removeMid(){
            Node fast=Head;
            Node slow=Head;
            while(fast.next.next!=null &&  fast.next.next.next!=null ){
                fast=fast.next.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
        }
        void Display(){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(7);
        Node e=new Node(8);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("Our linked list is");
        list.Display();
        System.out.println("Linked list after removing right mid is");
        list.Head=a;
        list.removeMid();
        list.Display();


    }
}
