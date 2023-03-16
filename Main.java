import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int kenar1, kenar2;
       double kenar3;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen 1. kenarı giriniz: ");
        kenar1 =girdi.nextInt();

        System.out.print("Lütfen 2. kenarı giriniz: ");
        kenar2 =girdi.nextInt();

        kenar3 = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.print("Hipotenüs: " + kenar3);
    }
}