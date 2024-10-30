import java.util.Scanner;
/**
 * Kelas Barang merepresentasikan sebuah barang dengan nama, jumlah, dan harga.
 * Kelas ini menyediakan constructor untuk inisialisasi data barang,
 * serta method untuk mendapatkan informasi barang dan menampilkannya.
 */
class Barang {

    private String nama;
    private int jumlah;
    private double harga;

    /**
     * Constructor untuk membuat objek Barang dengan nama, jumlah, dan harga tertentu.
     *
     * @param nama  nama barang
     * @param jumlah jumlah barang
     * @param harga harga barang per satuan
     */
    public Barang(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    /**
     * Mengembalikan nama barang.
     *
     * @return nama barang
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengembalikan jumlah barang.
     *
     * @return jumlah barang
     */
    public int getJumlah() {
        return jumlah;
    }

    /**
     * Mengembalikan harga barang.
     *
     * @return harga barang
     */
    public double getHarga() {
        return harga;
    }

    /**
     * Menampilkan informasi barang berupa nama, jumlah, dan harga ke konsol.
     */
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Harga Barang: " + harga);
    }
}

/**
 * Kelas InputHelper menangani operasi input dari pengguna melalui konsol.
 * Kelas ini menyediakan metode untuk input String, int, dan double.
 */
class InputHelper {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Meminta input string dari pengguna.
     *
     * @param message pesan yang ditampilkan kepada pengguna
     * @return input string dari pengguna
     */
    public String inputString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    /**
     * Meminta input integer dari pengguna.
     *
     * @param message pesan yang ditampilkan kepada pengguna
     * @return input integer dari pengguna
     */
    public int inputInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    /**
     * Meminta input double dari pengguna.
     *
     * @param message pesan yang ditampilkan kepada pengguna
     * @return input double dari pengguna
     */
    public double inputDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}

/**
 * Kelas utama InputGudang yang berfungsi sebagai entry point dari aplikasi.
 * Aplikasi ini menggunakan InputHelper untuk menerima input pengguna
 * dan membuat objek Barang berdasarkan input tersebut.
 */
public class InputGudang {

    public static void main(String[] args) {
        InputHelper inputHelper = new InputHelper();

        // Menggunakan InputHelper untuk input data
        String namaBarang = inputHelper.inputString("Masukkan nama barang: ");
        int jumlahBarang = inputHelper.inputInt("Masukkan jumlah barang: ");
        double hargaBarang = inputHelper.inputDouble("Masukkan harga barang: ");

        Barang barang = new Barang(namaBarang, jumlahBarang, hargaBarang);
        barang.tampilkanInfo();
    }
}
