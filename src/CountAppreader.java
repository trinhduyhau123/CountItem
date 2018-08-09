import java.util.Scanner;

public class CountAppreader {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi:");
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        int count =0;
        System.out.println("Nhập kí tự cần đếm: ");
        String x = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (x.charAt(0) == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+ x + " là "+ count+ " lần" );
    }
}
