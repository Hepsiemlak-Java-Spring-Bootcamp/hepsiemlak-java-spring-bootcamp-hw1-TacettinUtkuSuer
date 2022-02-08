package com.company;

public class Main {

    public static void main(String[] args) {

        boolean ekranaAyrintilariYazdir=false;
        boolean enBuyukZincirDetaylariniYazdir=true;

        int sayac, enBuyukZincireAitSayi=0, enBuyukZincirAdedi=0;

        for(int sayilar=10; sayilar<=100; sayilar++){
            sayac=palindronik(sayilar,ekranaAyrintilariYazdir);
            if(sayac>enBuyukZincirAdedi){
                enBuyukZincirAdedi=sayac;
                enBuyukZincireAitSayi=sayilar;
            }
        }

        if(enBuyukZincirDetaylariniYazdir) {
            sayac = palindronik(enBuyukZincireAitSayi, enBuyukZincirDetaylariniYazdir);
            System.out.println("");
            System.out.println("=> En Uzun Zincire Sahip Sayılar: " + enBuyukZincireAitSayi +" ve "+tersSayi(enBuyukZincireAitSayi)+ ", Zincir Adedi: " + enBuyukZincirAdedi);
        }
    }

    public static long tersSayi(long sayi){
        long kalan;
        long yeniSayi=0;
        while(sayi != 0){
            kalan = sayi % 10;
            yeniSayi = yeniSayi * 10 + kalan;
            sayi = sayi / 10;
        }
        return yeniSayi;
    }

    public static long iterasyon(long sayi, boolean ekranaAyrintilariYazdir){
        if(ekranaAyrintilariYazdir) { System.out.print(". İşlem: "+sayi+" + "); }
        long tersCevrilmisSayi=tersSayi(sayi);
        sayi+=tersCevrilmisSayi;
        if(ekranaAyrintilariYazdir) { System.out.println(tersCevrilmisSayi+" = "+sayi);}
        return sayi;
    }

    public static long iterasyon(long sayi, boolean ekranaAyrintilariYazdir, int sayac){
        if(ekranaAyrintilariYazdir) { System.out.print(sayac); }
        return iterasyon(sayi, ekranaAyrintilariYazdir);
    }

    public static int palindronik(int sayi,boolean ekranaAyrintilariYazdir){
        if(ekranaAyrintilariYazdir) {
            System.out.println(sayi + ". Sayı");
            System.out.println("");
        }
        int sayac=0;
        long geciciToplamSayi = sayi;
        while((double)iterasyon(geciciToplamSayi,false)/geciciToplamSayi != 2){
            sayac++;
            geciciToplamSayi=iterasyon(geciciToplamSayi,ekranaAyrintilariYazdir,sayac);
        }
        if(ekranaAyrintilariYazdir) {
            System.out.println("");
            System.out.println("Toplam zincir sayısı: " + sayac );
            System.out.println("İşlemler Sonundaki Palindronik Sayı: " + geciciToplamSayi);
            System.out.println("*******************************************");
            }
        return sayac;
    }
}
