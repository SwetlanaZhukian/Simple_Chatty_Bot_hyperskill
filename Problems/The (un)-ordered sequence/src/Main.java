import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (n < temp) {
                count1++;
            } else if (n > temp) {
                count2++;
            } else {
                count1++;
                count2++;
            }

            count3++;
            temp = n;
        }


        if (count3 == count1 || count3 == count2) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}