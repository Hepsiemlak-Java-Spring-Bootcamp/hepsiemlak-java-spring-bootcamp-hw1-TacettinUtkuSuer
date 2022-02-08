package com.company.ilan;

public enum IlanTipi_ENUM {
    KIRALIK("Kiralık"),
    SATILIK("Satılık"),
    GUNLUKKIRALIK("Günlük Kiralık");

    private String displayName;

    IlanTipi_ENUM(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
