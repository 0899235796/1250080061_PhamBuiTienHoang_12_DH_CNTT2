
package lab1;
import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int number = scanner.nextInt();
        if (LaSoDoiXung(number)) {
            System.out.println(number + " la so doi xung");
        } else {
            System.out.println(number + " khong phai la so doi xung");
        }  
}
     public static boolean LaSoDoiXung(int number) {
        int SoGoc = number;
        number = Math.abs(number);
        int DaoNguoc = 0;
        while (number > 0) {
            int digit = number % 10;
            DaoNguoc = DaoNguoc * 10 + digit;
            number /= 10;
        }
        return SoGoc == DaoNguoc;
    }
}