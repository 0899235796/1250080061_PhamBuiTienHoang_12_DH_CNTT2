
package lab1;
import java.util.Scanner;

public class bai08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        int LaySoDauTien = LaySoDauTien(number);
        int LaySoCuoi = LaySoCuoi(number);
        System.out.println("Chu so dau tien: " + LaySoDauTien);
        System.out.println("Chu so tan cung: " + LaySoCuoi);
}
    public static int LaySoDauTien(int number) {
        number = Math.abs(number);  
        while (number >= 10) {
            number /= 10;  
        }
        return number;
}
    public static int LaySoCuoi(int number) {
        return Math.abs(number) % 10;
    }
}