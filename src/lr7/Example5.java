package lr7;

class SuperClass5 {
    private String text;

    public SuperClass5(String text) { this.text = text; }

    public void display() {
        System.out.println("SuperClass5: text=" + text);
    }
}

class SubClass5A extends SuperClass5 {
    protected int number;

    public SubClass5A(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void display() {
        System.out.println("SubClass5A: number=" + number);
    }
}

class SubClass5B extends SuperClass5 {
    protected char ch;

    public SubClass5B(String text, char ch) {
        super(text);
        this.ch = ch;
    }

    @Override
    public void display() {
        System.out.println("SubClass5B: ch=" + ch);
    }
}

public class Example5 {
    public static void main(String[] args) {
        SuperClass5 superObj = new SuperClass5("Hello");
        SubClass5A objA = new SubClass5A("Hello", 42);
        SubClass5B objB = new SubClass5B("Hello", 'Z');

        superObj.display();
        objA.display();
        objB.display();

        // Вызов через переменную суперкласса
        SuperClass5 ref;
        ref = objA;
        ref.display();
        ref = objB;
        ref.display();
    }
}
