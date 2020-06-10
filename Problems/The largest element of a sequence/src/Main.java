import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n;
        int result = 0;
       do {
           n = sc.nextInt();
          if (n > result) {
              result = n;
          }
          
        } while (n != 0);
         System.out.println(result);
    }
}
