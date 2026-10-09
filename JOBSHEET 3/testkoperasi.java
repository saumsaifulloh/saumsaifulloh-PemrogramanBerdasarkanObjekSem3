public class testkoperasi {

    // Method main adalah titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat object anggota bernama anggota1.
        // Constructor menerima:
        // nomor KTP = 111333444
        // nama = Donny
        // limit pinjaman = 5.000.000
        anggota anggota1 = new anggota(
            "111333444",
            "Donny",
            5000000
        );


        // Mengambil nama anggota menggunakan getter.
        // Karena atribut nama bersifat private,
        // kita tidak bisa mengaksesnya secara langsung.
        System.out.println("Nama Anggota: " + anggota1.getNama());

        // Mengambil limit pinjaman menggunakan getter.
        System.out.println(
            "Limit Pinjaman: " + anggota1.getLimitPinjaman()
        );


        // Menampilkan informasi bahwa program
        // akan mencoba melakukan pinjaman 10 juta.
        System.out.println("\nMeminjam uang 10.000.000...");

        // Memanggil method pinjam().
        anggota1.pinjam(10000000);

        // Menampilkan jumlah pinjaman setelah percobaan pinjam.
        System.out.println(
            "Jumlah pinjaman saat ini: "
            + anggota1.getJumlahPinjaman()
        );


        // Mencoba melakukan pinjaman sebesar 4 juta.
        System.out.println("\nMeminjam uang 4.000.000...");

        anggota1.pinjam(4000000);

        // Menampilkan jumlah pinjaman setelah peminjaman.
        System.out.println(
            "Jumlah pinjaman saat ini: "
            + anggota1.getJumlahPinjaman()
        );


        // Mencoba membayar angsuran sebesar 1 juta.
        System.out.println("\nMembayar angsuran 1.000.000");

        anggota1.angsur(1000000);

        // Menampilkan sisa pinjaman.
        System.out.println(
            "Jumlah pinjaman saat ini: "
            + anggota1.getJumlahPinjaman()
        );


        // Mencoba membayar angsuran sebesar 3 juta.
        System.out.println("\nMembayar angsuran 3.000.000");

        anggota1.angsur(3000000);

        // Menampilkan sisa pinjaman terakhir.
        System.out.println(
            "Jumlah pinjaman saat ini: "
            + anggota1.getJumlahPinjaman()
        );
    }
}