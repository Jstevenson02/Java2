import java.math.BigInteger;
import java.util.Scanner;

public class BigIntAskInput {
    public static int factorial(int number) {
        int fact = 1;

        if (number == 1 || number == 0) {
            return 1;
        }
        for (int i = number; i > 1; --i) {
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger fact = BigInteger.ONE;

        if (number.compareTo(BigInteger.ONE) == 0 || number.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        }
        for (BigInteger i = number; i.compareTo(BigInteger.ONE) > 0; i = i.subtract(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;
    }

    public static BigInteger[][] multiplyMatrices(BigInteger[][] m1, BigInteger[][] m2) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Multiply Matricies \n");
        System.out.println("Enter Length and Width of A\n");
        int m1length = scan.nextInt();
        int m1width = scan.nextInt();

        System.out.println("Enter Length and Width of B\n");
        int m2length = scan.nextInt();
        int m2width = scan.nextInt();

        BigInteger[][] A = new BigInteger[m1length][m1width];
        BigInteger[][] B = new BigInteger[m2length][m2width];
        BigInteger[][] C = new BigInteger[A.length][B[0].length];

        System.out.println("Enter Values of A:\n");
        for (int i = 0; i < m1length; i++) {
            for (int j = 0; j < m1width; j++) {
                A[i][j] = scan.nextBigInteger();
            }
        }
        System.out.println("Enter Values of B:\n");
        for (int i = 0; i < m2length; i++) {
            for (int j = 0; j < m2width; j++) {
                B[i][j] = scan.nextBigInteger();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = BigInteger.ZERO;
            }
        }
        if (A[0].length == B.length) {
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < B[0].length; j++) {
                    for (int k = 0; k < A[0].length; k++) {
                        C[i][j] = C[i][j].add(A[i][j].multiply(B[i][j])); // Result
                    }
                }
            }
        }
        System.out.println("Result of multiplying the two matricies is equal to: \n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        return C;
    }

    public static BigInteger[][] addMatrices(BigInteger[][] m3, BigInteger[][] m4) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Add Matricies \n");
        System.out.println("Enter Length and Width of A\n");
        int m3length = scan.nextInt();
        int m3width = scan.nextInt();

        System.out.println("Enter Length and Width of B\n");
        int m4length = scan.nextInt();
        int m4width = scan.nextInt();

        BigInteger[][] A = new BigInteger[m3length][m3width];
        BigInteger[][] B = new BigInteger[m4length][m4width];
        BigInteger[][] result = new BigInteger[A.length][B[0].length];

        System.out.println("Enter Values of A:\n");
        for (int i = 0; i < m3length; i++) {
            for (int j = 0; j < m3width; j++) {
                A[i][j] = scan.nextBigInteger();
            }
        }
        System.out.println("Enter Values of B:\n");
        for (int i = 0; i < m4length; i++) {
            for (int j = 0; j < m4width; j++) {
                B[i][j] = scan.nextBigInteger();
            }
        }
        System.out.println("Result of adding the two matricies is equal to: \n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                result[i][j] = A[i][j].add(B[i][j]);
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(new BigInteger("6")));

        BigInteger a = new BigInteger("9223372036854775807");
        Integer b = new Integer("4775807");

        System.out.println(b);
        System.out.println(a);

        BigInteger aPlus1 = a.add(BigInteger.ONE);
        System.out.println(aPlus1);

        BigInteger c = new BigInteger("20");
        BigInteger[] ar = c.divideAndRemainder(new BigInteger("3"));
        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println();

        BigInteger[][] m1 = new BigInteger[0][0];
        BigInteger[][] m2 = new BigInteger[0][0];
        multiplyMatrices(m1, m2);

        BigInteger[][] m3 = new BigInteger[0][0];
        BigInteger[][] m4 = new BigInteger[0][0];
        addMatrices(m3, m4);

    }
}
