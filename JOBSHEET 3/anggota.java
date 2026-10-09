public class anggota {

    // Atribut private digunakan untuk menerapkan enkapsulasi.
    // Data tidak bisa diakses langsung dari luar class.
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;


    // Constructor digunakan untuk memberikan nilai awal
    // ketika object anggota dibuat.
    public anggota(String nomorKTP, String nama, int limitPeminjaman) {

        // this.nomorKTP = atribut milik object
        // nomorKTP = parameter yang dikirim ke constructor
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;

        // Saat object anggota pertama kali dibuat,
        // jumlah pinjaman dimulai dari 0.
        this.jumlahPinjaman = 0;
    }


    // Getter untuk mengambil nilai nomor KTP.
    // Karena nomorKTP private, kita membutuhkan getter
    // untuk mengakses nilainya dari luar class.
    public String getNomorKTP() {
        return nomorKTP;
    }


    // Getter untuk mengambil nama anggota.
    public String getNama() {
        return nama;
    }


    // Getter untuk mengambil batas maksimal pinjaman.
    public int getLimitPinjaman() {
        return limitPeminjaman;
    }


    // Getter untuk mengambil jumlah pinjaman saat ini.
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }


    // Method untuk melakukan peminjaman uang.
    public void pinjam(int jumlah) {

        // Mengecek apakah jumlah pinjaman setelah ditambah
        // pinjaman baru masih tidak melebihi limit.
        if (jumlahPinjaman + jumlah <= limitPeminjaman) {

            // Jika memenuhi syarat, jumlah pinjaman ditambahkan.
            jumlahPinjaman += jumlah;

        } else {

            // Jika melebihi limit, pinjaman ditolak.
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }


    // Method untuk melakukan pembayaran angsuran.
    public void angsur(int jumlah) {

        // Menghitung minimal angsuran yaitu 10%
        // dari jumlah pinjaman yang sedang berjalan.
        int minimalAngsuran = (int) (jumlahPinjaman * 0.10);


        // Mengecek apakah angsuran kurang dari minimal 10%.
        if (jumlah < minimalAngsuran) {

            System.out.println(
                "Maaf, angsuran harus 10% dari jumlah pinjaman"
            );

        // Mengecek apakah jumlah angsuran lebih besar
        // daripada jumlah pinjaman.
        } else if (jumlah > jumlahPinjaman) {

            System.out.println(
                "Jumlah angsuran melebihi jumlah pinjaman."
            );

        } else {

            // Jika semua syarat terpenuhi,
            // jumlah pinjaman dikurangi dengan jumlah angsuran.
            jumlahPinjaman -= jumlah;
        }
    }
}