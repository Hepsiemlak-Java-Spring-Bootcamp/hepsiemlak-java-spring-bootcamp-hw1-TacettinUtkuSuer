package com.company.kullanici;

import com.company.ortakKullanim.Il_ENUM;


import java.util.HashSet;

public class KurumsalIKullanici implements IKurumsalKullanici{

    private KullaniciTipi_ENUM kullaniciTipi = KullaniciTipi_ENUM.KURUMSAL;
    private String isim = "İsim"; //kisi veya firma ismi
    private String email;
    private String telefon = "555 111 22 33";
    private String hesapFotografi = "resim.url";
    private HashSet<Integer> yayinladigiIlanlarId;
    private HashSet<Integer> mesajKutusuId;

    private String firmaAdresi= "Kadıköy ...";
    private Il_ENUM firmaIli = Il_ENUM.ISTANBUL;
    private VergiDaireleri_ENUM vergiDairesi = VergiDaireleri_ENUM.MALTEPE;
    private String faksNumarasi = "212 123 45 67";
    private String vergiNumarasi = "123 456 7890";

    public KurumsalIKullanici(String email) {
        this.email = email;
    }

    // interface IKullanıcı

    public KullaniciTipi_ENUM getKullaniciTipi() {
        return kullaniciTipi;
    }

    // kullanıcı tipi set edilemez

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getHesapFotografi() {
        return hesapFotografi;
    }

    public void setHesapFotografi(String hesapFotografi) {
        this.hesapFotografi = hesapFotografi;
    }

    // interface IKurumsalKullanıcı


    public String getFirmaAdresi() {
        return firmaAdresi;
    }

    public void setFirmaAdresi(String firmaAdresi) {
        this.firmaAdresi = firmaAdresi;
    }

    public Il_ENUM getFirmaIli() {
        return firmaIli;
    }

    public void setFirmaIli(Il_ENUM firmaIli) {
        this.firmaIli = firmaIli;
    }

    public VergiDaireleri_ENUM getVergiDairesi() {
        return vergiDairesi;
    }

    public void setVergiDairesi(VergiDaireleri_ENUM vergiDairesi) {
        this.vergiDairesi = vergiDairesi;
    }

    public String getFaksNumarasi() {
        return faksNumarasi;
    }

    public void setFaksNumarasi(String faksNumarasi) {
        this.faksNumarasi = faksNumarasi;
    }

    public String getVergiNumarasi() {
        return vergiNumarasi;
    }

    public void setVergiNumarasi(String vergiNumarasi) {
        this.vergiNumarasi = vergiNumarasi;
    }

    public void addYayinladigiIlanlarId(int yayinladigiIlanId) {
        this.yayinladigiIlanlarId.add(yayinladigiIlanId);
    }

    public void addMesajKutusuId(int mesajId) {
        this.mesajKutusuId.add(mesajId);
    }

    @Override
    public boolean firmaSorgula(){
        // vergi numarasi ve isim üzerinden kontrol için
        return true;
    }


}
