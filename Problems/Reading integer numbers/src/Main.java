import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int number;
        for (int i = 0; i < 4; i++) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                System.out.println(number);
            }
        }
    }
}