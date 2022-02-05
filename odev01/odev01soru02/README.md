### Ödev 1 - Soru 2

- Çoklu kalıtım pratiklik açısından avantajları olmasına rağmen beraberinde getirdiği karmaşıklıktan dolayı C++, phython gibi dillerde kullanılmasına rağmen Java ve C#'da izin verilmemektedir.
- Çoklu kalıtım kullanımı sırasında doğan karmaşıklık iyi yönetilemediği zaman Diamond Problem'ine neden olmaktadır. Diamond Problem'e bir örnek vermek gerekirse, farklı gövdelere sahip aynı isimli metotlara sahip iki sınıftan kalıtım alan yeni sınıfta hangi metodun kullanılacağı gibi bir sorun çıkmaktadır. 
- Daha iyi açıklamak adına aşağıdaki kodları incelenebilir.



```java
public class insan{
	public gozRengi;
}

public class anne extends insan{
	gozRengi = "mavi";
}

public class baba extends insan{
	gozRengi = "kahverengi";
}

public class cocuk extends anne, baba{
	gozRengi = ???
}
```



- İnsan sınıfı altında örnek olması adına gozRengi değişkeni yer almaktadır. anne ve baba sınıfları insan sınıfından kalıtım ile oluşturulmuştur. Sonrasında çoklu kalıtım ile cocuk sınıfı oluşturulmaktadır. Tam bu noktada cocuk sınıfı altında yer alan gozRengi değişkeni anne mi yoksa baba sınıfından mı renk değerini alacağı sorunsalı çıkmaktadır. Şekil 1'de ki blok diagramında da görülebildiği gibi yapı elmasa benzediği için Diamond Problem ismini almıştır.



<center><b>Şekil 1. Diamond Problem</b></center>

![elmasProblemi](\sekiller\elmasProblemi.PNG)



- Çoklu kalıtımın sağladığı fayda, Java'da interface'ler ile sağlanabilmektedir. Bir sınıf birden fazla interface'den implements edilebilmektedir. Interface'ler gövde alamadıklarından dolayı ortaya karmaşık problemler çıkmamaktadır.

