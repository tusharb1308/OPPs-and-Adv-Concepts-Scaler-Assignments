public class Student {
    int age;
    String name;

    public Student(){
        this.age = 0;
        this.name = null;
    }

    public Student(int age){
        this.age = age;
        this.name = null;
    }

    public Student(String name){
        this.age = 0;
        this.name = name;
    }
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}
