package entity;

import interfaces.Gambar;
import interfaces.Perhitungan;

/**
 * Created by IvanAdhi on 16/03/18.
 */
public class BangunDatar implements Gambar, Perhitungan{
    private String nama;
    private String satuan;

    public BangunDatar(String nama, String satuan) {
        this.nama = nama;
        this.satuan = satuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    @Override
    public double hitungLuas() {
        return 0;
    }

    @Override
    public double hitungKeliling() {
        return 0;
    }

    @Override
    public void mulaiGambar(int kodeWarna) {

    }
}
