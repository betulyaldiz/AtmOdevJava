package com.atm.odev.musteri;

public class KurumsalMusteri extends Musteri{
    private String sirketAdi;

    public KurumsalMusteri(Integer tcKimlikNo, String isimSoyisim, Float hesapBakiyesi, String musteriNo, String sirketAdi) {
        super(tcKimlikNo, isimSoyisim, hesapBakiyesi, musteriNo);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Şirket Adı:"+getSirketAdi());
    }
}
