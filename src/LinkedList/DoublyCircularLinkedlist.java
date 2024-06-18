package LinkedList;

public class DoublyCircularLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{

        void Display(Node Head){
            Node temp=Head;
            System.out.print(temp.data+" ");
            temp=Head.next;
            while(temp!=Head){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();

        }



    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(5);
        Node d=new Node(3);
        Node e=new Node(100);
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=a;
        a.prev=e;
        LinkedList list= new LinkedList();
        System.out.println("Our Doubly Circular Linked list is");
        list.Display(a);


    }
}
