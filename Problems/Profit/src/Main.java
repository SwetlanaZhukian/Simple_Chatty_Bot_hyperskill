
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code he
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        double m1 = m;
       // double per = p/100;
        int year = 0;
        while (m1 < k) {
            double temp = m1 * p / 100.0;
            m1 = temp + m1;
            year++;
        }
        System.out.print(year);

    }
}
