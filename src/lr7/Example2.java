package lr7;

class SuperClass2 {
    private String text;

    public SuperClass2(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }
}

class SubClass2 extends SuperClass2 {
    public int number;

    public SubClass2(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setFields() { setText(""); this.number = 0; }
    public void setFields(String text) { setText(text); }
    public void setFields(int number) { this.number = number; }
    public void setFields(String text, int number) { setText(text); this.number = number; }
}

public class Example2 {
    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(5, "Text");
        obj.setFields("NewText", 10);
        System.out.println("Length: " + obj.getLength() + ", Number: " + obj.number);
    }
}
