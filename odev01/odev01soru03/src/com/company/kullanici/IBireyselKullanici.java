package com.company.kullanici;

import java.util.HashSet;

public interface IBireyselKullanici extends IKullanici{

    String tcKimlikNo = "bos";
    HashSet<Integer> favoriIlanlarId = null;


    public String getTcKimlikNo();

    public void setTcKimlikNo(String tcKimlikNo);

    public HashSet<Integer> getFavoriIlanlarId() ;

    public void setFavoriIlanlarId(HashSet<Integer> favoriIlanlar);


    public boolean kimlikBilgileriSorgula(BireyselIKullanici kullanici); // isim ve TC kimlik no bilgilerinin eşleştiğini kontrol ediyor
}
