import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else {
                n = n * 3 + 1;
                System.out.print(n + " ");
            }


        }
    }
}
