package com.company.mesaj;


import java.time.LocalDateTime;

public class Mesaj {

    int gonderenKullaniciId;
    int aliciKullaniciId;
    String baslik;
    String icerigi = "Evi ne zaman görebiliriz acaba?";
    LocalDateTime gonderilenTarih = LocalDateTime.now();
    boolean gorulduMu = true;

    public Mesaj(int gonderenKullaniciId, int aliciKullaniciId, String baslik) {
        this.gonderenKullaniciId = gonderenKullaniciId;
        this.aliciKullaniciId = aliciKullaniciId;
        this.baslik = baslik;
    }

    public int getGonderenKullaniciId() {
        return gonderenKullaniciId;
    }

    // gonderenKullaniciId için setter yok

    public int getAliciKullaniciId() {
        return aliciKullaniciId;
    }

    // aliciKullaniciId için setter yok


    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerigi() {
        return icerigi;
    }

    public void setIcerigi(String icerigi) {
        this.icerigi = icerigi;
    }

    public LocalDateTime getGonderilenTarih() {
        return gonderilenTarih;
    }

    // gonderilenTarih için setter yok

    public boolean isGorulduMu() {
        return gorulduMu;
    }

    // gorulduMu için setter yok

}
