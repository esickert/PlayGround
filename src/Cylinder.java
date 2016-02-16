// Cylinder.java: Class definition for describing Cylinder
public class Cylinder extends Circle    {
    private double length = 2.0;

    /** constructor of subclass Cylinder calling a constructor of superclass Circle */
    Cylinder()  {
        super(2.9); 
    }

    /** return length */
    public double getLength()   {
        return length;
    }

    /** Set length */
    public void setLength(double length)    {
        this.length = length;
    }

    /** Return the volumn of this cylinder */
    public double findVolumn()  {
        return findArea() * length;
    }
    
}
