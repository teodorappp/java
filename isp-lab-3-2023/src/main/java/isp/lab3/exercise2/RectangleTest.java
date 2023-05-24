package isp.lab3.exercise2;

public class RectangleTest {
    public static void main(String[] args) {
        // create a new Rectangle object with default values
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Area: " + rectangle1.getArea());

        // create a new Rectangle object with length 5, width 3, and default color
        Rectangle rectangle2 = new Rectangle(5, 3);
        System.out.println("\nRectangle 2:");
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Area: " + rectangle2.getArea());

        // create a new Rectangle object with length 4, width 2, and color blue
        Rectangle rectangle3 = new Rectangle(4, 2, "blue");
        System.out.println("\nRectangle 3:");
        System.out.println("Length: " + rectangle3.getLength());
        System.out.println("Width: " + rectangle3.getWidth());
        System.out.println("Color: " + rectangle3.getColor());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println("Area: " + rectangle3.getArea());
    }
}

