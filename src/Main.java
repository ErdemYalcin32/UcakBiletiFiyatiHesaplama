import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini girin (Tek Yön için 1, Gidiş-Dönüş için 2): ");
        int yolculukTipi = scanner.nextInt();

        double fiyat = mesafe * 0.10;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                fiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                fiyat *= 0.9; 
            } else if (yas >= 65) {
                fiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                fiyat *= 2;
                fiyat *= 0.8;
            }

            System.out.println("Toplam Bilet Fiyatı: " + fiyat + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }

        scanner.close();
    }
}
