package javadocproj;

public class MyPoint {
    private double x;
    private double y;

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Create two points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        // Display the distance between point1 and point2
        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));

        System.out.println(point1);

        System.out.println(point1.distance(point2));

        System.out.println(point1.distance(point2.getX(), point2.getY()));
        
        System.out.println(point1.DistanceBetweenTwoPoints(point1, point2));

        System.out.println("Is Point1 the same as Point2: " + (point1 == point2));

    }

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    /** 
     * @return double
     */
    public double getX() {
        return x;
    }

    
    /** 
     * @return double
     */
    public double getY() {
        return y;
    }

    
    /** 
     * @param myPoint
     * @return double
     */
    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
    }

    
    /** 
     * @param x
     * @param y
     * @return double
     */
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

    
    /** 
     * @param pointA
     * @param pointB
     * @return double
     */
    private double DistanceBetweenTwoPoints(MyPoint pointA, MyPoint pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + Math.pow(pointA.getY() - pointB.getY(), 2));
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                "}";
    }

    
    /** 
     * @param other
     * @return boolean
     */
    @Override
    public boolean equals(Object other) {
        MyPoint otherPoint = (MyPoint) other;
        return this.getX() == otherPoint.getX() && this.getY() == otherPoint.getY();
    }
}
