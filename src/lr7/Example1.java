package lr7;

class SuperClass1 {
    private String text;

    public SuperClass1(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClass1: " + text;
    }
}

class SubClass1 extends SuperClass1 {
    private String extraText;

    public SubClass1(String text) {
        super(text);
        this.extraText = "";
    }

    public SubClass1(String text, String extraText) {
        super(text);
        this.extraText = extraText;
    }

    @Override
    public String toString() {
        return "SubClass1: " + super.toString() + ", " + extraText;
    }
}

public class Example1 {
    public static void main(String[] args) {
        SubClass1 obj = new SubClass1("Hello", "World");
        System.out.println(obj);
    }
}
