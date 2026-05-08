package lr9.Example4;

public class Example {
    static void main(String[] args) {
        Node node0 = new Node(100, null);
        Node node1 = new Node(101, null);
        Node node2 = new Node(102, null);
        Node node3 = new Node(103, null);
        Node node4 = new Node(104, null);

        node0.refNext = node1;
        node1.refNext = node2;
        node2.refNext = node3;
        node3.refNext = node4;

        Node now = node0;

        while (now.refNext != null)
        {
            System.out.print(now.value + " ");
            now = now.refNext;
        }
    }
}
