package com.company.kullanici;

public enum KullaniciTipi_ENUM
{   BIREYSEL("Bireysel Kullanıcı Hesabı"),
    KURUMSAL("Kurumsal Kullanıcı Hesabı");

    private String displayName;

    KullaniciTipi_ENUM(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
