public class MotorListrik extends KendaraanBermotor implements DapatDiisiEnergi {
    public double kapasitasBaterai; // kWh
    public int persenBaterai; // 0-100

    public MotorListrik(String merk, String model, double kapasitasBaterai, int persenBaterai) {
        super(merk, model);
        this.kapasitasBaterai = kapasitasBaterai;
        this.persenBaterai = Math.max(0, Math.min(100, persenBaterai));
    }

    @Override
    public void nyalakan() {
        System.out.println("Motor listrik dinyalakan tanpa suara mesin.");
    }

    @Override
    public void isiEnergi() {
        persenBaterai = 100;
        System.out.println("Baterai motor listrik telah diisi hingga 100%.");
    }

    @Override
    public double hitungSisaJarak() {
        return kapasitasBaterai * persenBaterai / 100.0 * 35.0;
    }

    public void aktifkanModeHemat() {
        System.out.println("Mode hemat motor listrik diaktifkan.");
    }

    @Override
    public void getInfo() {
        System.out.println("=== MOTOR LISTRIK ===");
        super.getInfo();
        System.out.println("Kapasitas baterai: " + kapasitasBaterai + " kWh");
        System.out.println("Persen baterai: " + persenBaterai + "%");
        System.out.printf("Estimasi sisa jarak: %.2f km%n", hitungSisaJarak());
    }
}
