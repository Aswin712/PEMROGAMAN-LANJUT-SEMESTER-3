package Modul2_Tugas3;

public class Pemesanan implements TIket {
    protected
    String nama;
    protected
    String asal;
    protected
    String tujuan;
    protected
    double Tiket;
    protected
    double diskon;

    public Pemesanan(String nama, String asal, String tujuan, double HargaTiket, double diskon) {
        this.nama = nama;
        this.asal = asal;
        this.tujuan = tujuan;
        this.Tiket = HargaTiket;
        this.diskon = diskon;
    }

    @Override
    public double hbt() {
        return Tiket - (Tiket * (diskon / 100));
    }

    @Override
    public double h() {
        return Tiket * (diskon / 100);
    }

    @Override
    public void t() {
        System.out.println("Nama Penumpang: " + nama);
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hbt());
        System.out.println("Jumlah Diskon: " + h());
    }
}
