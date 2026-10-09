public class motor {

    // Atribut dibuat private untuk menerapkan enkapsulasi.
    private String platNomor;
    private boolean statusMesin;
    private int kecepatan;


    // Method untuk menampilkan seluruh informasi motor.
    public void displayInfo() {

        // Menampilkan nomor plat motor.
        System.out.println("Plat Nomor: " + this.platNomor);

        // Jika statusMesin true maka tampil "On",
        // jika false maka tampil "Off".
        System.out.println(
            "Status Mesin: " + (this.statusMesin ? "On" : "Off")
        );

        // Menampilkan kecepatan motor.
        System.out.println("Kecepatan: " + this.kecepatan);

        // Garis pemisah output.
        System.out.println("==========================");
    }


    // Getter untuk mengambil nomor plat.
    public String getPlatNomor() {
        return platNomor;
    }


    // Setter untuk mengubah nomor plat.
    public void setPlatNomor(String platNomor) {

        // Mengubah atribut platNomor dengan nilai
        // yang diberikan melalui parameter.
        this.platNomor = platNomor;
    }


    // Getter untuk mengambil status mesin.
    public boolean getStatusMesin() {
        return statusMesin;
    }


    // Setter untuk mengubah status mesin.
    public void setStatusMesin(boolean statusMesin) {

        // Mengubah status mesin sesuai parameter.
        this.statusMesin = statusMesin;
    }


    // Getter untuk mengambil nilai kecepatan.
    public int getKecepatan() {
        return kecepatan;
    }


    // Setter untuk mengubah kecepatan.
    public void setKecepatan(int kecepatan) {

        // Kecepatan tidak boleh bernilai negatif.
        if (kecepatan < 0) {

            System.out.println("Kecepatan tidak boleh negatif");

        // Kecepatan maksimal yang diperbolehkan adalah 100.
        } else if (kecepatan > 100) {

            System.out.println("Kecepatan maksimal adalah 100");

        // Jika mesin mati, kecepatan tidak boleh lebih dari 0.
        } else if (!this.statusMesin && kecepatan > 0) {

            System.out.println(
                "Kecepatan tidak boleh lebih dari 0 jika mesin off"
            );

        } else {

            // Jika semua validasi terpenuhi,
            // kecepatan baru disimpan ke atribut.
            this.kecepatan = kecepatan;
        }
    }
}