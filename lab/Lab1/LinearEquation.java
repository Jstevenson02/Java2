import java.util.Scanner;

public class LinearEquation {

    private static Scanner input = new Scanner(System.in);

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getD() {
        return this.d;
    }

    public double getX() {
        return ((e * d) - (b * f) / (a * d) - (b * c));
    }

    public double getY() {
        return ((a * f) - (e * c) / (a * d) - (b * c));
    }

    public boolean isSolvable() {
        if (a * d - b * c != 0)
            return true;
        else
            return false;
    }

    public LinearEquation a(double a) {
        return this;
    }

    public LinearEquation b(double b) {
        return this;
    }

    public LinearEquation c(double c) {
        return this;
    }

    public LinearEquation d(double d) {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LinearEquation)) {
            return false;
        }
        LinearEquation linearEquation = (LinearEquation) o;
        return a == linearEquation.a && b == linearEquation.b && c == linearEquation.c && d == linearEquation.d;
    }

    @Override
    public String toString() {
        return "{" +
                " a='" + getA() + "'" +
                ", b='" + getB() + "'" +
                ", c='" + getC() + "'" +
                ", d='" + getD() + "'" +
                ", e='" + getE() + "'" +
                ", f='" + getF() + "'" +
                "}";
    }

    public static LinearEquation readEquation() {
        System.out.println("Enter a, b, c, d, e, f:");

        LinearEquation le = new LinearEquation(input.nextDouble(),
                input.nextDouble(),
                input.nextDouble(),
                input.nextDouble(),
                input.nextDouble(),
                input.nextDouble());
        return le;
    }

    public static void printaAlllEquations(LinearEquation[] le) {
        for (LinearEquation e : le) {
            System.out.println(e);
        }
    }

    public static boolean linesIntersect(LinearEquation[] equations) {

        if (equations[0].getX() == equations[1].getX() && equations[1].getX() == equations[2].getX()
                && equations[0].getY() == equations[1].getY() && equations[1].getY() == equations[2].getY()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        LinearEquation[] ar = new LinearEquation[3];
        System.out.println("Enter 3 linear equations: ");
        for (int i = 0; i < 3; i++) {
            ar[i] = LinearEquation.readEquation();
        }

        printAllEquations(ar);

        if (linesIntersect(ar))
            System.out.println("There is a solution, all lines intesect at same point " +
                    " X: " + ar[0].getX() +
                    " Y: " + ar[0].getY());

        else
            System.out.println("No solution!");
    }

    public static void printAllEquations(LinearEquation[] ar) {
        for (LinearEquation e : ar)
            System.out.println(e);
    }
}