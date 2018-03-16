import entity.BangunDatar;
import entity.Lingkaran;
import entity.PersegiPanjang;
import interfaces.Gambar;
import util.ConsolUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IvanAdhi on 16/03/18.
 */
public class Main {
    public static void main(String[] args) {
//        ConsolUtil cu = new ConsolUtil();
//        cu.tampilMenu();
//
//        ConsolUtil.tampilMenu();

        List<String> listNama = new ArrayList<String>();
        listNama.add("Ali".toLowerCase());
        listNama.add("Dany".toLowerCase());
        listNama.add("Bastian".toLowerCase());

        for (int i = 0; i < listNama.size(); i++) {
            if(listNama.get(i).equals("aLi")){
                System.out.println("Nama Ketemu");
                continue;
            }
        }


        if(listNama.contains(new String("ALI").toLowerCase())){
            System.out.println("Nama ditemukan");
        }else{
            System.out.println("Nama tidak ditemukan");
        }

        List<BangunDatar> bd = new LinkedList<BangunDatar>();

        String[] list1 = new String[8];


        bd.add(new Lingkaran("Lingkaran kecil","cm",2.2));
        System.out.println(ConsolUtil.writeLog("add Lingkaran Kecil"));
        bd.add(new Lingkaran("Lingkaran Besar", "m",10.4));
        System.out.println(ConsolUtil.writeLog("add Lingkaran Besar"));
        bd.add(new PersegiPanjang("Persegi kecil", "cm", 5,6));
        bd.add(new PersegiPanjang("Persegi Besar","m",100,80));

        for (int i = 0; i < bd.size(); i++) {
            System.out.println("Nama Bangun Datar: " + bd.get(i).getNama());
            System.out.println("Satuan: " + bd.get(i).getSatuan());
            System.out.println("Luas bidang: " + bd.get(i).hitungLuas());
            System.out.println("Keliling Bidang: " + bd.get(i).hitungKeliling());
            bd.get(i).mulaiGambar(Gambar.KUNING);
            System.out.println();
        }

    }
}
