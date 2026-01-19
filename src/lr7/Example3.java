package lr7;

class SuperClass3 {
    public int num;

    public SuperClass3(int num) { this.num = num; }

    public void setValues(int num) { this.num = num; }

    @Override
    public String toString() { return "SuperClass3: num=" + num; }
}

class SubClass3 extends SuperClass3 {
    public char ch;

    public SubClass3(int num, char ch) {
        super(num);
        this.ch = ch;
    }

    public void setValues(int num, char ch) {
        super.setValues(num);
        this.ch = ch;
    }

    @Override
    public String toString() { return "SubClass3: num=" + num + ", ch=" + ch; }
}

class SubSubClass3 extends SubClass3 {
    public String text;

    public SubSubClass3(int num, char ch, String text) {
        super(num, ch);
        this.text = text;
    }

    public void setValues(int num, char ch, String text) {
        super.setValues(num, ch);
        this.text = text;
    }

    @Override
    public String toString() { return "SubSubClass3: num=" + num + ", ch=" + ch + ", text=" + text; }
}

public class Example3 {
    public static void main(String[] args) {
        SubSubClass3 obj = new SubSubClass3(1, 'A', "Data");
        System.out.println(obj);
    }
}
