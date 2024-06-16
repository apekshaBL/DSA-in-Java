package LinkedList;

public class DeleteValue {
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

        void display(){
            Node temp=Head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        void deleteData(int value){
            Node temp=Head;
            if(value!=temp.data){
                System.out.println("value not found in linked list");
                return;

            }


            while(temp.data!=value){
                temp=temp.next;
            }
            temp.data=temp.next.data;

            temp.next=temp.next.next;

        }
    }

    public static void main(String[] args) {
        Node a=new Node(12);
        Node b=new Node(24);
        Node c=new Node(43);
        Node d=new Node(78);
        Node e=new Node(90);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Linked_list is-");
        linked_list list=new linked_list();
        list.Head=a;
        list.display();
        list.deleteData(90);
        list.display();


    }
}
