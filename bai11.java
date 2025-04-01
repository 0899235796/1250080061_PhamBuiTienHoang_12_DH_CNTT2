package lab1;
import java.util.Scanner;
public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int number = scanner.nextInt();
        int SoDaoNguoc = SoDaoNguoc(number);
        System.out.println("So sau khi dao nguoc dc la: " + SoDaoNguoc);
}
    public static int SoDaoNguoc(int number) {
        int DaoNguoc = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            DaoNguoc = DaoNguoc * 10 + digit;
            number /= 10;
        }
        return DaoNguoc;
    }
}