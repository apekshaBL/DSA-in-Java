package LinkedList;

public class DeleteNode {
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
        int size(){
            int count=0;
            Node temp=Head;
            while(temp!=null){
                count=count+1;
                temp=temp.next;
            }
            return count;
        }
        void delete(int idx){
            Node temp=Head;
            if(Head==null){
                System.out.println("Empty linked list");
                return;
            }
            else if (idx < 0 || idx >= size()) {
                System.out.println("Index out of bounds");
                return;
            }
            else if(idx==0){
               Head=Head.next;
            }
            else if(idx==size()){
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                temp.next=null;
            }
            else{
                for(int i=1;i<=idx-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;

            }


        }
        void display(){
            while(Head!=null){
                System.out.print(Head.data+" ");
                Head=Head.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node a=new Node(78);
        Node b=new Node(12);
        Node c=new Node(64);
        Node d=new Node(1);
        Node e=new Node(0);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println("Linked list is");
        linked_list list=new linked_list();
        list.Head=a;
        list.display();
        System.out.println("size is");
        list.Head=a;
        System.out.println(list.size());
        System.out.println("Delete idx");
        list.delete(4);
        list.display();

    }
}
