package LinkedList;

public class LengthOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node Head){
       int count=0;
       while(Head!=null){
           count=count+1;
           Head=Head.next;
       }
       return count;
    }
    public static void Display(Node Head){
        while(Head!=null){
            System.out.print(Head.data+" ");
            Head=Head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(6);
        Node c=new Node(9);
        Node d=new Node(12);
        Node e=new Node(15);
        Node f=new Node(18);
        Node g=new Node(21);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        Node temp=a;
        System.out.println("Linked list is");
        Display(temp);
        System.out.println("Length of linked list is");
        System.out.println(length(a));


    }
}
