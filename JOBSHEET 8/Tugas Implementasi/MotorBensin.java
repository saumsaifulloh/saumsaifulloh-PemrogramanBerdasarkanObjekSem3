public class MotorBensin extends KendaraanBermotor {
    private double kapasitasBensin; // liter
    private double literBensin;     // liter saat ini

    public MotorBensin(double kapasitasBensin, double literBensin) {
        if (kapasitasBensin <= 0 || literBensin < 0 || literBensin > kapasitasBensin) {
            throw new IllegalArgumentException("Jumlah bensin harus berada dalam kapasitas tangki.");
        }
        this.kapasitasBensin = kapasitasBensin;
        this.literBensin = literBensin;
    }

    @Override
    public void nyalakan() {
        if (literBensin > 0) {
            System.out.println("Motor bensin berhasil dinyalakan.");
        } else {
            System.out.println("Motor bensin tidak dapat menyala: bensin habis.");
        }
    }

    @Override
    public void isiEnergi() {
        literBensin = kapasitasBensin;
        System.out.printf("Pengisian bensin selesai. Bensin: %.2f liter.%n", literBensin);
    }

    @Override
    public double hitungSisaJarak() {
        return literBensin * 40.0; // asumsi efisiensi 40 km/liter
    }

    public void gantiOli() {
        System.out.println("Oli motor bensin berhasil diganti.");
    }
}
