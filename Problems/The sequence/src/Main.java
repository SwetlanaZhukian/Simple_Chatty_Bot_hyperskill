import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int count1 = 0;
        int i = 1;
        while (count != n) {
            while (true) {
                System.out.print(i + " ");
                count1++;
                count++;
                if (count1 == i || count == n) {
                    break;
                }
            }
            i++;
            count1 = 0;

        }
    }
}
