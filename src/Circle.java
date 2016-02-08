public class Circle {
    /** The radius of a circle - p225 of Liang book*/
    private double radius;
    int year = 1980;
    int num = 1880;

    Object[][] anArray = new Object[5][8];  //this is an array of Object class
                                            // which all subclasses inherit from

    /** construct a a circle with radius 1 */
    public Circle() {
        radius = 3.0;
    }

    /** Contruct a circle with a specified radius */
    public Circle(double newRadius) {
        radius = newRadius;
    }

    /** Return radius */
    public double getRadius()  {
        return radius;
    }

    /** set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0 ) ? newRadius : 0;
    }

    /** Return the area of this circle */
    public double findArea()    {
        return radius * radius * Math.PI;
    }
}
    
