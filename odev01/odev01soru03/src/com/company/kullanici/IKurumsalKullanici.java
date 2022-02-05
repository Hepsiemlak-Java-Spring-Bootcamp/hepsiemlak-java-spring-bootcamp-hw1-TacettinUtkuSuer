package com.company.kullanici;

import com.company.ortakKullanim.Il_ENUM;

public interface IKurumsalKullanici extends IKullanici{
    String firmaAdresi= "bos";
    Il_ENUM firmaIli = null;
    VergiDaireleri_ENUM vergiDairesi = null;
    String faksNumarasi = "bos";
    String vergiNumarasi = "bos";


    public String getFirmaAdresi();

    public void setFirmaAdresi(String firmaAdresi);

    public Il_ENUM getFirmaIli();

    public void setFirmaIli(Il_ENUM firmaIli);

    public VergiDaireleri_ENUM getVergiDairesi();

    public void setVergiDairesi(VergiDaireleri_ENUM vergiDairesi);

    public String getFaksNumarasi();

    public void setFaksNumarasi(String faksNumarasi);

    public String getVergiNumarasi();

    public void setVergiNumarasi(String vergiNumarasi);


    public boolean firmaSorgula(); // firma ve bilgilerinin doğru olduğunu sorgulamak için
}
