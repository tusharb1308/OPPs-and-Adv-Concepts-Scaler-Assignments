public class Student {
    int age;
    String name;

    void display(){
        System.out.println("My name is "+this.name+". I am "+this.age+" years old");
    }

    void sayHello(String param){
        System.out.println(this.name + " says hello to "+param);
    }

}
