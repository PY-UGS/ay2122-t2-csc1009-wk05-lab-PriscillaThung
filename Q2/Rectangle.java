public class Rectangle extends Shape {

    public Rectangle (double height, double width)
    {
        super(height, width);
        dim1 = height;
        dim2 = width;
    }

    public double area()
    {
        double area = dim1 * dim2;
        return area;
    }

    public String getShape()
    {
        return "Inside Area for Rectangle.";
    }

}
