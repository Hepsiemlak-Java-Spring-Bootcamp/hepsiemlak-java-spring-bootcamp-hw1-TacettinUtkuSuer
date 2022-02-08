## Ödev 1 - Soru 3

- İlanlar, mesajlar, kurumsal ve bireysel hesaplar olmak üzere 4 nesne kullanılmıştır.
- Bütün nesneler için ID numarası kullanılmıştır ve ID numaraları kullanılarak nesneler arası ilişkiler kurulmuştur. 
  - Kullanıcı -> kullanıcı ID
  - İlan -> ilan ID, ilanı oluşturan kullanıcı ID
  - Mesaj -> mesaj ID, gönderen kullanıcı ID, alıcı kullanıcı ID
- Bireysel ve kurumsal kullanıcı sınıfları, bireysel ve kurumsal kullanıcı interface'lerinden implement edilmiştir. Bireysel ve kurumsal kullanıcı interface'leri ise kullanıcı interface'inden extend edilmiştir. İlan sınıfı ise gayrimenkul sınıfından extend edilmiştir. Bu yapılar ve diğer sınıfların UML diagramı Şekil 1'de gösterilmektedir. Is-a ve has-a durumları incelendiğinde, "BireyselKullanici is a IBireyselKullanici" ve "IBireyselKullanici is a IKullanici". Benzer şekilde, "KurumsalKullanici is a IKurumsalKullanici" ve "IKurumsalKullanici is a IKullanici".  Farklı olarak, "Ilan has a Gayrimenkul".



<center><b>Şekil 1. UML diagramı</b></center>

![odev1soru3uml](https://github.com/Hepsiemlak-Java-Spring-Bootcamp/hepsiemlak-java-spring-bootcamp-hw1-TacettinUtkuSuer/blob/main/odev01/odev01soru03/sekiller/odev1soru3uml.png)

- Sınıflar içerisinde il, ilan tipi gibi değişkenler de hata yapmamak adına enum sınıfları oluşturulmuştur. enum değişkenleri ekrana yazdırmak için Türkçe karakterleri de kullanabilmek adına String değerleri de atandı.
- Her seferinde farklı bir ID atanabilmesi adına sıradan yeni ID atamaya yarayan bir metot kullanılmıştır. Normalde bu ID oluşturma metodunun tarih ve zamanın bir fonksiyonu olarak benzersiz yaratılması düşünülmüştür, kolay olması adına şimdilik sadece sırayla ID vermektedir.
- Her sınıftaki değişkenler private olarak tanımlanmış ve getter metotları oluşturulmuştur, gerekli görülen değişkenler için ise setter oluşturulmuştur (ID, oluşturma tarihi gibi değerlerin sonradan değiştirilmemesi gerektiğinden setter metodu oluşturulmamıştır.). Sınıflar içerisinde ki HashSet'e ekleme yapılabilmek adına bu tür değişkenlere adder metodu da eklenmiştir.
- Programın çalıştırılıp denenebilmesi adına rastgele değerlerden veriler oluşturulmuştur. Normalde veritabanından çekilmesi gerektiğinden adı veritabanı olarak oluşturulmuştur. HashMap kullanılarak ilgili sınıfın ID si ve o nesnenin özellikleri şeklinde ikili veri tutulmuştur. Program içerisinde nesne oluşturulurken kullanılan contructor'da sadece gerekli olan değerler ile yazılmıştır, diğerlerine şimdilik default değerler atanmıştır.
- Kodun çalıştırıldıktan sonra terminalde ki kod çıktısının görseli Şekil 2'de yer almaktadır.



<center><b>Şekil 2. Kod çıktısı</b></center>

![odev1soru3kodCiktisi](https://github.com/Hepsiemlak-Java-Spring-Bootcamp/hepsiemlak-java-spring-bootcamp-hw1-TacettinUtkuSuer/blob/main/odev01/odev01soru03/sekiller/odev1soru3kodCiktisi.PNG)

