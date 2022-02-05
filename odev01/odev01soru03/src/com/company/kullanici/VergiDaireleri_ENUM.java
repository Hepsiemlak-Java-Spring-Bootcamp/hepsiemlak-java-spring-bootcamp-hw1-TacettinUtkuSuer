package com.company.kullanici;

public enum VergiDaireleri_ENUM {
    ANADOLU_IHTISAS("Anadolu İhtisas Vergi Dairesi Müdürlüğü"),
    ANKARA_IHTISAS("Ankara İhtisas Vergi Dairesi Müdürlüğü"),
    ANKARA_KURUMLAR("Ankara Kurumlar Vergi Dairesi Müdürlüğü"),
    VERASET_VE_HARCLAR("Veraset ve Harçlar Vergi Dairesi Müdürlüğü"),
    KAVAKLIDERE("Kavaklıdere Vergi Dairesi Müdürlüğü"),
    MALTEPE("Maltepe Vergi Dairesi Müdürlüğü"),
    YENIMAHALLE("Yenimahalle Vergi Dairesi Müdürlüğü"),
    CANKAYA("Çankaya Vergi Dairesi Müdürlüğü"),
    KIZILBEY("Kızılbey Vergi Dairesi Müdürlüğü"),
    MITHATPASA("Mithatpaşa Vergi Dairesi Müdürlüğü"),
    ULUS("Ulus Vergi Dairesi Müdürlüğü"),
    YILDIRIM_BEYAZIT("Yıldırım Beyazıt Vergi Dairesi Müdürlüğü"),
    SEGMENLER("Seğmenler Vergi Dairesi Müdürlüğü"),
    DIKIMEVI("Dikimevi Vergi Dairesi Müdürlüğü"),
    DOGANBEY("Doğanbey Vergi Dairesi Müdürlüğü"),
    YEGENBEY("Yeğenbey Vergi Dairesi Müdürlüğü"),
    HITIT("Hitit Vergi Dairesi Müdürlüğü"),
    YAHYA_GALIP("Yahya Galip Vergi Dairesi Müdürlüğü"),
    MUHAMMET_KARAGUZEL("Muhammet Karagüzel Vergi Dairesi Müdürlüğü"),
    OSTIM("Ostim Vergi Dairesi Müdürlüğü"),
    GOLBASI("Gölbaşı Vergi Dairesi Müdürlüğü"),
    SINCAN("Sincan Vergi Dairesi Müdürlüğü"),
    DISKAPI("Dışkapı Vergi Dairesi Müdürlüğü"),
    ETIMESGUT("Etimesgut Vergi Dairesi Müdürlüğü"),
    BASKENT("Başkent Vergi Dairesi Müdürlüğü"),
    CUMHURIYET("Cumhuriyet Vergi Dairesi Müdürlüğü");

    private String displayName;

    VergiDaireleri_ENUM(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
