class student{
    String name;
    int age;
    void display(){
        System.out.println("Name:"+name+",Age:"+age);
    }
}
public class ClassDemo{
    public static void main(String[]args){
        student s1=new student();
        s1.name="kishan";
        s1.age=21;
        s1.display();
    }
}