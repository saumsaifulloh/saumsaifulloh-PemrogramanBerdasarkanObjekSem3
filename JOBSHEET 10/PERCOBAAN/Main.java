public class Main {
    public static void main(String[] args) {
        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Samsung";
        kulkas.harga = 4500000;
        kulkas.warna = "Silver";
        kulkas.jumlahPintu = 2;
        kulkas.getInfo();

        System.out.println();
        TV tv = new TV();
        tv.merk = "LG";
        tv.harga = 3500000;
        tv.warna = "Hitam";
        tv.jenisLayar = "LED";
        tv.volume = 10;
        tv.naikkanVolume();
        tv.getInfo();

        System.out.println();
        SmartFridge smartFridge = new SmartFridge();
        smartFridge.merk = "Samsung";
        smartFridge.harga = 9000000;
        smartFridge.warna = "Putih";
        smartFridge.jumlahPintu = 2;
        smartFridge.ukuranLayar = "10 inci";
        smartFridge.volume = 5;
        smartFridge.naikkanVolume();
        smartFridge.getInfo();

        System.out.println();
        Kipas kipas = new Kipas();
        kipas.merk = "Maspion";
        kipas.harga = 350000;
        kipas.warna = "Putih";
        kipas.jenis = "Kipas Angin Meja";
        kipas.getInfo();
    }
}
