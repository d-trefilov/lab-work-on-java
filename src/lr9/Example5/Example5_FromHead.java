package lr9.Example5;

public class Example5_FromHead {
    static void main(String[] args) {

        Node head = null;
        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }


        Node now = head;
        while (now.refNext != null)
        {
            System.out.print(now.value + " ");
            now = now.refNext;
        }
    }
}
