package homeWork1;

public class Kurum {
	
	int id;
	String kurumAd;
	String kurumKod;
	String kurulusYasasi;
	String telefon;
	String faks;
	String eposta;
	String webAdres;
	String haberlesmeKod;
	String binaNo;
	String aciklama;
	
	// constructor
	public Kurum(int id, String kurumAd, String kurumKod, String kurulusYasasi, String telefon, String faks, String eposta, String webAdres, String haberlesmeKod, String binaNo, String aciklama) {
		this.id= id;
		this.kurumAd = kurumAd;
		this.kurumKod = kurumKod;
		this.kurulusYasasi = kurulusYasasi;
		this.telefon = telefon;
		this.faks = faks;
		this.eposta = eposta;
		this.webAdres = webAdres;
		this.haberlesmeKod = haberlesmeKod;
		this.binaNo = binaNo;
		this.aciklama = aciklama;
	}

	//lombok kütüphanesini eklediğimde @Getter ve @Setter anatasyonlarını kullanabilirim.
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKurumAd() {
		return kurumAd;
	}

	public void setKurumAd(String kurumAd) {
		this.kurumAd = kurumAd;
	}

	public String getKurumKod() {
		return kurumKod;
	}

	public void setKurumKod(String kurumKod) {
		this.kurumKod = kurumKod;
	}

	public String getKurulusYasasi() {
		return kurulusYasasi;
	}

	public void setKurulusYasasi(String kurulusYasasi) {
		this.kurulusYasasi = kurulusYasasi;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getFaks() {
		return faks;
	}

	public void setFaks(String faks) {
		this.faks = faks;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public String getWebAdres() {
		return webAdres;
	}

	public void setWebAdres(String webAdres) {
		this.webAdres = webAdres;
	}

	public String getHaberlesmeKod() {
		return haberlesmeKod;
	}

	public void setHaberlesmeKod(String haberlesmeKod) {
		this.haberlesmeKod = haberlesmeKod;
	}

	public String getBinaNo() {
		return binaNo;
	}

	public void setBinaNo(String binaNo) {
		this.binaNo = binaNo;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	

}
