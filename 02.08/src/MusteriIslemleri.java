import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class MusteriIslemleri {
	
	private Connection con = null;
	private java.sql.Statement statement =null;
	private java.sql.PreparedStatement preparedstatement = null;
	
	
	
	public ArrayList<Musteri> musterileriGetir(){
		ArrayList<Musteri> cikti = new ArrayList<Musteri>();
		
		try {
			statement = con.createStatement();
			String sorgu = "Select * From musteriler";
			
			ResultSet rs = statement.executeQuery(sorgu);
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String musteriadi = rs.getString("musteriadi");
				String musterisoyadi = rs.getString("musterisoyadi");
				String tckimlikno = rs.getString("tckimlikno");
				String telefon = rs.getString("telefon");
				String dogumtarihi = rs.getString("dogumtarihi");
				String dogumyeri = rs.getString("dogumyeri");
				String babaadi = rs.getString("babaadi");
				String eposta = rs.getString("eposta");
				String subekodu = rs.getString("subekodu");
				String musterino = rs.getString("musterino");
				
				cikti.add(new Musteri(id, musteriadi, musterisoyadi, tckimlikno, telefon, dogumtarihi, dogumyeri, babaadi, eposta, subekodu, musterino));
				

			}
			
			
			return cikti;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	public MusteriIslemleri() {
		
		
		String url = "jdbc:mysql://" + database.host +":" + database.port +"/" + database.db_ismi;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException ex) {
			
			System.out.println("driver yok");
		}
		
		
		
		try {
			con = (Connection) DriverManager.getConnection(url, database.kullanici_adi, database.parola);
			System.out.println("baglanti basarili");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("baglanti basarisiz");
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		MusteriIslemleri islemler = new MusteriIslemleri();
		
	}

}
