public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        this.nip = "-";
        this.nama = "Belum diisi";
        this.gaji = 0;
    }

    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        return "NIP: " + nip
                + "\nNama: " + nama
                + "\nGaji: Rp" + gaji;
    }
    }
