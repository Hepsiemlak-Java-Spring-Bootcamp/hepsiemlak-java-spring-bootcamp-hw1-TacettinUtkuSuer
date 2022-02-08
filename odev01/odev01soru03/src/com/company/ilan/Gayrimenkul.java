package com.company.ilan;

import com.company.ortakKullanim.Il_ENUM;

public class Gayrimenkul {

    // şu anlık kullanılması gerekmeyen değişkenlere initial değer atanarak constructorda yer almadı.
    private Il_ENUM il;
    private String adres = "Kağıthane ...";
    private KonutTipi_ENUM konutTipi = KonutTipi_ENUM.DAIRE;
    private OdaSayisi_ENUM odaSayisi;
    private int alan = 145; //m2 alan
    private int bulunduguKat = 3;
    private String[] resimList = {"resim1.url","resim2.url","resim3.url","resim4.url","resim5.url"};

    public Gayrimenkul(Il_ENUM il, OdaSayisi_ENUM odaSayisi) {
        this.il = il;
        this.odaSayisi = odaSayisi;
    }

    public Il_ENUM getIl() {
        return il;
    }

    public void setIl(Il_ENUM il) {
        this.il = il;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public KonutTipi_ENUM getKonutTipi() {
        return konutTipi;
    }

    public void setKonutTipi(KonutTipi_ENUM konutTipi) {
        this.konutTipi = konutTipi;
    }

    public OdaSayisi_ENUM getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(OdaSayisi_ENUM odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getAlan() {
        return alan;
    }

    public void setAlan(int alan) {
        this.alan = alan;
    }

    public int getBulunduguKat() {
        return bulunduguKat;
    }

    public void setBulunduguKat(int bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }

    public String[] getResimList() {
        return resimList;
    }

    public void setResimList(String[] resimList) {
        this.resimList = resimList;
    }
}
