public class SmartFridge extends Kulkas implements Audible {
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        if (volume > 0) volume -= 1;
    }

    @Override
    public void getInfo() {
        System.out.println("=== SMART FRIDGE ===");
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Ukuran Layar: " + ukuranLayar);
        System.out.println("Volume: " + volume);
    }
}
