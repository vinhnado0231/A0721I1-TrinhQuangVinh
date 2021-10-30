package ss10_stack_queue.bai_tap.trien_khai_queue_su_dung_dslk_vong;

public class Queue implements Solution {
    Node front = null;
    Node rear = null;

    public Queue() {
    }

    static class Node {
        int data;
        Node link;

        public Node(int value) {
            this.data = value;
            this.link = null;
        }
    }

    public void enQueue(int value) {
        Node temp = new Node(value);
        if (front == null) {
            front = temp;
        } else {
            rear.link = temp;
        }
        rear = temp;
        rear.link = front;
    }

    public int deQueue() {
        if (front == null) {
            {
                System.out.println("Queue is empty");
            }
            return Integer.MIN_VALUE;
        }

        int value;
        if (front == rear) {
            value = front.data;
            front = null;
            rear = null;
        } else {
            Node temp = front;
            value = temp.data;
            front = front.link;
            rear.link = front;
        }
        return value;
    }

    public void display() {
        Node temp = front;
        System.out.println("Display: ");
        do {
            System.out.print(temp.data + "\t");
            temp = temp.link;
        } while (temp != front);
    }
}

