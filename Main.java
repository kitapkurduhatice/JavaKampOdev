package homeWork1;

public class Main {
	public static void main(String[] args) {
		Kurum kurum1 = new Kurum(1, "DEMD", "1234","A II.Madde", "(0352) 458 96 32","(0352) 458 96 35", "demd@demd.com", "demd.com", "1256D","3","Bakanlık");
		Kurum kurum2 = new Kurum(2, "Sanayi Dairesi", "12345","A III.Madde", "(0352) 458 66 32","(0352) 458 66 35", "sanayidairesi@edevlet.com", "sanayidairesi.com", "1256S","4","Bakanlık");
		Kurum kurum3 = new Kurum(3, "Personel Dairesi", "123456","I.Madde", "(0352) 458 97 32","(0352) 458 99 55", "personeldairesi@edevlet.com", "personeldairesi.com", "1256P","6","Bakanlık");
		Kurum kurum4 = new Kurum(4, "İlköğretim Dairesi", "1234567","III.Madde", "(0352) 458 77 12","(0352) 458 91 85", "ilkogretimdairesi@edevlet.com", "ilkogretimdairesi.com", "1256ID","9","Bakanlık");

		Personel personel1 = new Personel(1, "Hatice", "Albayrak", "11123654787", "Erol", "Fatma", "Bekar"); 
		Personel personel2 = new Personel(2, "Şule", "Ok", "22223654787", "Erol", "Fatma", "Bekar"); 
		Personel personel3 = new Personel(3, "Fuat", "Tat", "33323654787", "Tarık", "Oya", "Evli"); 
		Personel personel4 = new Personel(4, "Ufuk", "Yıldız", "44423654787", "Çağatay", "Feride", "Evli"); 

		PersonelKurum.addPersonel(personel1);
		PersonelKurum.addKurum(kurum1);
		
		PersonelKurum.addPersonelToKurum(personel1, kurum1);
		PersonelKurum.addPersonelToKurum(personel2, kurum2);
		PersonelKurum.addPersonelToKurum(personel3, kurum3);
		PersonelKurum.addPersonelToKurum(personel4, kurum4);
		
		PersonelKurum.delete(personel1, kurum1);
		
		PersonelKurum.registeredPersonelToKurum(personel2, kurum2);

	}

}
