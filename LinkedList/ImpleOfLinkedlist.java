public class ImpleOfLinkedlist {
    Node<Integer> head;

    ImpleOfLinkedlist() {
        this.head = null;
    }





    public void InsertHead(int data){
        Node<Integer> newNode = new Node(data);

        if(head==null){
            newNode= head;
            System.out.println("Insertion Successfull.....");
            return;
        }
        
    }

}

class Node<T> {
    T data;
    Node next;

    Node() {
        this.next = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}