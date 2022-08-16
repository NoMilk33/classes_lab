import static java.lang.Math.sqrt;

public class Rectangle {

    double length;
    double width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getPerimeter(){
        return 2 * (length * width);
    }

    public float getArea(){
        return length * width;
    }

    public double getDiagonal(){
        return sqrt((width*width) + (length*length));
    }


}
