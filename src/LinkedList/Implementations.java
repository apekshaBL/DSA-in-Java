package LinkedList;

public class Implementations {
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
        void insertAtStart(int value){
            Node temp=new Node(value);
            if(Head==null){
                Head=temp;
                tail=temp;
            }
            else{
                temp.next= Head;
                Head=temp;
            }

        }
        void insertAtEnd(int value){
            Node temp=Head;
            Node a=new Node(value);
            if(temp==null){
                Head=a;
                tail=a;
            }
            else{
                tail.next=a;
                tail=a;
            }
        }

        void InsertAt(int idx,int value){
            Node a=new Node(value);
            Node temp=Head;
            if(idx==0){
                insertAtStart(value);
            }
            else if(idx==size(Head)){
                insertAtEnd(value);
            }
            else{
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                a.next=temp.next;
                temp.next=a;
            }

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
    public  static int size(Node Head){
        int count=0;
        Node temp=Head;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        return count;
    }
    public static void Display(Node Head){
        Node temp=Head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=a;
        System.out.println("Elements of all Linked list is");
        Display(temp);
        System.out.println("Size of linked list");
        System.out.println(size(a));
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("Insert the element at start");
        list.insertAtStart(45);
        list.display();
        list.tail=f;
        System.out.println("Insert At End");
        list.insertAtEnd(90);
        list.display();
        System.out.println("Insert At any index");
        list.InsertAt(8,898);
        list.display();
    }
}
