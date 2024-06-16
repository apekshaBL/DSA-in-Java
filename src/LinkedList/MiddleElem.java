package LinkedList;

public class MiddleElem {
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

        int mid(){
            Node fast=Head;
            Node slow=Head;
            while(fast!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
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
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        Node g=new Node(70);
        Node h=new Node(80);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("Our linked list is");
        list.display();
        System.out.println("middle left element of linked list is");
        System.out.println(list.mid());


    }
}
