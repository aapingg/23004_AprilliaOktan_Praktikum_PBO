package Tugas10;
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    private String nim;
    private String nama;
    private String alamat;
    private String mataKuliah;
    private String nilai1;
    private String nilai2;
    private String nilai3;
    private String nilai4;
    private String nilai5;

    public Mahasiswa(String nim, String nama, String alamat, String mataKuliah, String nilai1, String nilai2, String nilai3, String nilai4, String nilai5) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    

    public String hitungNilaiAkhir() {
        double n1 = Double.parseDouble(nilai1);
        double n2 = Double.parseDouble(nilai2);
        double n3 = Double.parseDouble(nilai3);
        double n4 = Double.parseDouble(nilai4);
        double n5 = Double.parseDouble(nilai5);
        double nilaiAkhir = (n1*0.1) + (n2*0.15) + (n3*0.25) + (n4*0.15) + (n5*0.35);
        return String.valueOf(nilaiAkhir);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }
}