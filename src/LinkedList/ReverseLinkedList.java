package LinkedList;

public class ReverseLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void reverse(Node Head){
        if(Head==null){
            return;
        }
        reverse(Head.next);
        System.out.print(Head.data +" ");

    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Reverse Linked list is ");
        reverse(a);



    }
}
