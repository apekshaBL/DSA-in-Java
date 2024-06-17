package LinkedList;

public class SplitLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node Head=null;
        void display(Node Head){
            Node temp=Head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void OddEven(Node Head){
            Node temp=Head;
            Node evenDemo=new Node(0);
            Node oddDemo=new Node(0);
            Node point2=oddDemo;
            Node point1=evenDemo;
            while(temp!=null){
                if(temp.data%2==0){
                    point1.next=temp;
                    point1=point1.next;
                }
                else{
                    point2.next=temp;
                    point2=point2.next;
                }
                temp=temp.next;
            }
            point1.next=null;
            point2.next=null;

            System.out.println("Odd list is");
            display(oddDemo.next);
            System.out.println("Even list is");
            display(evenDemo.next);
        }

    }
    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(29);
        Node c=new Node(35);
        Node d=new Node(62);
        Node e=new Node(50);
        Node f=new Node(64);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        LinkedList list=new LinkedList();
        System.out.println("Original linked list is");
        list.display(a);
        list.OddEven(a);



    }
}



