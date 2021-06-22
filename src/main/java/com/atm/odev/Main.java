package com.atm.odev;

import com.atm.odev.islem.Bankaİslemleri;
import com.atm.odev.islem.MusteriSorgulama;
import com.atm.odev.musteri.BankaMusterileri;
import com.atm.odev.musteri.BireyselMusteri;
import com.atm.odev.musteri.KurumsalMusteri;
import com.atm.odev.musteri.Musteri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz! \nMüşteri numaranızı giriniz: ");
        String musteriNo = MusteriSorgulama.Sorgula();
        Bankaİslemleri.islemSec(BankaMusterileri.musteriler().get(musteriNo));
    }
    static Scanner scan=new Scanner(System.in);
   }
