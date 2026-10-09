public class userdemo {

    // Program mulai dijalankan dari method main.
    public static void main(String[] args) {

        // Membuat object user dengan username dan email.
        user user1 = new user(
            "annisa.nadya",
            "annisa.nadya@gmail.com"
        );

        // Memanggil method displayInfo()
        // untuk menampilkan informasi user.
        user1.displayInfo();
    }
}