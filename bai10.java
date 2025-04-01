
package lab1;
import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap So Nguyen: ");
        int number = scanner.nextInt();
        int DemSO = DemSO(number);
        System.out.println("So chu so trong so " + number + " la: " + DemSO);
}
    public static int DemSO(int number) {
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }  
}