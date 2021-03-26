package data.structures.linear;

public class SingleLinkedList {
    private Node first = null;

    public void addFirst(int e) {
        this.first = this.isEmpty() ? new Node(e) : new Node(e, this.first);
    }

    public void addLast(int e) {
        if (this.isEmpty()) {
            this.first = new Node(e);
            return;
        }
        Node temp = this.first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
    }

    public void addAt(int e, int pos) {
        if (pos < 0) {
            throw new IndexOutOfBoundsException("pos cannot be negative");
        }
        if (pos == 0) {
            this.addFirst(e);
            return;
        }
        Node prev = null;
        var curr = this.first;
        while (curr != null && pos > 0) {
            prev = curr;
            curr = curr.next;
            pos--;
        }
        if (pos > 0) {
            throw new IndexOutOfBoundsException();
        }
        var newNode = new Node(e);
        newNode.next = curr;
        prev.next = newNode;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node temp = this.first;
        while (temp != null) {
            if (!builder.isEmpty()) {
                builder.append(", ");
            }
            builder.append(temp.data);
            temp = temp.next;
        }
        return builder.toString();
    }

    private static class Node {
        int data;
        Node next = null;

        public Node(int e) {
            this.data = e;
        }

        public Node(int e, Node next) {
            this.data = e;
            this.next = next;
        }
    }
}
