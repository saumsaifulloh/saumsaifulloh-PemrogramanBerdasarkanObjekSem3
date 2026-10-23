public class InheritanceDemo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        Dosen dosen2 = new Dosen(
                "1987001",
                "Budi Santoso",
                7500000,
                "0012345678",
                "Basis Data"
        );

        dosen1.nip = "1987002";
        dosen1.nama = "Siti Aminah";
        dosen1.gaji = 8000000;
        dosen1.nidn = "0018765432";
        dosen1.bidang = "Pemrograman Java";

        System.out.println("=== DATA DOSEN 1 ===");
        System.out.println(dosen1.getInfo());

        System.out.println("\n=== DATA DOSEN 2 ===");
        System.out.println(dosen2.getInfo());
    }
}

