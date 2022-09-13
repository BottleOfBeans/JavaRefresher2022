/*
 * A point has two instance variables: x and y (ints)
 *
 * Two constructors:
 * No parameters: set the Point to (0,0)
 * Two parameters: one for x, and one for y
 *
 * get and set for x and y
 *
 * toString() use the format: (-3, 2)
 *
 * equals(Point other)
 * returns true if this and other have the same coordinates
 *
 * compareTo(Point other)
 * returns 0 if the two Points are equal
 * a negative number if the this is less than other
 * a positive number is this is greater than other
 *
 * the Point with the greater x coordinate
 * is greater
 * If the x coordinates are the same, the Point with
 * the greater y coordinate is greater
 */
public class Point {
    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public void Point(int givenx, int giveny) {
        x = givenx;
        y = giveny;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return ("(" + x + "," + y + ")");
    }

    public boolean equals(Point otherPoint) {
        if (otherPoint.toString() == ("(" + x + "," + y + ")")) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Point otherPoint) {
        if (x > otherPoint.getX()) {
            return 1;
        } else if (otherPoint.getX() > x) {
            return -1;
        } else if (otherPoint.getX() == x) {
            if (otherPoint.getY() > y) {
                return -1;
            } else if (otherPoint.getY() < y) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}


