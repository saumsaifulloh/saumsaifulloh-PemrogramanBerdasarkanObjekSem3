public class Main {
    public static void main(String[] args) {
        MotorListrik1 motorListrik = new MotorListrik(5.0, 60);
        MotorBensin1 motorBensin = new MotorBensin(10.0, 4.0);

        System.out.println("=== MOTOR LISTRIK ===");
        motorListrik.nyalakan();
        System.out.printf("Sisa jarak: %.2f km%n", motorListrik.hitungSisaJarak());
        motorListrik.aktifkanModeHemat();
        System.out.printf("Sisa jarak (mode hemat): %.2f km%n", motorListrik.hitungSisaJarak());
        motorListrik.isiEnergi();
        System.out.printf("Sisa jarak setelah mengisi: %.2f km%n", motorListrik.hitungSisaJarak());

        System.out.println("\n=== MOTOR BENSIN ===");
        motorBensin.nyalakan();
        System.out.printf("Sisa jarak: %.2f km%n", motorBensin.hitungSisaJarak());
        motorBensin.gantiOli();
        motorBensin.isiEnergi();
        System.out.printf("Sisa jarak setelah mengisi: %.2f km%n", motorBensin.hitungSisaJarak());
    }
}
