import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int n = sc.nextInt();
        boolean result = false;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            int number = sc.nextInt();
            if (number > high) {
                result = true;
            } else {
                result = false;
                j = i;
                break;
            }

        }
        if (result) {
            System.out.print("Will not crash");
        } else {
            System.out.print("Will crash on bridge " + j);
        }

    }
}