package homeWork1;

import java.util.ArrayList;

public class Personel {
	
	int id;
	String ad;
	String soyad;
	String kimlikNo;
	String babaAdi;
	String anneAdi;
	String medeniDurum;
	ArrayList<Kurum> kurum;
	
	// constructor
	public Personel(int id, String ad, String soyad, String kimlikNo, String babaAdi, String anneAdi, String medeniDurum) {
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.kimlikNo = kimlikNo;
		this.babaAdi = babaAdi;
		this.anneAdi = anneAdi;
		this.medeniDurum = medeniDurum;
		kurum = new ArrayList<Kurum>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getBabaAdi() {
		return babaAdi;
	}

	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}

	public String getAnneAdi() {
		return anneAdi;
	}

	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}

	public String getMedeniDurum() {
		return medeniDurum;
	}

	public void setMedeniDurum(String medeniDurum) {
		this.medeniDurum = medeniDurum;
	}

	public ArrayList<Kurum> getKurum() {
		return kurum;
	}

	public void setKurum(ArrayList<Kurum> kurum) {
		this.kurum = kurum;
	}
	
	

}
