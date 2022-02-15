import java.math.BigInteger;

public class BigInt {

    public static int factorial(int number) {
        if (number == 1 || number == 0)
            return 1;
        int fact = 1;
        for (int i = number; i > 1; --i) {
            fact *= i;
        }
        return fact;
    }

    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) == 0 ||
                number.compareTo(BigInteger.ZERO) == 0)
            return BigInteger.ONE;
        BigInteger fact = BigInteger.ONE;
        for (BigInteger i = number; i.compareTo(BigInteger.ONE) > 0; i = i.subtract(BigInteger.ONE))
            fact = fact.multiply(i);
        return fact;
    }

    public static BigInteger[][] addMatrices(BigInteger[][] m1, BigInteger[][] m2) {

        BigInteger[][] result = new BigInteger[m1.length][m1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m1[i][j].add(m2[i][j]);
            }
        }
        return result;
    }

    public static BigInteger[][] multiplyMatrices(BigInteger[][] m1, BigInteger[][] m2) {

        BigInteger[][] result2 = new BigInteger[m1.length][m1[0].length];

        for (int i = 0; i < result2.length; i++) {
            for (int j = 0; j < result2[i].length; j++) {
                result2[i][j] = m1[i][j].multiply(m2[i][j]);
            }
        }
        return  result2;
    }

    public static void main(String[] args) {
        BigInteger[] ar1 = new BigInteger[] { new BigInteger("1"), new BigInteger("3") };
        BigInteger[] ar2 = new BigInteger[] { new BigInteger("2"), new BigInteger("4") };

        BigInteger[] ar3 = new BigInteger[] { new BigInteger("5"), new BigInteger("7") };
        BigInteger[] ar4 = new BigInteger[] { new BigInteger("6"), new BigInteger("8") };

        BigInteger[][] ar5 = new BigInteger[][] { ar1, ar2 };
        BigInteger[][] ar6 = new BigInteger[][] { ar3, ar4 };
        
        BigInteger[][] output2 = multiplyMatrices(ar5, ar6);
        BigInteger[][] output = addMatrices(ar5, ar6);

        for (int i = 0; i < output.length; i++) {
            for (BigInteger[] ar : output) {
                System.out.print(ar[i].toString() + " ");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        
        for (int i = 0; i < output2.length; i++) {
            for (BigInteger[] ar : output2) {
                System.out.print(ar[i].toString() + " ");
            }
            System.out.print("\n");
        }
    }
}2