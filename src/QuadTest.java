//7. Define a class named Quadrilateral, it has length & breadth data members, a constructor and a method to display the dimensions.
// Define another class named Rectangle which inherits Quadrilateral and defines methods for calculating area and perimeter.
// Define another class name Cube which also inherits Quadrilateral and defines height data member, methods for calculating volume and displaying dimensions.
//Define another class named QuadTest which has main method, in it create two Rectangle and two Cube objects, display their dimensions
// and display the area & perimeter of the rectangles and volume of cubes.
class Quadrilateral {
    int l;
    int b;

    Quadrilateral(int l,int b) {
        this.l=l;
        this.b = b;
    }
    Quadrilateral(){
    }
    void display()
    {
        System.out.println("Displaying dimensions of rectangle:\nLength is "+ l + " and breadth is "+b);
    }
}
class Rectangle extends Quadrilateral
{
    Rectangle(int l, int b) {
        super(l, b);
    }

    int area()
    {
        return l*b;
    }
    int perimeter()
    {
        return 2*(l + b);
    }
}

class Cube extends Quadrilateral
{
    double r;
    Cube(double r){

        this.r=r;
    }
    double volume()
    {
        return 3.14*r*r*r;
    }

    void display()
    {
        System.out.println("Radius of cube is:"+r);
    }
}

public class QuadTest{
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle(10,20);
        Rectangle r2=new Rectangle(10,12);
        Cube c1=new Cube(10);
        Cube c2=new Cube(10);
        r1.display();
        r2.display();
        System.out.println("Area of r1 is:"+r1.area());
        System.out.println("Area of r2 is:"+r2.area());
        System.out.println("Perimeter of r1 is:"+r1.perimeter());
        System.out.println("Perimeter of r2 is:"+r2.perimeter());
        System.out.println("Volume of c2 is:"+c1.volume());
        System.out.println("Volume of c2 is:"+c2.volume());


    }
}
