import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = 0;
        int count = 0;
        double sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                count++;
            }
        }
        result = sum / count;
        System.out.println(result);
    }
}