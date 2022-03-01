public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected java.util.Date dateCreated;

    public GeometricObject()
    {
        color = "white";
        filled = false;
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String newColor, boolean newFilled)
    {
        color = newColor;
        filled = newFilled;
    }

    public String getColor()
    {
        return color;
    }

    public void SetColor(String newColor)
    {
        color = newColor;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean newFilled)
    {
        filled = newFilled;
    }

    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString()
    {
        String stats = "color: " + getColor().toString() + " and filled: " + isFilled();
        return stats;
    }

}
