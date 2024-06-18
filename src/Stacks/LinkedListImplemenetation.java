package Stacks;

public class LinkedListImplemenetation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static class Stacks{

        Node Head=null;
        int size=0;

        void push(int a){
            Node temp=new Node(a);
            temp.next=Head;
            Head=temp;
            size++;
        }
        void displayrev(Node Head){
            if(Head==null){
                return;
            }
            displayrev(Head.next);
            System.out.print(Head.data+" ");
        }
        void display(){//reverse
            displayrev(Head);
        }
        boolean isEmpty(){
            if(size()==0){
                return true;
            }
            return false;
        }


        int size(){
            Node temp=Head;
            int count=0;
            while(temp!=null){
                count=count+1;
                temp=temp.next;
            }
            return count;
        }

        int pop(){
            if(Head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=Head.data;
           Head=Head.next;
           return x;
        }
        int peek(){
            if(Head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return Head.data;
        }

    }
    public static void main(String[] args) {
      Stacks st=new Stacks();
      st.push(90);
      st.push(67);
      st.push(87);
      st.display();
        System.out.println();
        System.out.println( st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());


    }

}
