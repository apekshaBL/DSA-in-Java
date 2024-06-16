package LinkedList;

public class GetElement {
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
       int getElem(int idx){
           Node temp=Head;
           if(temp==null){
               System.out.println("Empty linked list");

           }
           else{
               for(int i=0;i<=idx-1;i++){
                   temp=temp.next;
               }

           }
           return temp.data;

       }
    }
    public static void Display(Node Head){
        while(Head!=null){
            System.out.print(Head.data+" ");
            Head=Head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(89);
        Node b=new Node(78);
        Node c=new Node(324);
        Node d=new Node(23);
        Node e=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Our Linked list is");
        Display(a);
        linked_list list=new linked_list();
        list.Head=a;
        System.out.println("Get the element of linked list of given index");
        System.out.println(list.getElem(0));

    }
}
