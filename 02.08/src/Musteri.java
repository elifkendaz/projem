
public class Musteri {

		private int id;
		private String musteriadi;
		private String musterisoyadi;
		private String tckimlikno;
		private String telefon;
		private String dogumtarihi;
		private String dogumyeri;
		private String babaadi;
		private String eposta;
		private String subekodu;
		private String musterino;
		
		
		public Musteri(int id, String musteriadi, String musterisoyadi, String tckimlikno, String telefon, String dogumtarihi,
				String dogumyeri, String babaadi, String eposta, String subekodu, String musterino) {
			super();
			this.id = id;
			this.musteriadi = musteriadi;
			this.musterisoyadi = musterisoyadi;
			this.tckimlikno = tckimlikno;
			this.telefon = telefon;
			this.dogumtarihi = dogumtarihi;
			this.dogumyeri = dogumyeri;
			this.babaadi = babaadi;
			this.eposta = eposta;
			this.subekodu = subekodu;
			this.musterino = musterino;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMusteriadi() {
			return musteriadi;
		}
		public void setMusteriadi(String musteriadi) {
			this.musteriadi = musteriadi;
		}
		public String getTckimlikno() {
			return tckimlikno;
		}
		public void setTckimlikno(String tckimlikno) {
			this.tckimlikno = tckimlikno;
		}
		public String getMusterisoyadi() {
			return musterisoyadi;
		}
		public void setMusterisoyadi(String musterisoyadi) {
			this.musterisoyadi = musterisoyadi;
		}
		public String getTelefon() {
			return telefon;
		}
		public void setTelefon(String telefon) {
			this.telefon = telefon;
		}
		public String getDogumyeri() {
			return dogumyeri;
		}
		public void setDogumyeri(String dogumyeri) {
			this.dogumyeri = dogumyeri;
		}
		public String getDogumtarihi() {
			return dogumtarihi;
		}
		public void setDogumtarihi(String dogumtarihi) {
			this.dogumtarihi = dogumtarihi;
		}
		public String getEposta() {
			return eposta;
		}
		public void setEposta(String eposta) {
			this.eposta = eposta;
		}
		public String getBabaadi() {
			return babaadi;
		}
		public void setBabaadi(String babaadi) {
			this.babaadi = babaadi;
		}
		public String getSubekodu() {
			return subekodu;
		}
		public void setSubekodu(String subekodu) {
			this.subekodu = subekodu;
		}
		public String getMusterino() {
			return musterino;
		}
		public void setMusterino(String musterino) {
			this.musterino = musterino;
		}
		
	
		
}
