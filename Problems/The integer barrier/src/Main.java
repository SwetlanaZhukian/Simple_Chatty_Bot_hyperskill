import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum = sum + n;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }
        System.out.print(sum);
    }
}