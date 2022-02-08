package com.company.ilan;

public enum OdaSayisi_ENUM {
    STUDYO("Stüdyo Daire"),
    O1S1("1+1"),
    O2S1("2+1"),
    O3S1("3+1"),
    O4S1("4+1"),
    O5S1("5+1");

    private String displayName;

    OdaSayisi_ENUM(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

}
