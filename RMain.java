class Rectangle{
    int length,width;
    Rectangle(){
        this(5,5);

    }
    Rectangle(int l,int w){
        length=l;
        width=w;

    }
    void area(){
        System.out.println("Area is: "+(length*width));
    }
}
class RMain{
    public static void main(String[] args) {
    Rectangle r=new Rectangle();
    r.area();
        
    }
}
