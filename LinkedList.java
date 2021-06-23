class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insertAtStart(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node new_node = new Node(val);
            new_node.next = head;
            head = new_node;
        }

    }

    void insertAtGivenLocation(int val, int key) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node n = head;
            while (n.data != key) {
                n = n.next;
            }
            Node new_node = new Node(val);
            new_node.next = n.next;
            n.next = new_node;
        }
    }

    void insert(int d) {
        if (head == null) {
            head = new Node(d);
        } else {
            Node new_node = new Node(d);
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new_node;
        }

    }

    void show() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insert(1);
        llist.insert(2);
        llist.insert(3);
        llist.insert(4);
        llist.insertAtStart(5);
        llist.insertAtGivenLocation(6, 2);

        llist.show();
    }

}