package Silver.Silver_5.Day12;

import java.io.*;
import java.util.*;

public class BOJ7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        //중복해서 enter 하는 사람이 있을 수 있기 때문에 set 을 사용
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) set.add(name);
            else if (log.equals("leave")) set.remove(name);
        }

        ArrayList<String> arr = new ArrayList<>(set);
        Collections.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
