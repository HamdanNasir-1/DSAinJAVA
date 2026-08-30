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
    // Insert at Tail/Last.....

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

    public void InsertMiddle(int data, int index) {
        if (index == 0) {
            InsertHead(data);
        } else if (index == size + 1) {
            InsertTail(data);
        } else {
            int counter = 0;
            Node<Integer> newNode = new Node();
            Node<Integer> temp = head;
            while (counter < index - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Successfull Insertion......");
        size++;
    }

    public void Print(){
        Node<Integer> newNode = head;

        while(newNode != null){
            System.out.println("Data is -> "+newNode.data);
            newNode = newNode.next;
        }
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