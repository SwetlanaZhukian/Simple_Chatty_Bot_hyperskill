import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean one = a + b > c;
        boolean two = a + c > b;
        boolean three = b + c > a;
        if (one && two && three) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
