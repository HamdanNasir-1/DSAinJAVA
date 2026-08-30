public class pracitce {

    Node<Integer> head;
    int size;

    pracitce() {
        this.head = null;
        this.size = 0;
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