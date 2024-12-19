package Modul2_Tugas3;

public class TiketPesawat extends Pemesanan {

    public TiketPesawat(info info) {
        super(info.nama(), info.asal(), info.tujuan(), info.hargaTiket(), info.diskon());
    }

}