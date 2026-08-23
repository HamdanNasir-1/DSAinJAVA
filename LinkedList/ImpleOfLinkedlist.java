public class ImpleOfLinkedlist {

    Node<Integer> head;

    ImpleOfLinkedlist() {
        this.head = null;
    }

    public void InsertHead(int data) {
        Node<Integer> newNode = new Node(data);

        if (head == null) {
            newNode = head;
            System.out.println("Insertion Successfull.....");
            return;

        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion Successfull.....");
    }

    public void InsertTail(int data) {
        Node<Integer> newNode = new Node(data);
        if (head == null) {
            newNode = head;
            System.out.println("Insertion Successfull.....");
            return;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Insertion Successfull.....");
    }

    public void InsertAtBetween(int data, int index) {
        if (index == 0) {
            InsertHead(data);
        } else if (index == index + 1) {
            InsertTail(data);
        } else {
            int counter = 0;
            Node<Integer> newNode = new Node(data);
            Node<Integer> temp = head;
            while (counter < index - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        System.out.println("Insertion successfull.....");
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