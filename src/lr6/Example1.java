package lr6;

public class Example1 {
    // Поля класса
    private char charField;
    private String stringField;

    // Метод для присваивания символьного значения
    public void setValue(char c) {
        charField = c;
    }

    // Метод для присваивания текстового значения
    public void setValue(String s) {
        stringField = s;
    }

    // Метод для присваивания значения из массива символов
    public void setValue(char[] arr) {
        if (arr.length == 1) {
            charField = arr[0];
        } else {
            stringField = new String(arr);
        }
    }

    // Метод для вывода значений полей
    public void printFields() {
        System.out.println("charField: " + charField);
        System.out.println("stringField: " + stringField);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();

        obj.setValue('A');
        obj.printFields();
        System.out.println("---");

        obj.setValue("Hello");
        obj.printFields();
        System.out.println("---");

        obj.setValue(new char[]{'B'});
        obj.printFields();
        System.out.println("---");

        obj.setValue(new char[]{'H', 'i'});
        obj.printFields();
    }
}

