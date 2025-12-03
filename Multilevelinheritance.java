public class Multilevelinheritance{
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.weep();

        
    }
}
class Animal{
    void eat(){
        System.out.println("Animals can eat");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs can bark");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppies can weep");
    }
}