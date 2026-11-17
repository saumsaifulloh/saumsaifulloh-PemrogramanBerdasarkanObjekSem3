public class Main {
    public static void main(String[] args) {
        MotorListrik listrik = new MotorListrik("Honda", "EM1 e:", 1.5, 60);
        MotorBensin bensin = new MotorBensin("Honda", "Vario 125", 5.5, 3.0);

        listrik.getInfo();
        listrik.nyalakan();
        listrik.aktifkanModeHemat();
        listrik.isiEnergi();
        System.out.printf("Sisa jarak setelah pengisian: %.2f km%n", listrik.hitungSisaJarak());

        System.out.println();
        bensin.getInfo();
        bensin.nyalakan();
        bensin.gantiOli();
        bensin.isiEnergi();
        System.out.printf("Sisa jarak setelah pengisian: %.2f km%n", bensin.hitungSisaJarak());
    }
}
