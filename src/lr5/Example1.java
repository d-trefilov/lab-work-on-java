package lr5;

public class Example1 {

    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSymbol() {
        return (int) symbol;
    }

    public void printSymbol() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();

        obj.setSymbol('A');
        obj.printSymbol();
    }
}
