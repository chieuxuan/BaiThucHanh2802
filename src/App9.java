import java.util.Scanner;

public class App9 {
    private static Object num2;
    private static Object reversed;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1,reversed = 0;
            System.out.println("\nNhap so nguyen duong : ");
            num1 = sc.nextInt();
            while(num1 != 0) {
              int digit = num1 % 10;
              reversed = reversed * 10 + digit;
              num1 /= 10;
            }
        }
        System.out.printf("So %d sau khi dao nguoc la: %d", num2, reversed);
      }
    }
