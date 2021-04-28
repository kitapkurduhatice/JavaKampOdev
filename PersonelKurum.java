package homeWork1;


public class PersonelKurum {
	public static void addPersonel(Personel personel) {
		System.out.println("Personel Ad Soyad: " + personel.ad + " " + personel.soyad);
		System.out.println();
	}
	
	public static void addKurum(Kurum kurum) {
		System.out.println("Kurum : " + kurum.kurumAd);
		System.out.println();
	}
	
	public static void addPersonelToKurum(Personel personel, Kurum kurum) {
		personel.getKurum().add(kurum);
		System.out.println("Personel " + kurum.getKurumAd() + " kurumuna atanmıştır.");
		System.out.println();
	}

	public static void delete(Personel personel, Kurum kurum) {
		personel.getKurum().remove(kurum);
		System.out.println("Personel " + kurum.getKurumAd() + " bağlı değildir.");
		System.out.println();
	}
	
	

	public static void registeredPersonelToKurum(Personel personel, Kurum kurum) {
		System.out.println(personel.getAd() + " " + personel.getSoyad() + " personelin üzerindeki kurum: ");
		System.out.println("Kurum Adı : " + kurum.getKurumAd()); 
		System.out.println("Kurum Kodu: " + kurum.getKurumKod());
		for(Kurum kurum1 : personel.getKurum()) {
			System.out.println(kurum1.getKurumAd());
		}
		System.out.println();
	}
}
