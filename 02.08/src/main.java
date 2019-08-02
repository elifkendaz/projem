import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 496);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("M\u00FC\u015Fteri \u0130\u015Flemleri");
		menuBar.add(mnNewMenu);
		
		JMenuItem musterigiris = new JMenuItem("M\u00FC\u015Fteri Giri\u015F");
		musterigiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusteriGiris MusteriGiris = new MusteriGiris();
				
				MusteriGiris.setVisible(true);
				
				
				
			}
		});
		mnNewMenu.add(musterigiris);
		
		JMenuItem musteriguncelle = new JMenuItem("M\u00FC\u015Fteri G\u00FCncelle");
		mnNewMenu.add(musteriguncelle);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
