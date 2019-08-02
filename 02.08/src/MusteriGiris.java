import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MusteriGiris extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable musteritablosu;
	DefaultTableModel model;
	MusteriIslemleri islemler = new MusteriIslemleri();
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	
	
	
	public static void main(String[] args) {
		try {
			MusteriGiris dialog = new MusteriGiris();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public void musteriGoruntule() {
		model.setRowCount(0);
		ArrayList<Musteri> musteriler = new ArrayList<Musteri>();
		
		musteriler= islemler.musterileriGetir();
		
		if (musteriler != null) {
			for(Musteri musteri : musteriler) {
				Object[] eklenecek = {musteri.getId(), musteri.getMusteriadi(), musteri.getMusterisoyadi(), musteri.getTckimlikno(), musteri.getTelefon(), musteri.getDogumtarihi(), musteri.getDogumyeri(), musteri.getBabaadi(), musteri.getEposta(), musteri.getSubekodu(), musteri.getMusterino()};
				
				model.addRow(eklenecek);
				
		}
		
		
	}
	
}
		
	
	

	

	public MusteriGiris() {
		setBounds(100, 100, 940, 733);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 854, 320);
			contentPanel.add(panel);
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(15, 373, 888, 278);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(-57, 16, 984, 277);
				panel.add(scrollPane);
				{
					musteritablosu = new JTable();
					musteritablosu.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"id", "musteriadi", "musterisoyadi", "tckimlik", "telefon", "dogumtarihi", "dogumyeri", "babaadi", "eposta", "subekodu", "musterino"
						}
					));
					scrollPane.setViewportView(musteritablosu);
				}
			}
		}
		
		JButton listele = new JButton("Listele");
		listele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				musteriGoruntule();
			}
		});
		listele.setBounds(776, 339, 115, 29);
		contentPanel.add(listele);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		
		model = (DefaultTableModel) musteritablosu.getModel();
		
		
		
		
		
		
		
	}
}
