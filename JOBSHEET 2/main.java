public class main { 
    public static void main(String[] args) { 
        mahasiswa mahasiswa1 = new mahasiswa( 
            "2441070001", 
            "Saum", 
            "Sistem Informasi Bisnis", 
            3 
        ); 
        
        mahasiswa mahasiswa2 = new mahasiswa( 
            "2441070002", 
            "Budi", 
            "Sistem Informasi Bisnis", 
            3 
        ); 
        
        buku buku1 = new buku( 
            "B001", 
            "Laskar Pelangi", 
            "Andrea Hirata", 
            2005 
        ); 
        
        buku buku2 = new buku( 
            "B002", 
            "Bumi", 
            "Tere Liye", 
            2014 
        ); 
        
        System.out.println("=== DATA MAHASISWA 1 ==="); 
        mahasiswa1.tampilkanBiodata(); 
        mahasiswa1.cetakJurusan(); 
        
        System.out.println("\n=== DATA MAHASISWA 2 ==="); 
        mahasiswa2.tampilkanBiodata(); 
        
        System.out.println("\n=== DATA BUKU 1 ==="); 
        buku1.tampilkanInfo(); 
        
        buku1.cekBukuLama(); 
        System.out.println("\n=== DATA BUKU 2 ==="); 
        buku2.tampilkanInfo(); 
        buku2.cekBukuLama(); 
    } 
}