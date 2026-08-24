public class ImpleOfLinkedlist {
    public static void main(String[] args) {
        
        ImpleOfLinkedlist obj = new ImpleOfLinkedlist();

        obj.InsertHead(56);
        obj.InsertHead(33);
        obj.InsertTail(67);
        obj.InsertAtBetween(87, 1);
        obj.printList();
        
        
        
    }
    Node<Integer> head;
    int size;
    ImpleOfLinkedlist() {
        this.head = null;
        this.size=0;
    }

    public void InsertHead(int data) {
        Node<Integer> newNode = new Node(data);

        if (head == null) {
            head = newNode;
            System.out.println("Insertion Successfull.....");
            size++;
            return;
            
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion Successfull.....");
        size++;
    }
    
    public void InsertTail(int data) {
        Node<Integer> newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("Insertion Successfull.....");
            size++;
            return;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Insertion Successfull.....");
        size++;
    }
    
    public void InsertAtBetween(int data, int index) {
        if (index == 0) {
            InsertHead(data);
        } else if (index == size + 1) {
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
        size++;
    }

    public void printList (){
        Node<Integer> temp = head;

        while(temp!=null){
            System.out.println("This is data of list :"+temp.data);
            temp = temp.next;
        }
    }


}

class Node<T> {
    T data;
    Node next;
skjdca
    Node() {
        this.next = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}