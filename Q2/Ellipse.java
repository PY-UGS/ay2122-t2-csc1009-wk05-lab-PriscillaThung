public class Ellipse extends Shape{

    public Ellipse (double majorAxis, double minorAxis)
    {
        super(majorAxis, minorAxis);
        dim1 = majorAxis;
        dim2 = minorAxis;
    }

    public double area()
    {
        double area = dim1 * dim2 * PI;
        return area;
    }
    
    public String getShape()
    {
        return "Inside Area for Ellipse.";
    }
}
