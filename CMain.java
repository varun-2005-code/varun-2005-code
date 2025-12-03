class Test{
    void print(Test obj){
        System.out.println("method is called");

    }
    void call(){
        print(this);
    }
}
public class CMain{
    public static void main(String[] args){
        Test t=new Test();
        t.call();
    }
}