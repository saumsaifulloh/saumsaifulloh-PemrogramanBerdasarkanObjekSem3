public class mahasiswa { 
    String nim; 
    String nama; 
    String jurusan; 
    int semester; 
    mahasiswa(String nim, String nama, String jurusan, int semester) { 
        this.nim = nim; 
        this.nama = nama; 
        this.jurusan = jurusan; 
        this.semester = semester; 
    } 
    
    void tampilkanBiodata() { 
        System.out.println("NIM : " + nim); 
        System.out.println("Nama : " + nama); 
        System.out.println("Jurusan : " + jurusan); 
        System.out.println("Semester : " + semester); 
    } 
    
    void naikSemester() {
         semester++; 
    } 
        
    void cetakJurusan() { 
    System.out.println("Jurusan : " + jurusan); 
    } 
}