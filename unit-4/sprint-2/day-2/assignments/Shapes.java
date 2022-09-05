import java.awt.*;

public class Shapes {
    public void area(Circle circle){
        System.out.println("Area of circle "+circle.radius*circle.radius*3.14);


    }
    public void  area(Rectangle rectangle){
        System.out.println("Area of rectangle="+rectangle.length*rectangle.breath);

    }
    public void area(Square square){
        System.out.println("Area of Square= "+square.side*square.side);



    }




}
 class Circle{
    int radius ;

}
class Rectangle{
    int length;
    int breath;

}
class Square{
    int side;

}
class Main{
    public static void main(String[] args) {
        Shapes s1=new Shapes();
        Circle c1=new Circle();
        c1.radius=4;
        Rectangle r1=new Rectangle();
        r1.breath=4;
        r1.length=6;
        Square  sq1=new Square();
        sq1.side=4;
        s1.area(c1);
        s1.area(r1);
        s1.area(sq1);

    }
}

