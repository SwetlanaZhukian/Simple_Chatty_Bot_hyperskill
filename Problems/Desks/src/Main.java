import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();
        int col3 = scanner.nextInt();
        int result = col1 / 2 + col1 % 2 + col2 / 2 + col2 % 2 + col3 / 2 + col3 % 2;
        System.out.println(result);


    }
}
