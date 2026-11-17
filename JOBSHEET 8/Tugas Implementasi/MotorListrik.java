public class MotorListrik extends KendaraanBermotor {
    private double kapasitasBaterai; // kWh
    private int persenBaterai;       // 0-100
    private boolean modeHemat;

    public MotorListrik(double kapasitasBaterai, int persenBaterai) {
        if (kapasitasBaterai <= 0 || persenBaterai < 0 || persenBaterai > 100) {
            throw new IllegalArgumentException("Kapasitas harus > 0 dan persen baterai 0-100.");
        }
        this.kapasitasBaterai = kapasitasBaterai;
        this.persenBaterai = persenBaterai;
        this.modeHemat = false;
    }

    @Override
    public void nyalakan() {
        if (persenBaterai > 0) {
            System.out.println("Motor listrik berhasil dinyalakan.");
        } else {
            System.out.println("Motor listrik tidak dapat menyala: baterai kosong.");
        }
    }

    @Override
    public void isiEnergi() {
        persenBaterai = 100;
        System.out.println("Pengisian daya selesai. Baterai: " + persenBaterai + "%.");
    }

    @Override
    public double hitungSisaJarak() {
        double energiTersisa = kapasitasBaterai * persenBaterai / 100.0;
        double efisiensi = modeHemat ? 8.0 : 7.0; // asumsi km/kWh
        return energiTersisa * efisiensi;
    }

    public void aktifkanModeHemat() {
        modeHemat = true;
        System.out.println("Mode hemat motor listrik diaktifkan.");
    }
}
