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
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MusteriGiris extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable musteritablosu;
	DefaultTableModel model;
	MusteriIslemleri islemler = new MusteriIslemleri();
	private JTextField aramacubugu;
	private JTextField adi;
	private JTextField tel;
	private JTextField babaname;
	private JTextField mno;
	private JTextField soyadi;
	private JTextField dtarihi;
	private JTextField email;
	private JTextField kimlikno;
	private JTextField dyeri;
	private JTextField skodu;
	

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
		setBounds(100, 100, 1250, 733);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1198, 320);
			contentPanel.add(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 126, 198, 0, 130, 206, 0, 128, 212, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblNewLabel_1 = new JLabel("Musteri Adi");
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 1;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
			{
				adi = new JTextField();
				GridBagConstraints gbc_adi = new GridBagConstraints();
				gbc_adi.insets = new Insets(0, 0, 5, 5);
				gbc_adi.fill = GridBagConstraints.HORIZONTAL;
				gbc_adi.gridx = 2;
				gbc_adi.gridy = 1;
				panel.add(adi, gbc_adi);
				adi.setColumns(10);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Musteri Soyadi");
				GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
				gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_5.gridx = 4;
				gbc_lblNewLabel_5.gridy = 1;
				panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
			}
			{
				soyadi = new JTextField();
				GridBagConstraints gbc_soyadi = new GridBagConstraints();
				gbc_soyadi.insets = new Insets(0, 0, 5, 5);
				gbc_soyadi.fill = GridBagConstraints.HORIZONTAL;
				gbc_soyadi.gridx = 5;
				gbc_soyadi.gridy = 1;
				panel.add(soyadi, gbc_soyadi);
				soyadi.setColumns(10);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("Tc Kimlik No");
				GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
				gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_8.gridx = 7;
				gbc_lblNewLabel_8.gridy = 1;
				panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
			}
			{
				kimlikno = new JTextField();
				GridBagConstraints gbc_kimlikno = new GridBagConstraints();
				gbc_kimlikno.insets = new Insets(0, 0, 5, 0);
				gbc_kimlikno.fill = GridBagConstraints.HORIZONTAL;
				gbc_kimlikno.gridx = 8;
				gbc_kimlikno.gridy = 1;
				panel.add(kimlikno, gbc_kimlikno);
				kimlikno.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Telefon");
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_2.gridx = 1;
				gbc_lblNewLabel_2.gridy = 3;
				panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
			}
			{
				tel = new JTextField();
				GridBagConstraints gbc_tel = new GridBagConstraints();
				gbc_tel.insets = new Insets(0, 0, 5, 5);
				gbc_tel.fill = GridBagConstraints.HORIZONTAL;
				gbc_tel.gridx = 2;
				gbc_tel.gridy = 3;
				panel.add(tel, gbc_tel);
				tel.setColumns(10);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Dogum Tarihi");
				GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
				gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_6.gridx = 4;
				gbc_lblNewLabel_6.gridy = 3;
				panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
			}
			{
				dtarihi = new JTextField();
				GridBagConstraints gbc_dtarihi = new GridBagConstraints();
				gbc_dtarihi.insets = new Insets(0, 0, 5, 5);
				gbc_dtarihi.fill = GridBagConstraints.HORIZONTAL;
				gbc_dtarihi.gridx = 5;
				gbc_dtarihi.gridy = 3;
				panel.add(dtarihi, gbc_dtarihi);
				dtarihi.setColumns(10);
			}
			{
				JLabel lblNewLabel_9 = new JLabel("Dogum Yeri");
				GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
				gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_9.gridx = 7;
				gbc_lblNewLabel_9.gridy = 3;
				panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
			}
			{
				dyeri = new JTextField();
				GridBagConstraints gbc_dyeri = new GridBagConstraints();
				gbc_dyeri.insets = new Insets(0, 0, 5, 0);
				gbc_dyeri.fill = GridBagConstraints.HORIZONTAL;
				gbc_dyeri.gridx = 8;
				gbc_dyeri.gridy = 3;
				panel.add(dyeri, gbc_dyeri);
				dyeri.setColumns(10);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Baba Adi");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 1;
				gbc_lblNewLabel_3.gridy = 5;
				panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
			}
			{
				babaname = new JTextField();
				GridBagConstraints gbc_babaname = new GridBagConstraints();
				gbc_babaname.insets = new Insets(0, 0, 5, 5);
				gbc_babaname.fill = GridBagConstraints.HORIZONTAL;
				gbc_babaname.gridx = 2;
				gbc_babaname.gridy = 5;
				panel.add(babaname, gbc_babaname);
				babaname.setColumns(10);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Eposta");
				GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
				gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_7.gridx = 4;
				gbc_lblNewLabel_7.gridy = 5;
				panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
			}
			{
				email = new JTextField();
				GridBagConstraints gbc_email = new GridBagConstraints();
				gbc_email.insets = new Insets(0, 0, 5, 5);
				gbc_email.fill = GridBagConstraints.HORIZONTAL;
				gbc_email.gridx = 5;
				gbc_email.gridy = 5;
				panel.add(email, gbc_email);
				email.setColumns(10);
			}
			{
				JLabel lblNewLabel_10 = new JLabel("Sube Kodu");
				GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
				gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_10.gridx = 7;
				gbc_lblNewLabel_10.gridy = 5;
				panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
			}
			{
				skodu = new JTextField();
				GridBagConstraints gbc_skodu = new GridBagConstraints();
				gbc_skodu.insets = new Insets(0, 0, 5, 0);
				gbc_skodu.fill = GridBagConstraints.HORIZONTAL;
				gbc_skodu.gridx = 8;
				gbc_skodu.gridy = 5;
				panel.add(skodu, gbc_skodu);
				skodu.setColumns(10);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Musteri No");
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_4.gridx = 1;
				gbc_lblNewLabel_4.gridy = 7;
				panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
			}
			{
				mno = new JTextField();
				GridBagConstraints gbc_mno = new GridBagConstraints();
				gbc_mno.insets = new Insets(0, 0, 5, 5);
				gbc_mno.fill = GridBagConstraints.HORIZONTAL;
				gbc_mno.gridx = 2;
				gbc_mno.gridy = 7;
				panel.add(mno, gbc_mno);
				mno.setColumns(10);
			}
			{
				JButton btnNewButton = new JButton("Yeni Musteriyi Ekle");
				GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
				gbc_btnNewButton.gridwidth = 3;
				gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
				gbc_btnNewButton.gridx = 5;
				gbc_btnNewButton.gridy = 9;
				panel.add(btnNewButton, gbc_btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("Temizle");
				GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
				gbc_btnNewButton_1.gridx = 8;
				gbc_btnNewButton_1.gridy = 9;
				panel.add(btnNewButton_1, gbc_btnNewButton_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(15, 373, 1198, 278);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 1201, 262);
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
		listele.setBounds(470, 328, 175, 29);
		contentPanel.add(listele);
		
		aramacubugu = new JTextField();
		aramacubugu.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String ara = aramacubugu.getText();
				
				dinamikAra(ara);
				
				
			}

			private void dinamikAra(String ara) {
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				
				musteritablosu.setRowSorter(tr);
				
			tr.setRowFilter(RowFilter.regexFilter(ara));
			
				
			}
		});
		
		
		aramacubugu.setBounds(942, 331, 256, 26);
		contentPanel.add(aramacubugu);
		aramacubugu.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Dinamik Ara");
		lblNewLabel.setBounds(830, 336, 139, 20);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		
		model = (DefaultTableModel) musteritablosu.getModel();
		
		
		
		
		
		
		
	}
}
