import java.util.Vector;

public class vectorExp {
    public static void main(String[] args) {

        // Creating a Vector
        Vector<Integer> v = new Vector<>();

        // 1. Add elements
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        System.out.println("Vector: " + v);

        // 2. Add element at specific index
        v.add(2, 25);
        System.out.println("After adding 25 at index 2: " + v);

        // 3. Get element
        System.out.println("Element at index 1: " + v.get(1));

        // 4. Update element
        v.set(1, 50);
        System.out.println("After updating index 1: " + v);

        // 5. Remove element by index
        v.remove(2);
        System.out.println("After removing index 2: " + v);

        // 6. Remove element by value
        v.remove(Integer.valueOf(40));
        System.out.println("After removing 40: " + v);

        // 7. Check if element exists
        System.out.println("Contains 30? " + v.contains(30));

        // 8. Size of Vector
        System.out.println("Size: " + v.size());

        // 9. First and Last element
        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        // 10. Iterate through Vector
        System.out.println("Elements:");
        for (int x : v) {
            System.out.println(x);
        }

        // 11. Clear Vector
        v.clear();
        System.out.println("After clear: " + v);

        // 12. Check if empty
        System.out.println("Is Vector empty? " + v.isEmpty());
    }
}