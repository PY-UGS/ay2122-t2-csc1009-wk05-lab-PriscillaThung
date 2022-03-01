public abstract class Shape {
    
    protected double dim1;
    protected double dim2;
    protected double PI = 3.14;

    public Shape(double newDim1, double newDim2)
    {
        dim1 = newDim1;
        dim2 = newDim2;
    }

    public abstract String getShape();
    public abstract double area();

}
