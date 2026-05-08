package lr7;

//class SuperClass1 {
//    private String text;
//
//    public SuperClass1(String text) {
//        this.text = text;
//    }
//
//    @Override
//    public String toString() {
//        return "SuperClass1: " + text;
//    }
//}
//
//class SubClass1 extends SuperClass1 {
//    private String extraText;
//
//    public SubClass1(String text) {
//        super(text);
//        this.extraText = "";
//    }
//
//    public SubClass1(String text, String extraText) {
//        super(text);
//        this.extraText = extraText;
//    }
//
//    @Override
//    public String toString() {
//        return "SubClass1: " + super.toString() + ", " + extraText;
//    }
//}
//
//public class Example1 {
//    public static void main(String[] args) {
//        SubClass1 obj = new SubClass1("Hello", "World");
//        System.out.println(obj);
//    }
//}








































class SuperClassEx1
{
    private String text1;

    public SuperClassEx1(String textIn1)
    {
        this.text1 = textIn1;
    }
    public String getText1()
    {
        return text1;
    }

    @Override
    public String toString()
    {
        String tostr;
        tostr = "super" + "\n" +
                "Class Name: " + this.getClass().getSimpleName() + "\n" +
                "text1 = " + this.text1;

        return tostr;
    }
}

class SubClassEx1 extends SuperClassEx1
{
    String text2;

    public SubClassEx1(String text1)
    {
        super(text1);
    }

    public SubClassEx1(String text1, String textIn2)
    {
        super(text1);
        this.text2 = textIn2;
    }

    @Override
    public String toString()
    {
        String tostr;
        tostr = "sub" + "\n" +
                "Class Name: " + this.getClass().getSimpleName() + "\n" +
                "text1 = " + getText1() + "\n" +
                "text2 = " + this.text2;

        return tostr;
    }
}

public class Example1
{
    static void main(String[] args)
    {
        SuperClassEx1 spclex1 = new SuperClassEx1("Hello ");

        SubClassEx1 sbclex1 = new SubClassEx1("Hi, ", "World!");


        System.out.println(spclex1.toString());
        System.out.println(sbclex1.toString());
    }
}

