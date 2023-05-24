package isp.lab3.exercise1;

public class TreeTest {
    public static void main(String[] args) {
        // create a new Tree object
        Tree tree = new Tree();

        // test the grow(int meters) method
        tree.grow(5);
        assert tree.toString().equals("The height of the tree is 20 meters.") : "Grow method test failed";

        // test the toString() method
        assert tree.toString().equals("The height of the tree is 20 meters.") : "ToString method test failed";

        // test the default constructor
        Tree defaultTree = new Tree();
        assert defaultTree.toString().equals("The height of the tree is 15 meters.") : "Default constructor test failed";

        // print out the values
        System.out.println(tree.toString());
        System.out.println(defaultTree.toString());
    }
}



