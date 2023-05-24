package isp.lab3.exercise4;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2, 3);
        MyPoint p2 = new MyPoint(4, 5, 6);
        double distance1 = p1.distance(4, 5, 6);
        double distance2 = p1.distance(p2);
        System.out.println("Distance from p1 to (4, 5, 6): " + distance1);
        System.out.println("Distance from p1 to p2: " + distance2);
    }
}
