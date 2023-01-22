import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i=0 ; i<=n; i++){
            for (int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * n - (2 * i + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}