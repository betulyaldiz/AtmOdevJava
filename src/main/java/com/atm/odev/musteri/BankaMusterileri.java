package com.atm.odev.musteri;

import java.util.HashMap;
import java.util.Map;

public class BankaMusterileri {

    //müsterileri burada oluşturuyorum.

    public static Musteri bireysel1() {
        return new BireyselMusteri(12345678, "Betul Yaldiz", 50000f, "06200", "Yenimahalle/Ankara");
    }

    public static Musteri bireysel2() {
        return new BireyselMusteri(23456789, "Ayşe Bulut", 2000f, "54200", "Serdivan/Sakarya");
    }

    public static Musteri bireysel3() {
        return new BireyselMusteri(34567891, "Umut Yaldız", 30000f, "16200", "Yörükle/Bursa");
    }

    public static Musteri kurumsal1() {
        return new KurumsalMusteri(45678912, "Canan Uyanık", 80000f, "34200", "Testinium");
    }

    public static Musteri kurumsal2() {
        return new KurumsalMusteri(56789123, "Eda Aycan Polat", 1900f, "33200", "Testinium");
    }

    public static Musteri kurumsal3() {
        return new KurumsalMusteri(67891234, "Ahmet Uyanık", 100f, "32200", "Yemek Sepeti");
    }

    public static HashMap<String, Musteri> musteriler() {
        //HashMap<key,value>
        HashMap<String, Musteri> hm = new HashMap<String, Musteri>();
        hm.put(BankaMusterileri.bireysel1().getMusteriNo(),BankaMusterileri.bireysel1());
        hm.put(BankaMusterileri.bireysel2().getMusteriNo(),BankaMusterileri.bireysel2());
        hm.put(BankaMusterileri.bireysel3().getMusteriNo(),BankaMusterileri.bireysel3());
        hm.put(BankaMusterileri.kurumsal1().getMusteriNo(),BankaMusterileri.kurumsal1());
        hm.put(BankaMusterileri.kurumsal2().getMusteriNo(),BankaMusterileri.kurumsal2());
        hm.put(BankaMusterileri.kurumsal3().getMusteriNo(),BankaMusterileri.kurumsal3());
        return hm;
    }


}