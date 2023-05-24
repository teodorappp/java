package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double distance(int x, int y, int z) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        int zDiff = this.z - z;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        int zDiff = this.z - another.getZ();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }
}


