public class buku { 
    String kodeBuku; 
    String judul; 
    String pengarang; 
    int tahunTerbit; 
    
    buku(String kodeBuku, String judul, String pengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul; 
        this.pengarang = pengarang; 
        this.tahunTerbit = tahunTerbit;
    } 
    
    void tampilkanInfo() { 
        System.out.println("Kode Buku : " + kodeBuku); 
        System.out.println("Judul : " + judul); 
        System.out.println("Pengarang : " + pengarang); 
        System.out.println("Tahun Terbit : " + tahunTerbit); 
    } 
    
    void ubahJudul(String judulBaru) { 
        judul = judulBaru; 
    } 
    
    void cekBukuLama() {
         if (tahunTerbit < 2010) { 
        System.out.println("Buku lama"); 
    } else { 
        System.out.println("Buku baru");
    } 
}
}