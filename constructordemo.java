class student{
    String name;
    int age;
    student(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("Name:"+name+",Age:"+age);
    }
}
public class constructordemo{
    public static void main(String[]args){
        student s1=new student("rakesh",23);
        s1.display();
    }
}