public class Circle extends GeometricObject{
    double radius;

    public Circle()
    {
        radius = 1;
    }

    public Circle(double newRadius)
    {
        radius = newRadius;
    }

    public Circle(double newRadius, String newColor, boolean newFilled)
    {
        radius = newRadius;
        color = newColor;
        filled = newFilled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }

    public double getArea()
    {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getDiameter()
    {
        double diameter = 2 * radius;
        return diameter;
    }

    public String toString()
    {
        String details = "A circle created on " + dateCreated;
        return details;
    }

}
