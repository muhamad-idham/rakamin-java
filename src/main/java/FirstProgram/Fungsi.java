package FirstProgram;

import FirstProgram.Namaku;

public class Fungsi {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 10;

        Namaku.fungsiName();
        Namaku.namaSaya("Ujang");
        Namaku.namaSaya("Asep");

        Namaku.namaSaya("Dhama");

        tambah(x,y);
        tambah(x,z);
        tambah(y,z);
    }

    public static int tambah(int a, int b) {
        int hasilTambah = a + b;
        System.out.println("Hasil tambah "+a+ " dan "+b+ " adalah : "+hasilTambah );
        return hasilTambah;
    }
}
