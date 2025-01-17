package AlgorithmCodingTest_JAVA.Chapter1_DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken()); //DNA 문자열의 길이
        int P = Integer.parseInt(st.nextToken());//부분 문자열의 길이
        char[] A = bf.readLine().toCharArray(); //DNA 문자열
        st = new StringTokenizer(bf.readLine());
        //부분 문자열에 포함돼야 할 최소 개수
        int[] checkArrCount = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())
                , Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int count = 0; //조건을 만족시키는 부분 문자열들 개수

        int[] myArrCount = new int[4]; //현재 부분 문자열 속 개수
        for (int i = 0; i < S-P+1; i++) {
            if (i == 0) { //처음의 부분 문자열 속 개수 저장
                for (int j = 0; j < P; j++) {
                    if (A[j] == 'A') myArrCount[0]++;
                    else if (A[j] == 'C') myArrCount[1]++;
                    else if (A[j] == 'G') myArrCount[2]++;
                    else if (A[j] == 'T') myArrCount[3]++;
                }
            } else { //이후 부분 문자열 속 개수 저장
                if (A[i-1] == 'A') myArrCount[0]--;
                else if (A[i-1] == 'C') myArrCount[1]--;
                else if (A[i-1] == 'G') myArrCount[2]--;
                else if (A[i-1] == 'T') myArrCount[3]--;

                if (A[i+P-1] == 'A') myArrCount[0]++;
                else if (A[i+P-1] == 'C') myArrCount[1]++;
                else if (A[i+P-1] == 'G') myArrCount[2]++;
                else if (A[i+P-1] == 'T') myArrCount[3]++;
            }

            boolean isOK = true;
            for (int j = 0; j < 4; j++) {
                if (myArrCount[j] < checkArrCount[j]) {
                    isOK = false;
                    break;
                }
            }
            if (isOK) count++;
        }

        System.out.println(count);

    }
}
