public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public void getInfo() {
        System.out.println("=== KIPAS ===");
        super.getInfo();
        System.out.println("Jenis: " + jenis);
    }
}
