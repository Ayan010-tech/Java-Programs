import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {
        List<String>list = new ArrayList();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("Array list is " + list);
        list.remove("Banana");
        System.out.println("List after removing banana = "+list);
        System.out.println("First element is "+list.getFirst());
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.sort(null);
    }
}
