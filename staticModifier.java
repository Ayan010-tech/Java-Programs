public class staticModifier {

    static int a = 10;
    int b = 20;
    static int c;

    static {
        c = a * 30;
        System.out.println("Static block called. Value of a: " + a);
    }

    public static void main(String[] args) {

        staticModifier obj = new staticModifier();

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + obj.b);
        System.out.println("Result is: " + c);
    }
}