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

public class MusteriGiris extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable musteritablosu;
	DefaultTableModel model;
	MusteriIslemleri islemler = new MusteriIslemleri();
	private JTextField aramacubugu;
	

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
