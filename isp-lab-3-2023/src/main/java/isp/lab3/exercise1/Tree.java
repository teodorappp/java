package isp.lab3.exercise1;

public class Tree {
    private int height;

    public Tree() {
        height = 15;
    }

    public void grow(int meters) {
        if (meters >= 1) {
            height += meters;
        }
    }

    public String toString() {
        return "The height of the tree is " + height + " meters.";
    }
}