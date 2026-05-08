package lr9.Example5;

public class Example5_FromTail {
    static void main(String[] args) {

        Node head = null;
        Node tail = null;

        for (int i = 1; i <= 10; i++)
        {
            Node newNode = new Node(i, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.refNext = newNode;
                tail = newNode;
            }
        }


        Node now = head;
        while (now != null) {
            System.out.print(now.value + " ");
            now = now.refNext;
        }
    }
}
