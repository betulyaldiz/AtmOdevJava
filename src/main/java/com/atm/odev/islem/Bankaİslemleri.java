package com.atm.odev.islem;

import com.atm.odev.musteri.Musteri;

import java.util.Scanner;

public class Bankaİslemleri {
    static Scanner scan =new Scanner(System.in);
    public static float bakiye (Musteri musteri){
        System.out.println("Bakiye tutarı giriniz:");
        return scan.nextFloat();
    }

    public static void paraYatir(Musteri musteri){
        System.out.println("Hesabınıza yatırılacak tutarı giriniz:");
        float tutar=bakiye(musteri);
        float bakiye=musteri.getHesapBakiyesi();
        if (tutar<0){
            System.out.println("Lütfen geçerli bir tutar giriniz!");
        }
        else
            musteri.setHesapBakiyesi(bakiye+tutar);
        System.out.println("Güncel Bakiye:"+musteri.getHesapBakiyesi());
    }
    public  static void paraCek(Musteri musteri){
        System.out.println("Hesabınızdan çekilecek tutarı giriniz");
        float tutar=bakiye(musteri);
        float bakiye=musteri.getHesapBakiyesi();
        if(tutar>bakiye){
            System.out.println("Bakiyeniz yetersizdir!");
        }
        else if(tutar<0){
            System.out.println("Lütfen geçerli bir tutar giriniz!");
        }
        else
            musteri.setHesapBakiyesi(bakiye-tutar);
        System.out.println("Güncel Bakiye:"+musteri.getHesapBakiyesi());
            }
    public static void islemSec(Musteri musteri){
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n" +
                "1- Para Yatırma \n" +
                "2- Para Çekme ");
        String secim = scan.nextLine();

        switch (secim){
            case "1":
                Bankaİslemleri.paraYatir(musteri);
                scan.nextLine();
                break;
            case "2":
                Bankaİslemleri.paraCek(musteri);
                scan.nextLine();
                break;
            default:
                System.out.println("Yanlıs işlem seçimi.");
                break;
        }
        System.out.println("Yeni işlem yapmak istiyor musunuz? E/H");
        String yanit = scan.nextLine();
        switch (yanit){
            case "E":
                islemSec(musteri);
                break;
            case "H":
                System.out.println("Cıkıs yapılıyor..");
                break;
    }
}}
