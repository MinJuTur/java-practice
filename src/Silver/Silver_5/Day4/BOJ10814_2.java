package Silver.Silver_5.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10814_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        ArrayList<People> people = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            people.add(new People(Integer.parseInt(st.nextToken()), st.nextToken()));
        }

        for (People person : people) {
            System.out.println(person.age + " " + person.name);
        }
    }
}

class People implements Comparator<People> {

    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(People o1, People o2) {
        return 0;
    }
}
