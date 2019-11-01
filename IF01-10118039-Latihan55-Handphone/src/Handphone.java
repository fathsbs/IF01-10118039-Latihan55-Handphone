/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menampilkan spesifikasi sederhana Handphone     
 */

/**
 *
 * @author Fatahillah Seno
 */
public class Handphone {

    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.printf("Manufaktur\t\t: %s%n", manufacture);
        System.out.printf("OS\t\t\t: %s%n", operatingSystem);
        System.out.printf("Model\t\t\t: %s%n", model);
        System.out.printf("Harga\t\t\t: %d%n", harga);
    }

}
