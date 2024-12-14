package src;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class LoginSayfasi extends JFrame {
	

	private JPanel k_pane;
	private JTextField fld_TC;
	private JPasswordField fld_sıfre;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSayfasi frame = new LoginSayfasi();
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
	public LoginSayfasi() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setForeground(Color.BLUE);
		setTitle("Banka Otomasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		k_pane = new JPanel();
		k_pane.setBackground(new Color(217, 100, 0));
		k_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(k_pane);
		k_pane.setLayout(null);
		
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("ING_Logo_TuruncuBG_Big4.png")));
		lbl_logo.setBounds(-130, 0,	 479, 167);
		k_pane.add(lbl_logo);
		
	
		JLabel lblNewLabel = new JLabel("TCKN:");
		lblNewLabel.setBounds(180, 158, 92, 52);
		k_pane.add(lblNewLabel);
		
		
		
		
		JButton btnNewButton = new JButton("Giriş Yap");
		btnNewButton.setBackground(new Color(255, 255, 255));
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tc=fld_TC.getText();
				
				if (fld_sıfre.getText().isEmpty()) {
					LoginSayfasi frame= new LoginSayfasi();
					JOptionPane.showMessageDialog(frame,"Lutfen tüm alanları doldurun","Uyarı", JOptionPane.WARNING_MESSAGE);

				}else {
					LoginSayfasi frame= new LoginSayfasi();

					if (tc.length()==11) {
	                    Menu menu=new Menu();
						
						menu.show();
						
					
					}else {
						JOptionPane.showMessageDialog(frame,"TCKN 11 hane olmalıdır! ","Uyarı", JOptionPane.WARNING_MESSAGE);

					}
				}
				

				
				
			
				
			}
			
		});
		
		
		btnNewButton.setBounds(211, 266, 122, 19);
		k_pane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(217, 100, 0));
		panel.setBounds(211, 0, 350, 167);
		k_pane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("YBS BANKASI");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_1.setBounds(10, -36, 286, 114);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bir bankadan daha fazlası");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 38, 189, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YBS Mobile'e Hoş Geldiniz");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(42, 77, 221, 59);
		panel.add(lblNewLabel_3);
		
		fld_TC = new JTextField();
		fld_TC.setBackground(new Color(217, 100, 0));
		fld_TC.setBounds(221, 175, 112, 19);
		k_pane.add(fld_TC);
		fld_TC.setColumns(10);
		
		
		
		JLabel lblNewLabel_4 = new JLabel("Şifreniz:");
		lblNewLabel_4.setBounds(167, 221, 55, 13);
		k_pane.add(lblNewLabel_4);
		
		fld_sıfre = new JPasswordField();
		fld_sıfre.setBackground(new Color(217, 100, 0));
		fld_sıfre.setBounds(221, 218, 112, 16);
		k_pane.add(fld_sıfre);
		
		JButton btnQrIlemler = new JButton("QR İŞLEMLER");
		btnQrIlemler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QR qr=new QR();
				qr.show();
				
			}
		});
		btnQrIlemler.setBackground(new Color(255, 255, 255));
		btnQrIlemler.setBounds(211, 295, 122, 19);
		k_pane.add(btnQrIlemler);
	}
}
