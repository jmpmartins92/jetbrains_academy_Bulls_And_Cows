import java.math.BigInteger;


class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {


        BigInteger doubleFac = BigInteger.ONE;
        BigInteger subtraction = new BigInteger("2");

        for (BigInteger num = BigInteger.valueOf(n);
             num.compareTo(BigInteger.ZERO) > 0;
             num = num.subtract(subtraction)) {
            doubleFac = doubleFac.multiply(num);
        }

        return doubleFac;
    }

}