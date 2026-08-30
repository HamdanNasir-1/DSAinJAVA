public class pracitce {

    Node<Integer> head;
    int size;

    pracitce() {
        this.head = null;
        this.size = 0;
    }

    // Insertion at first/Head**
    public void InsertHead(int data) {
        Node<Integer> newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Successfull insertion....");
            size++;
            return;
        }
        newNode.next = head;
        System.out.println("Successfull insertion....");
        size++;
    }
    //Insert at Tail/Last.....
    
    public void InsertTail(int data) {
        Node<Integer> newNode = new Node();

        if (head == null) {
            head = newNode;
            System.out.println("Successfull insertion....");
            size++;
            return;
        }

        Node<Integer> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Successfull insertion .....");
        size++;
    }


}

class Node<T> {
    T data;
    Node next;

    public Node() {

    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}