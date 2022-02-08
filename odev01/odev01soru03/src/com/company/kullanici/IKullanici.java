package com.company.kullanici;


import java.util.HashSet;

public interface IKullanici {

    KullaniciTipi_ENUM kullaniciTipi = null; // bireysel & kurumsal
    String isim = "İsim"; //kisi veya firma ismi
    String email = "";
    String telefon = "555 111 22 33";
    String hesapFotografi = "resim.url";
    HashSet<Integer> yayinladigiIlanlarId = null ;
    HashSet<Integer> mesajKutusuId = null;

    public KullaniciTipi_ENUM getKullaniciTipi();

    // kullanıcı tipi set edilemez

    public String getIsim();

    public void setIsim(String isim);

    public String getEmail();

    public void setEmail(String email);

    public String getTelefon();

    public void setTelefon(String telefon);

    public String getHesapFotografi();

    public void setHesapFotografi(String hesapFotografi);

}
