import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculatorBefore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun lahir Anda: ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;
        System.out.println("Umur Anda adalah: " + age + " tahun.");
        scanner.close();
    }
}
