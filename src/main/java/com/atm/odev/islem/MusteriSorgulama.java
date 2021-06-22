package com.atm.odev.islem;

import com.atm.odev.musteri.BankaMusterileri;

import java.util.Scanner;

public class MusteriSorgulama {

    static Scanner scan = new Scanner(System.in);

    public static String Sorgula() {
        String musteriNo;
        while (true) {
            musteriNo = scan.nextLine();
            if (BankaMusterileri.musteriler().containsKey(musteriNo)) {
                BankaMusterileri.musteriler().get(musteriNo).bilgileriYazdir();
                break;
            }
            else
                System.out.println("Böyle bir müşteri bulunamamıştır..\n" + "Müşteri numaranızı tekrar giriniz:");
        }
        return musteriNo;
    }
}



