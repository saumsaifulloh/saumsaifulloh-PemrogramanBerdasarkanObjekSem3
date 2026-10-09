public class motordemo {

    // Program mulai dijalankan dari method main.
    public static void main(String[] args) {

        // Membuat object motor pertama.
        motor motor1 = new motor();

        // Mengisi nomor plat menggunakan setter.
        motor1.setPlatNomor("B 0838 XZ");

        // Mengatur kecepatan menjadi 50.
        // Nilai akan dicek melalui validasi di setKecepatan().
        motor1.setKecepatan(50);

        // Menampilkan informasi motor pertama.
        motor1.displayInfo();


        // Membuat object motor kedua.
        motor motor2 = new motor();

        // Mengisi nomor plat motor kedua.
        motor2.setPlatNomor("N 9840 AB");

        // Menghidupkan mesin motor kedua.
        motor2.setStatusMesin(true);

        // Mengatur kecepatan motor kedua menjadi 40.
        motor2.setKecepatan(40);

        // Menampilkan informasi motor kedua.
        motor2.displayInfo();


        // Membuat object motor ketiga.
        motor motor3 = new motor();

        // Mengisi nomor plat motor ketiga.
        motor3.setPlatNomor("D 8343 CV");

        // Mengatur kecepatan menjadi 60.
        motor3.setKecepatan(60);

        // Menampilkan informasi motor ketiga.
        motor3.displayInfo();
    }
}