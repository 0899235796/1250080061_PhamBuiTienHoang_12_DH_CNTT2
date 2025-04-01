
package lab1;
import java.util.Scanner;

public class bai06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();
        if ( a + b > c && b + c > a && c + a > b ) {
            System.out.print("Day la mot tam giac");
} else {
            System.out.print("Day khong phai la mot tam giac");
}       
    }
}