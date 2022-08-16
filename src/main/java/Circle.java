public class Circle {

    double radius;

    public Circle(double radius){ //taken from solution
        this.radius = radius;
    }
//    Getter
    public double getRadius() {
        return radius;
    }

//    Setter
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

//    Getter
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public String toString() {
    return "Circle";
    }



}
