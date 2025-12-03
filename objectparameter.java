 class Rectangle{
    int length;
    int width;
    Rectangle(int l,int w){
        length=l;
        width=w;
    }
}
 class AreaCalculator{
    public int calculateArea(Rectangle rect){
        return rect.length * rect.width;
    }
}
public class objectparameter{
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,8);
        AreaCalculator calculator=new AreaCalculator();
        int area=calculator.calculateArea(box);
        System.out.println("Area:"+area);
    }
}