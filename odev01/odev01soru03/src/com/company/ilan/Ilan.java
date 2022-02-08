package com.company.ilan;

import com.company.ortakKullanim.Il_ENUM;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Ilan extends Gayrimenkul{

    private String baslik; // şimdilik gerek olmadığından initial bir değer atandı.
    private BigDecimal fiyat;
    private int suresi = 30; // Gun cinsinden
    private boolean incelendiMi = true; // incelendiği için yayınlanabilir
    private LocalDate olusturulmaTarihi = LocalDate.now() ; // programın çalışıtırıldığı günün kısa tarihini veriyor
    private boolean aktifMi = true;
    private int olusturanKullaniciId;
    private IlanTipi_ENUM ilanTipi = IlanTipi_ENUM.KIRALIK; // Bütün evler şimdilik kiralık olsun

    public Ilan(String baslik, Il_ENUM il, OdaSayisi_ENUM odaSayisi, BigDecimal fiyat, int olusturanKullaniciId) {
        super(il, odaSayisi);
        this.baslik = baslik;
        this.fiyat = fiyat;
        this.olusturanKullaniciId = olusturanKullaniciId;
    }

    public int getOlusturanKullaniciId() {
        return olusturanKullaniciId;
    }

    // ID'lerin değiştirilememesi adına setter kullanılmadı.

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public int getSuresi() {
        return suresi;
    }

    public void setSuresi(int suresi) {
        this.suresi = suresi;
    }

    public boolean isIncelendiMi() {
        return incelendiMi;
    }

    public void setIncelendiMi(boolean incelendiMi) {
        this.incelendiMi = incelendiMi;
    }

    public LocalDate getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    public void setOlusturulmaTarihi(LocalDate olusturulmaTarihi) {
        this.olusturulmaTarihi = olusturulmaTarihi;
    }

    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }

    public IlanTipi_ENUM getIlanTipi() {
        return ilanTipi;
    }

    public void setIlanTipi(IlanTipi_ENUM ilanTipi) {
        this.ilanTipi = ilanTipi;
    }
}
