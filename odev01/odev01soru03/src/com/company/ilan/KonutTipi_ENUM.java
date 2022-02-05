package com.company.ilan;

public enum KonutTipi_ENUM {
    DAIRE("Daire"),
    VILLA("Villa"),
    MUSTAKIL("Müstakil"),
    PREFABRIK("Prefabrik"),
    BINA("Bina"),
    RESIDENCE("Residence"),
    YAZLIK("Yazlık"),
    KOYEVI("Köy Evi");

    private String displayName;

    KonutTipi_ENUM(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
