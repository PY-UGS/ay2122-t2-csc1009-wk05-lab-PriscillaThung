public class Rectangle extends GeometricObject {
    double width;
    double height;

    public Rectangle()
    {
        width = 5;
        height = 5;
    }

    public Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(double newWidth, double newHeight, String newColor, boolean newFilled)
    {
        width = newWidth;
        height = newHeight;
        color = newColor;
        filled = newFilled;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double newWidth)
    {
        width = newWidth;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double newHeight)
    {
        height = newHeight;
    }

    public double getArea()
    {
        double area = height * width;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public String toString()
    {
        String details = "A rectangle created on " + dateCreated;
        return details;
    }

}
