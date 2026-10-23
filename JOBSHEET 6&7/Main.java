public class Main {
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        kucing.nama = "Milo";
        kucing.umur = 2;
        kucing.warna = "Putih";
        kucing.jenisBulu = "Panjang";

        Anjing anjing = new Anjing();
        anjing.nama = "Bruno";
        anjing.umur = 3;
        anjing.warna = "Cokelat";
        anjing.jenisRas = "Bulldog";

        System.out.println("=== DATA KUCING ===");
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur);
        System.out.println("Warna: " + kucing.warna);
        System.out.println("Jenis bulu: " + kucing.jenisBulu);
        kucing.makan();
        kucing.mengeong();

        System.out.println();

        System.out.println("=== DATA ANJING ===");
        System.out.println("Nama: " + anjing.nama);
        System.out.println("Umur: " + anjing.umur);
        System.out.println("Warna: " + anjing.warna);
        System.out.println("Jenis ras: " + anjing.jenisRas);
        anjing.makan();
        anjing.menggonggong();
    }
}