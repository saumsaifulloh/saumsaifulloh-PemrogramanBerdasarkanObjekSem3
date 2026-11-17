public class TV extends AlatElektronik implements Audible {
    public String jenisLayar;
    public int volume;

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
        System.out.println("=== TV ===");
        super.getInfo();
        System.out.println("Jenis Layar: " + jenisLayar);
        System.out.println("Volume: " + volume);
    }
}
