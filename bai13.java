package lab1;
import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String ChuoiDauVao = scanner.nextLine();
        int DemSo = DemSo(ChuoiDauVao);
        System.out.println("So tu trong chuoi la: " + DemSo);

}
    public static int DemSo(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");       
        return words.length;
    }
}