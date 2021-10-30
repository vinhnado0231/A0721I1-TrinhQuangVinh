package ss10_stack_queue.bai_tap.trien_khai_queue_su_dung_dslk_vong;

public class TestQueue {
    public static void main(String[] args) {
        Queue circleQueue =new Queue();
        circleQueue.enQueue(10);
        circleQueue.enQueue(20);
        circleQueue.enQueue(30);
        circleQueue.enQueue(40);
        circleQueue.display();
        System.out.println("\nDelete");
        circleQueue.deQueue();
        circleQueue.deQueue();
        circleQueue.deQueue();
        circleQueue.display();
    }
}
