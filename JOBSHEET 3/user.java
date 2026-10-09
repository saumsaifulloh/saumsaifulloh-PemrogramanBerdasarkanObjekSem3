public class user {

    // Atribut user.
    // Pada kode ini atribut masih menggunakan public,
    // sehingga dapat diakses langsung dari luar class.
    public String username;
    public String email;
    public String password;
    public String name;


    // Constructor untuk membuat object user.
    // Parameter yang diterima adalah username dan email.
    public user(String username, String email) {

        // Mengisi atribut username.
        this.username = username;

        // Mengisi atribut email.
        this.email = email;

        // Password diberikan nilai default.
        this.password = "polinema123";
    }


    // Method untuk menampilkan informasi user.
    public void displayInfo() {

        // Menampilkan username.
        System.out.println("Username: " + username);

        // Menampilkan email.
        System.out.println("Email: " + email);

        // Menampilkan password.
        System.out.println("Password: " + password);

        // Menampilkan nama.
        System.out.println("Name: " + name);
    }
}