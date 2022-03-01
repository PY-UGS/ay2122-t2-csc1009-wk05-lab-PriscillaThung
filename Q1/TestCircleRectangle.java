import java.util.Scanner;

public class TestCircleRectangle
{
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.toString());
        Scanner input = new Scanner(System.in);
        System.out.print("color: ");
        circle.SetColor(input.next());
        System.out.print("filled: ");
        circle.setFilled(input.nextBoolean());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.toString());
        System.out.print("color: ");
        rectangle.SetColor(input.next());
        System.out.print("filled: ");
        rectangle.setFilled(input.nextBoolean());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}