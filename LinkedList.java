public class LinkedList {
    
    private Node head;
    private int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int size() {
        return size;
    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }
    
    public void removeLast() {
        if (!isEmpty()) {
            if (head.getNext() == null) {
                head = null;
            } else {
                Node current = head;
                while (current.getNext().getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(null);
            }
            size--;
        }
    }
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    
    private class Node {
        
        private int data;
        private Node next;
        
        public Node(int data) {
            this.data = data;
            next = null;
        }
        
        public int getData() {
            return data;
        }
        
        public void setData(int data) {
            this.data = data;
        }
        
        public Node getNext() {
            return next;
        }
        
        public void setNext(Node next) {
            this.next = next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
    }
}
