package lab1;
import java.util.Scanner;
public class bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();
         TachHoTen(fullName);
}
public static void TachHoTen(String fullName) {
        fullName = fullName.trim();
        String[] nameParts = fullName.split("\\s+");
        if (nameParts.length < 2) {
            System.out.println("Ten khong hop le");
            return;
        }
        String lastName = nameParts[0];
        String firstName = nameParts[nameParts.length - 1];
        String middleName = "";
        if (nameParts.length > 2) {
            middleName = String.join(" ", java.util.Arrays.copyOfRange(nameParts, 1, nameParts.length - 1));
        }
        System.out.println("Ho: " + lastName);
        System.out.println("Ten dem: " + middleName);
        System.out.println("Ten: " + firstName);
    }
}