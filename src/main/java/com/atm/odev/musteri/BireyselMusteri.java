package com.atm.odev.musteri;

public class BireyselMusteri extends Musteri {

    private String evAdresi;

    public BireyselMusteri(Integer tcKimlikNo, String isimSoyisim, Float hesapBakiyesi, String musteriNo, String evAdresi) {
        super(tcKimlikNo, isimSoyisim, hesapBakiyesi, musteriNo);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Ev Adresi:"+ getEvAdresi());
    }
}
