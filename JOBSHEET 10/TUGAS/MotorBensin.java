public class MotorBensin extends KendaraanBermotor implements DapatDiisiEnergi {
    public double kapasitasBensin; // liter
    public double literBensin;

    public MotorBensin(String merk, String model, double kapasitasBensin, double literBensin) {
        super(merk, model);
        this.kapasitasBensin = kapasitasBensin;
        this.literBensin = Math.max(0, Math.min(kapasitasBensin, literBensin));
    }

    @Override
    public void nyalakan() {
        System.out.println("Mesin motor bensin dinyalakan.");
    }

    @Override
    public void isiEnergi() {
        literBensin = kapasitasBensin;
        System.out.println("Tangki motor bensin telah diisi penuh.");
    }

    @Override
    public double hitungSisaJarak() {
        return literBensin * 40.0;
    }

    public void gantiOli() {
        System.out.println("Oli motor bensin berhasil diganti.");
    }

    @Override
    public void getInfo() {
        System.out.println("=== MOTOR BENSIN ===");
        super.getInfo();
        System.out.println("Kapasitas tangki: " + kapasitasBensin + " liter");
        System.out.println("Isi bensin: " + literBensin + " liter");
        System.out.printf("Estimasi sisa jarak: %.2f km%n", hitungSisaJarak());
    }
}
