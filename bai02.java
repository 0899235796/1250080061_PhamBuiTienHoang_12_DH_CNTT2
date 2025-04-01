
package lab1;
import java.util.Scanner;

public class bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double chieudai = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieurong = scanner.nextDouble();
        double dientich = chieudai * chieurong;
        System.out.print("Dien tich HCN La: " + dientich);
}
}