package com.company.ortakKullanim;

public class IdOlustur {

    // Normalde zamana bağlı bir matematiksel formül ile her seferinde şifrelenmiş bir ID verilmesi düşünüldü.
    // Zamana bağlı olacağından her seferinde verilen ID benzersiz ve istelinildiğinde tarih olarak tekrar elde edilebilecekti.
    // Böylece sonID bilgisine gerek kalmayacaktı.
    // Mesaj, Kullanıcı ve Ilan IDleri aynı class kullanılarak oluşturulacaktır çünkü sıralama önemli olmadığı düşünülmüştür.

    int sonID = 0;
    public int IDolustur(){
        sonID++;
        return sonID;
    }

}
