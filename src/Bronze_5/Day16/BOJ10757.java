package Bronze_5.Day16;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //큰 수를 다룰 때 BigInteger를 사용할 수 있음
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        //add()메서드를 사용해야 함
        System.out.println(A.add(B));
    }
}
