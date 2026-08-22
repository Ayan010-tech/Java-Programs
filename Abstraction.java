public class Abstraction {
    String name = "Ajay";
    int age = 25;
    void display(){
            System.out.println(name + age);
    }
    void update(){
        System.out.println("Update done");
    }
    
    public static void main(String[] args) {
        Abstraction obj = new Abstraction();
        obj.display();
    }
    
}