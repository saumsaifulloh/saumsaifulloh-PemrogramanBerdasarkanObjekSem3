public class AbstractClassDemo {
    public static void main(String[] args) {
        System.out.println("=== Lebah ===");
        Hewan lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        System.out.println("\n=== Ular ===");
        Hewan ular1 = new Ular(true, 2.5, "Tikus", "Hutan");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
