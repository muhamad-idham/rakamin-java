package FirstProgram;

import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password : "); // Input password
        String validPassword = "password"; // Definisi variabel validPassword

        // Jika benar maka selamat datang bos
        if(password.equals(validPassword)) {
            System.out.println("Selamat datang bos!");
        }
        // Jika salah (else) maka error message
        else {
            System.out.println("Password salah, coba lagi");
        }

        System.out.println("Terima kasih sudah menggunakan aplikasi kami");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
