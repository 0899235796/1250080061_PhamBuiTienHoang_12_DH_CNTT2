
package lab1;
import java.util.Scanner;

public class bai07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem mon ly: ");
        double Ly = scanner.nextDouble();
        System.out.print("Nhap diem mon Hoa: ");
        double Hoa = scanner.nextDouble();
        System.out.print("Nhap diem mon Sinh: ");
        double Sinh = scanner.nextDouble();
        System.out.print("Nhap diem mon Toan: ");
        double Toan = scanner.nextDouble();
        System.out.print("Nhap diem mon May Tinh: ");
        double Maytinh = scanner.nextDouble();
        double TongDiem5Mon = Ly + Hoa + Sinh + Toan + Maytinh;
        double Tilephantram = (TongDiem5Mon / 50) *100;
        char hang;
        if (Tilephantram > 90) {
            hang = 'A';
        } else if (Tilephantram > 80) {
            hang = 'B';
        } else if (Tilephantram > 70) {
            hang = 'C';
        } else if (Tilephantram > 60) {
            hang = 'D';
        } else if (Tilephantram > 40) {
            hang = 'E';
        } else {
            hang = 'F';
        }
    System.out.println("Tong Diem 5 Mon: " + TongDiem5Mon + " / 500");
        System.out.println("Ti Le Phan Tram: " + Tilephantram + "%");
        System.out.println("Hang: " + hang);
}
}