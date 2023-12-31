package Basic;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị n: ");
        int n = scanner.nextInt();

        // Tính tổng 1 + 2 + ... + n
        int sum = calculateSum(n);
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);

        // Tính n!
        long factorial = calculateFactorial(n);
        System.out.println(n + "! = " + factorial);

        // Kiểm tra xem n có phải là số nguyên tố hay không
        if (isPrime(n)) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không là số nguyên tố.");
        }

        // Xuất ra mã nhị phân của n
        String binary = toBinary(n);
        System.out.println("Mã nhị phân ( phương thức ) của " + n + " là: " + binary);
        System.out.println("Mã nhị phân ( thủ công ) của " + n + " là: " + toBinaryHand(n));

        // Đóng Scanner sau khi sử dụng
        scanner.close();
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + calculateSum(n - 1);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public static String toBinaryHand(int n) {
        if (n == 0) {
            return "0"; // Xử lý trường hợp đặc biệt khi số n là 0
        }

        StringBuilder binary = new StringBuilder();
        int absN = Math.abs(n);

        while (absN > 0) {
            int remainder = absN % 2;
            binary.insert(0, remainder); // Chèn chữ số nhị phân vào đầu chuỗi
            absN = absN / 2;
        }

        if (n < 0) {
            binary.insert(0, "-"); // Nếu n là số âm, thêm dấu trừ vào đầu chuỗi
        }

        return binary.toString();
    }

}
//heloo