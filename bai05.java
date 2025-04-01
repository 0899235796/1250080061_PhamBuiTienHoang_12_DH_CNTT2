
package lab1;
import java.util.Scanner;

public class bai05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int mot = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int hai = scanner.nextInt();
        System.out.print("Nhap so thu ba: ");
        int ba = scanner.nextInt();
        int min = Math.min(mot, Math.min(hai, ba));
        System.out.print("Gia tri nho nhat giua ba so la: " + min);
}
}