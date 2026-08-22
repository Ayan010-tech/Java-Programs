public class ClassConstructor {
    //instance variables - non static variables
String name;
int rollno;
//parameterised constructor
ClassConstructor(String n, int r){
    this.name = n;
    this.rollno = r;
}
public void Display(){
    System.out.println("Name: "+ name+" " + "Rollno:"+rollno);
}
    public static void main(String[] args){
        ClassConstructor obj = new ClassConstructor("Ayan", 155);
        obj.Display();
    }
}