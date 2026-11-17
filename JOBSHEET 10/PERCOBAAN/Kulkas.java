public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

    @Override
    public void getInfo() {
        System.out.println("=== KULKAS ===");
        super.getInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
