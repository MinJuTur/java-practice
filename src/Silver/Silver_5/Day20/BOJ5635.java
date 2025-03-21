package Silver.Silver_5.Day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people.add(new Person(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.yyyy < o2.yyyy) return o1.yyyy - o2.yyyy;
                else if (o1.yyyy > o2.yyyy) return o2.yyyy - o1.yyyy;
                else {
                    if (o1.mm < o2.mm) return o1.mm - o2.mm;
                    else if (o1.mm > o2.mm) return o2.mm - o1.mm;
                    else {
                        if (o1.dd < o2.dd) return o1.dd - o2.dd;
                        else if (o1.dd > o2.dd) return o2.dd - o1.dd;
                    }
                    
                }
                return 0;
            }
        });

        System.out.println(people.get(0).name);
        System.out.println(people.get(n-1).name);
    }
}

class Person {
    String name;
    int dd;
    int mm;
    int yyyy;

    public Person(String name, int dd, int mm, int yyyy) {
        this.name = name;
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
}
