
public class FinalModifier {
     final String name = "Ajay";
     void changename(){
        name = "Vijay";
        System.out.println("Updated name: "+name);
     }
public static void main(String[] args) {
    FinalModifier obj = new FinalModifier();
    obj.changename();

    
}
    
}