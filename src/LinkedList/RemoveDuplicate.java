package LinkedList;

public class RemoveDuplicate {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        void display(Node Head){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void Remove(Node Head){
            Node temp=Head;
            while(temp!=null && temp.next!=null){
                    if(temp.data==temp.next.data){
                        temp.next=temp.next.next;
                    }
                    else{
                        temp=temp.next;
                    }
            }
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(3);
        Node f=new Node(3);
        Node g=new Node(4);
        Node h=new Node(4);
        Node i=new Node(5);
        Node j=new Node(1);
        Node k=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        j.next=k;
        System.out.println("Original linked list is");
        LinkedList list=new LinkedList();
        list.display(a);
        System.out.println("Linked list after removing all the duplicates element is");
        list.Remove(a);
        list.display(a);


    }

}
