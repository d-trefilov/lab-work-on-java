package lr7;

class ClassA4 {
    public char ch;

    public ClassA4(char ch) { this.ch = ch; }

    public ClassA4(ClassA4 other) { this.ch = other.ch; }
}

class ClassB4 extends ClassA4 {
    public String text;

    public ClassB4(char ch, String text) {
        super(ch);
        this.text = text;
    }

    public ClassB4(ClassB4 other) {
        super(other);
        this.text = other.text;
    }
}

class ClassC4 extends ClassB4 {
    public int number;

    public ClassC4(char ch, String text, int number) {
        super(ch, text);
        this.number = number;
    }

    public ClassC4(ClassC4 other) {
        super(other);
        this.number = other.number;
    }
}

public class Example4 {
    public static void main(String[] args) {
        ClassC4 obj = new ClassC4('X', "Text", 100);
        ClassC4 copy = new ClassC4(obj);
        System.out.println("Copy of ClassC4: " + copy.ch + ", " + copy.text + ", " + copy.number);
    }
}
