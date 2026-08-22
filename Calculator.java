class Calc {
    int add(int x, int y) {
        return x + y;
    }

    int divide(int x, int y) {
        return x / y;
    }

}

public class Calculator {
    public static void main(String[] args) {

        int x = 4;
        int y = 2;
        Calc op = new Calc();
        System.out.println("Add:" + op.add(x, y));
        System.out.println("Division:" + op.divide(x, y));
    }
}
