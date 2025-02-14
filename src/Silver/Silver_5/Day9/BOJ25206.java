package Silver.Silver_5.Day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double creditSum = 0;
        double multipleSum = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            creditSum += credit;
            switch (grade) {
                case "A+":
                    multipleSum += credit * 4.5;
                    break;
                case "A0":
                    multipleSum += credit * 4.0;
                    break;
                case "B+":
                    multipleSum += credit * 3.5;
                    break;
                case "B0":
                    multipleSum += credit * 3.0;
                    break;
                case "C+":
                    multipleSum += credit * 2.5;
                    break;
                case "C0":
                    multipleSum += credit * 2.0;
                    break;
                case "D+":
                    multipleSum += credit * 1.5;
                    break;
                case "D0":
                    multipleSum += credit * 1.0;
                    break;
                case "F":
                    multipleSum += credit * 0.0;
                    break;
                default:
                    creditSum -= credit; //P인 과목은 계산에서 제외함
                    break;
            }
        }
        System.out.println(multipleSum/creditSum);
    }
}
