
package lab1;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay (dd/mm/yyyy): ");
        String date = scanner.nextLine();
        ChiaNgay(date);
    }
        public static void ChiaNgay(String date) {
        if (date == null || date.trim().isEmpty()) {
            System.out.println("ngay khong hop le");
            return;
        }
        String[] dateParts = date.split("[/-]");
        if (dateParts.length != 3) {
            System.out.println("Ngay khong hop le");
            return;
        }
        String day = dateParts[0];
        String month = dateParts[1];
        String year = dateParts[2];
        System.out.println("Ngay: " + day);
        System.out.println("Thang: " + month);
        System.out.println("Nam: " + year);
    }
}
