package Silver.Silver_5.Day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken()); //국가의 수
        int K = Integer.parseInt(st.nextToken()); //등수를 알고 싶은 국가번호

        int goldCnt = 0;
        int silverCnt = 0;
        int bronzeCnt = 0;

        ArrayList<Nation> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            Nation nation = new Nation(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            arr.add(nation);

            if (nation.num == K) {
                goldCnt = nation.gold;
                silverCnt = nation.silver;
                bronzeCnt = nation.bronze;
            }
        }

        int count = 0; //K국가보다 등수가 높은 나라의 수
        for (int i = 0; i < N; i++) {
            Nation nation = arr.get(i);
            if (nation.num != K) {
                if (nation.gold > goldCnt) count++;
                else if (nation.gold == goldCnt && nation.silver > silverCnt) count++;
                else if (nation.gold == goldCnt && nation.silver == silverCnt && nation.bronze > bronzeCnt) count++;
            }
        }

        System.out.println(count+1);
    }
}

class Nation {
    int num; //국가 번호
    int gold;
    int silver;
    int bronze;

    public Nation(int num, int gold, int silver, int bronze) {
        this.num = num;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}
