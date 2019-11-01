/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang dapat menampilkan spesifikasi sederhana Handphone   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone andro, bb, wipon;

        andro = new Android("Samsung", "Android", "Grand", 3000000);
        bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        wipon = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);

        ((Android) andro).setKeyStore("234ibfd3840fo");
        ((BlackBerry) bb).setPinBB("BHS249");
        ((WindowsPhone) wipon).setWpKeyStore("UUUQIJWORJ");

        andro.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((Android) andro).getKeyStore());

        bb.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((BlackBerry) bb).getPinBB());

        wipon.displayProduct();
        System.out.printf("Android Key Store\t: %s%n%n", ((WindowsPhone) wipon).getWpKeyStore());
    }

}
