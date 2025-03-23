package Silver.Silver_4.Day1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ9012_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            char[] arr = st.nextToken().toCharArray();

            int Rcnt = 0;
            int Lcnt = 0;
            boolean isDone = false;
            for (int j = 0; j < arr.length; j++) {
                char temp = arr[j];
                if (temp == ')') Rcnt++;
                else if (temp == '(') Lcnt++;

                if (Lcnt == 0 && Rcnt == 1) {
                    bw.append("NO" + "\n");
                    isDone = true;
                    break;
                }

                if ((Lcnt >= Rcnt && Rcnt > 0) || (Rcnt >= Lcnt && Lcnt > 0)) {
                    Lcnt--;
                    Rcnt--;
                }
            }
            if (!isDone) {
                if (Rcnt == Lcnt) bw.append("YES" + "\n");
                else bw.append("NO" + "\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
