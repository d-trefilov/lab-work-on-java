package lr9;

public class Example8 {

    private Node head;

    // Узел списка
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // ======================
    // а) Через цикл
    // ======================

    public void createHead(int[] arr) {
        head = null;
        for (int i = 0; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            n.next = head;
            head = n;
        }
    }

    public void createTail(int[] arr) {
        head = null;
        Node tail = null;

        for (int x : arr) {
            Node n = new Node(x);

            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head;

        while (cur != null) {
            sb.append(cur.data).append(" ");
            cur = cur.next;
        }

        return sb.toString();
    }

    public void addFirst(int value) {
        Node n = new Node(value);
        n.next = head;
        head = n;
    }

    public void addLast(int value) {
        Node n = new Node(value);

        if (head == null) {
            head = n;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = n;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node cur = head;

        for (int i = 0; cur != null && i < index - 1; i++) {
            cur = cur.next;
        }

        if (cur == null) return;

        Node n = new Node(value);
        n.next = cur.next;
        cur.next = n;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }

        cur.next = null;
    }

    public void remove(int index) {
        if (head == null) return;

        if (index == 0) {
            removeFirst();
            return;
        }

        Node cur = head;

        for (int i = 0; cur.next != null && i < index - 1; i++) {
            cur = cur.next;
        }

        if (cur.next != null) {
            cur.next = cur.next.next;
        }
    }

    // ======================
    // б) Рекурсия
    // ======================

    public void createHeadRec(int[] arr) {
        head = null;
        createHeadRec(arr, 0);
    }

    private void createHeadRec(int[] arr, int i) {
        if (i == arr.length) return;

        Node n = new Node(arr[i]);
        n.next = head;
        head = n;

        createHeadRec(arr, i + 1);
    }

    public void createTailRec(int[] arr) {
        head = createTailRec(arr, 0);
    }

    private Node createTailRec(int[] arr, int i) {
        if (i == arr.length) return null;

        Node n = new Node(arr[i]);
        n.next = createTailRec(arr, i + 1);
        return n;
    }

    public String toStringRec() {
        return toStringRec(head);
    }

    private String toStringRec(Node node) {
        if (node == null) return "";
        return node.data + " " + toStringRec(node.next);
    }

    // ======================
    // main для проверки
    // ======================

    public static void main(String[] args) {
        Example8 list = new Example8();

        int[] data = {1, 2, 3, 4};

        list.createTail(data);
        System.out.println("Список: " + list);

        list.addFirst(0);
        list.addLast(5);
        System.out.println("После добавлений: " + list);

        list.insert(2, 99);
        System.out.println("После вставки: " + list);

        list.removeFirst();
        list.removeLast();
        list.remove(2);
        System.out.println("После удалений: " + list);

        list.createTailRec(data);
        System.out.println("Рекурсивный: " + list.toStringRec());
    }
}