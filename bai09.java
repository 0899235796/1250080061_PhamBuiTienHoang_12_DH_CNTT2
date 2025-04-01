
package lab1;
import java.util.Scanner;
public class bai09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so Nguyen ");
        int number = scanner.nextInt();
        int Tong = Tongcacso(number);
        int Tich = Tichcacso(number);
        System.out.println("Tong cac chu so: " + Tong);
        System.out.println("Tich cac chu so: " + Tich);
}
    public static int Tongcacso(int number) {
        number = Math.abs(number);
        int Tong = 0;
        while (number > 0) {
        Tong += number % 10;
            number /= 10;
        }
        return Tong;
    } 
    public static int Tichcacso(int number) {
        number = Math.abs(number);
        int Tich = 1;
        while (number > 0) {
            Tich *= number % 10;
            number /= 10;
        }
        return Tich;
    }
}