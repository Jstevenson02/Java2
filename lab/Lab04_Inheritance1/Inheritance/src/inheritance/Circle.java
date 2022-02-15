package inheritance;

public class Circle
    extends GeometricObject {
  private double radius;

  public Circle() {
    super("blue", true);
    this.radius = 0;

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Return diameter */
  public double getDiameter() {
    return 2 * radius;
  }

  public double getPerimeter() {

    return 2 * radius * Math.PI;
  }

  /* Print the circle info */
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
        " and the radius is " + radius);
  }

  @Override
  public String toString() {
    super.toString();

    String s = super.toString();
    return s + "\nCircle{" + "radius=" + radius + '}';
  }

}
