package hw10;

import java.math.BigInteger;

public class hw17 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.toString(Long.MAX_VALUE)).add(BigInteger.ONE);
        for (int i = 0; i < 10; i++) {
            System.out.println(num.multiply(num));
            num=num.add(BigInteger.ONE);
        }
    }
}
