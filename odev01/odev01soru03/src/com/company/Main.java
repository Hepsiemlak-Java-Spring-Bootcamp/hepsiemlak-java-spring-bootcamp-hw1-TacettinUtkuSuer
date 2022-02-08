package com.company;

import com.company.ilan.OdaSayisi_ENUM;
import com.company.ilan.Ilan;
import com.company.kullanici.BireyselIKullanici;
import com.company.kullanici.KurumsalIKullanici;
import com.company.mesaj.Mesaj;
import com.company.ortakKullanim.IdOlustur;
import com.company.ortakKullanim.Il_ENUM;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    private static HashMap<Integer,Ilan> ilanlar = new HashMap<>();
    private static HashMap<Integer,BireyselIKullanici> bireyselKullanicilar = new HashMap<>();
    private static HashMap<Integer,KurumsalIKullanici> kurumsalKullanicilar = new HashMap<>();
    private static HashMap<Integer,Mesaj> mesajlar = new HashMap<>();
    private static IdOlustur idOlustur = new IdOlustur();

    public static void main(String[] args) {
        veritabani();

        System.out.println("İstanbul'da bulunan, 2+1 ve 3+1, fiyatı 3000TL'nin altında olan ilanların listesi:");
        for (Integer i : ilanlar.keySet() ) {
            if((ilanlar.get(i).getIl()==Il_ENUM.ISTANBUL)&&((ilanlar.get(i).getOdaSayisi()==OdaSayisi_ENUM.O1S1)||(ilanlar.get(i).getOdaSayisi()==OdaSayisi_ENUM.O2S1))&&((ilanlar.get(i).getFiyat().compareTo(new BigDecimal(3000)))==-1?true:false)){
                System.out.print(" -> İlan baslığı: " + ilanlar.get(i).getBaslik());
                System.out.print(", İlanı olusturan: " + bireyselKullanicilar.get(ilanlar.get(i).getOlusturanKullaniciId()).getIsim());
                System.out.print("     >>    Bulunduğu il: " + ilanlar.get(i).getIl()+", Oda Sayısı: "+ilanlar.get(i).getOdaSayisi()+", Fiyatı: "+ilanlar.get(i).getFiyat()+"TL");
                System.out.println("");
            }
        }

        System.out.println("");

        System.out.println("Sistemde bulunan bütün mesajların listesi:");
        for(Integer i : mesajlar.keySet()){
            System.out.print(" -> Baslik: " + mesajlar.get(i).getBaslik());
            System.out.print(", Gönderen: " + bireyselKullanicilar.get(mesajlar.get(i).getGonderenKullaniciId()).getIsim());
            System.out.print(", Alıcı: " + bireyselKullanicilar.get(mesajlar.get(i).getAliciKullaniciId()).getIsim());
            System.out.println("");
        }

        System.out.println("");

        System.out.println("ayse.sari@gmail.com mail adresine sahip kullanıcının favori ilanlarının listesi:");
        for (Integer i : bireyselKullanicilar.keySet()) {
            if(bireyselKullanicilar.get(i).getEmail()=="ayse.sari@gmail.com") {
                for(Integer j : bireyselKullanicilar.get(8).getFavoriIlanlarId() ){
                    System.out.print(" -> Başlık: " + ilanlar.get(j).getBaslik() );
                    System.out.print(", Bulunduğu il: " + ilanlar.get(j).getIl() );
                    System.out.print(", Özellileri: " + ilanlar.get(j).getOdaSayisi() );
                    System.out.print(", Fiyatı: " + ilanlar.get(j).getFiyat() );
                    System.out.print(", İlan sahibi: " + bireyselKullanicilar.get(ilanlar.get(j).getOlusturanKullaniciId()).getIsim() );
                    System.out.println("");
                }
            }
        }

    }

    private static void veritabani(){
        // sanki veritabanı varmış gibi kullanıcı, ilan ve mesajlar oluşturuluyor

        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Ahmet",  "birinciKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Sezin",   "ikinciKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Mehmet",  "ucuncuKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Aslı",  "dorduncuKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Orhun",  "besinciKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Berna",  "altinciKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Furkan", "yedinciKullanici@gmail.com" ));
        bireyselKullanicilar.put(idOlustur.IDolustur(), new BireyselIKullanici("Ayşe",          "ayse.sari@gmail.com" ));
        // kurumsal kullanıcı şimdilik sistemde yer almıyor.

        ilanlar.put(idOlustur.IDolustur(), new Ilan("Kelepir fiyatına..." , Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O1S1, new BigDecimal("2500"), 1));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Acil kiralık!!!"     , Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O1S1, new BigDecimal("2750"), 2));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Öğrenciye kiralık!!!", Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O1S1, new BigDecimal("4500"), 3));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Bekara kiralık!!!"   , Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O1S1, new BigDecimal("4000"), 4));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Kelepir fiyatına..." , Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O2S1, new BigDecimal("2250"), 5));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Bekara kiralık!!!"   , Il_ENUM.ISTANBUL, OdaSayisi_ENUM.O2S1, new BigDecimal("1500"), 6));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Öğrenciye kiralık!!!",  Il_ENUM.ANKARA, OdaSayisi_ENUM.O2S1, new BigDecimal("4250"), 1));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Bekara kiralık!!!"   ,  Il_ENUM.ANKARA, OdaSayisi_ENUM.O2S1, new BigDecimal("4750"), 2));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Kelepir fiyatına..." ,  Il_ENUM.ANKARA, OdaSayisi_ENUM.O3S1, new BigDecimal("2100"), 3));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Acil kiralık!!!"     ,  Il_ENUM.ANKARA, OdaSayisi_ENUM.O3S1, new BigDecimal("2300"), 4));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Öğrenciye kiralık!!!",  Il_ENUM.ANKARA, OdaSayisi_ENUM.O3S1, new BigDecimal("4600"), 5));
        ilanlar.put(idOlustur.IDolustur(), new Ilan("Kelepir fiyatına..." ,  Il_ENUM.ANKARA, OdaSayisi_ENUM.O3S1, new BigDecimal("4300"), 1));

        mesajlar.put(idOlustur.IDolustur(), new Mesaj(1, 2, "Acil kiralık ev Hk."));
        mesajlar.put(idOlustur.IDolustur(), new Mesaj(3, 4, "Öğrenciye kiralık ev Hk."));
        mesajlar.put(idOlustur.IDolustur(), new Mesaj(5, 6, "Bekara kiralık ev Hk."));

        // favori ilanlar ekleniyor
        bireyselKullanicilar.get(8).addFavoriIlanlarId( 9);
        bireyselKullanicilar.get(8).addFavoriIlanlarId(10);
        bireyselKullanicilar.get(8).addFavoriIlanlarId( 9);
        bireyselKullanicilar.get(8).addFavoriIlanlarId(10);
        bireyselKullanicilar.get(8).addFavoriIlanlarId(11);
    }

}