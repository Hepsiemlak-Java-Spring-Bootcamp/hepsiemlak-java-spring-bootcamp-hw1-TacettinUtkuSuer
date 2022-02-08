package com.company.kullanici;


import java.util.HashSet;
import java.util.Set;

public class BireyselIKullanici implements IBireyselKullanici{

    private KullaniciTipi_ENUM kullaniciTipi = KullaniciTipi_ENUM.BIREYSEL;
    private String isim = "İsim"; //kisi veya firma ismi
    private String email = "";
    private String telefon = "555 111 22 33";
    private String hesapFotografi = "resim.url";
    private HashSet<Integer> yayinladigiIlanlarId = null ;
    private HashSet<Integer> mesajKutusuId = null;

    private String tcKimlikNo = "11111111111";
    private HashSet<Integer> favoriIlanlarId =  new HashSet<Integer>();

    public BireyselIKullanici(String isim, String email) {
        this.isim = isim;
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

    // interface IBireyselKullanici

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public HashSet<Integer> getFavoriIlanlarId() {
        return favoriIlanlarId;
    }


    public void setFavoriIlanlarId(HashSet<Integer> favoriIlanlarId) {
        this.favoriIlanlarId = favoriIlanlarId;
    }

    public void addFavoriIlanlarId(int favoriIlanId) {
        this.favoriIlanlarId.add(favoriIlanId);
    }

    public void addYayinladigiIlanlarId(int yayinladigiIlanId) {
        this.yayinladigiIlanlarId.add(yayinladigiIlanId);
    }

    public void addMesajKutusuId(int mesajId) {
        this.mesajKutusuId.add(mesajId);
    }

    @Override
    public boolean kimlikBilgileriSorgula(BireyselIKullanici kullanici) {
        // nvi üzerinden kimlik kontrolü
        return true;
    }
}
