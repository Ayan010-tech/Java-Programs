import java.util.ArrayList;
import java.util.Iterator;

public class collectionBasic {
    public static void main(String[] args) {
        System.out.println("Collection in Java");

        ArrayList<String> student = new ArrayList<>();

        // adding elements into student
        student.add("Frnd1");
        student.add("Frnd2");
        student.add("Frnd3");
        student.add("Frnd4");

        System.out.println("Student List is " + student);

        // for-each loop
        for (String name : student) {
            System.out.println("My name is " + name);
        }

        System.out.println(student.get(2));

        // Iterator
        Iterator<String> it = student.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}