package com.atm.odev.musteri;

public class Musteri {
    //ortak olan alanlar
    private Integer tcKimlikNo;
    private String isimSoyisim;
    private Float hesapBakiyesi;
    private String musteriNo;


    public Musteri(Integer tcKimlikNo, String isimSoyisim, Float hesapBakiyesi, String musteriNo) {
        this.tcKimlikNo = tcKimlikNo;
        this.isimSoyisim = isimSoyisim;
        this.hesapBakiyesi = hesapBakiyesi;
        this.musteriNo = musteriNo;
    }
    public Integer getTcKimlikNo() {
        return tcKimlikNo;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public Float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setHesapBakiyesi(Float hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void bilgileriYazdir(){
        System.out.println("Merhaba " + getIsimSoyisim()+ "!");
        System.out.println("Müşteri Tc Kimlik No:" + getTcKimlikNo());
        System.out.println("Müşteri Hesap Bakiyesi:" + getHesapBakiyesi());
    }
}
