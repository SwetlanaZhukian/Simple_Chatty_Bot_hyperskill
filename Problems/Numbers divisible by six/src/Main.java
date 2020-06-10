import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int temp = sc.nextInt();
            if (temp % 6 == 0) {
                sum = sum + temp;
            }
        }
        System.out.println(sum);
    }
}