# Java-RMI-ile-Dagitik-Uygulama-Ornegi
Durum arabalarının yönetimine izin veren bir istemci-sunucu uygulamasını oluşturmak. Satıcı müşteri uygulaması, yeni bir arabanın kaydına ve satış fişine izin vermeli ve bilgiler, Car ve Receipt nesneleri kullanılarak sunucuya iletilmelidir . Sunucu her yeni veriyi bir metin dosyasına (cars.dat, makbuzlar.dat) veya veritabanına kaydetmeli. Bu dosya veya veritabanı sistemi başlattığımızda ve bu dosyaları/bilgileri okuduğumuzda indirebilmeli. Müşteri seri numarasına veya işaretine göre araçların bilgilerini gösterme talebi yapabilmeli. Kimlik veya satıcı adı kullanarak makbuzu gösterebilmeli. İstek, gerekli bilgileri gönderen sunucuya iletildildikten sonra bilgi müşteriye geri dönmeli.

Projemizi çalıştırmak için öncelikle server hazır hale getirilmeli:

Run.class çalıştırılır.

Starara.class çalıştırlır.Kullanıcıya aşağıdaki seçimler sunulur:
	dosya1 silinip yeniden olusturuldu.
	dosya2 silinip yeniden olusturuldu.
	araba kayıt için 1 
	fatura kayıt için 2 
	sorgulama için 3
	çıkış için 0 girin

Seçime göre araba kaydı veya fatura kaydı txtye yapılır.

örnek kayıt:
	Eklemek istediğiniz aracın id'sini girin:  
	11
	Eklemek istediğiniz aracın markasını girin:  
	ss

Daha sonra kullanıcıya sunulan secenek şöyledir:
	serino ile araba arama için 4 
	marka ile araba arama için 5
	faturaid ile arama için 6 
	alıcıadı ile arama için 7
	çıkış için 0 girin
	Id girin:
	11
	Araç ID: 11 Araç Marka: ss
	4
