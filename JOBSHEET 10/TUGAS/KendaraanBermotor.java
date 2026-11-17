public abstract class KendaraanBermotor {
    public String merk;
    public String model;

    public KendaraanBermotor(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public abstract void nyalakan();
    public abstract void isiEnergi();
    public abstract double hitungSisaJarak();

    public void getInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
    }
}
