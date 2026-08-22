import java.util.Scanner;
public class ScannerExample {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.next();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("My name is "+name);
        System.out.println("My age is " + age);
    }
}
