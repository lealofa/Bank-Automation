package src;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class AkilliAsistan extends JFrame {

	private JPanel contentPane;
	private JTextField mesaj_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AkilliAsistan frame = new AkilliAsistan();
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
	public AkilliAsistan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("İyi günler! Sizi yeniden gördüğüme sevindim.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(80, 15, 290, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblSizeNaslYardmc = new JLabel("Size nasıl yardımcı olablirim ?");
		lblSizeNaslYardmc.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSizeNaslYardmc.setBounds(80, 39, 231, 24);
		contentPane.add(lblSizeNaslYardmc);
		
	
		JLabel hesap= new JLabel();
		hesap.setBounds(2, 175, 200, 40);
		
		JLabel hesap2= new JLabel();
		hesap2.setBounds(2, 230, 400, 40);
		hesap2.setForeground(Color.RED);		

		
		JLabel hesap3= new JLabel();
		hesap3.setBounds(2, 250, 400, 40);
		
		JLabel hesap4= new JLabel();
		hesap4.setBounds(2, 275, 400, 40);
		
		JLabel hesap5= new JLabel();
		hesap5.setBounds(2, 300, 400, 40);
		hesap5.setForeground(Color.RED);
		
		JLabel hesap6= new JLabel();
		hesap6.setBounds(2, 320, 400, 40);
		
		
		JLabel hesap_7 = new JLabel();
		hesap_7.setBounds(374, 110, 200, 40);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(355, 114, 115, 30);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(75, 180, 135, 30);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(75, 210, 409, 200);
		
		JLabel robot_2 = new JLabel("");
		robot_2.setIcon(new ImageIcon(getClass().getResource("zyro-image (11).png")));
		robot_2.setBounds(-12, 169, 67, 51);
		
		JLabel robot_3 = new JLabel("");
		robot_3.setIcon(new ImageIcon(getClass().getResource("zyro-image (11).png")));
		robot_3.setBounds(-12, 230, 67, 51);
	
		
		JLabel kullanici_1 = new JLabel("");
		kullanici_1.setIcon(new ImageIcon(getClass().getResource("zyro-image (16).png")));
		kullanici_1.setBounds(475, 105, 200, 35);
		
		JButton btnNewButton = new JButton("Hesap Bilgileri");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				
				Menu menu5=new Menu();
				
				contentPane.add(robot_2);
				contentPane.add(robot_3);
				contentPane.add(kullanici_1);
				
				contentPane.add(textArea_1);
				contentPane.add(textArea_2);
				contentPane.add(textArea_3);
				

				hesap.setText("                         Hesap Bilgileriniz:");
				
				hesap2.setText("                        Vadesiz Hesaplarınız:");
				
				hesap3.setText("                        Vadesiz hesaplarınızda toplam 5000.0 TL bulunmaktadır.");
				
				hesap4.setText("                        -------------------------------------------------------------------------------");
				
				hesap5.setText("                        Vadeli Hesaplarınız:");
				
				hesap6.setText("                        Vadeli hesabınız bulunmamaktadır.");
				
				hesap_7.setText("  Hesap Bİlgileri");
				

				

				

			}
		});
		
		contentPane.add(hesap);
		contentPane.add(hesap2);
		contentPane.add(hesap3);
		contentPane.add(hesap4);
		contentPane.add(hesap5);
		contentPane.add(hesap6);
		contentPane.add(hesap_7);
		


		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(75, 79, 121, 21);
		contentPane.add(btnNewButton);
		
		JButton btnIletiimHatt = new JButton("İletişim Hattı");
		btnIletiimHatt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser = Desktop.getDesktop();				
				try {					
					browser.browse(new URI("https://www.tbb.org.tr/tr/ana-sayfa/iletisim/104"));	
					}catch(IOException err) {	
						
					} catch (URISyntaxException e1) {														}

				
			}
		});
		btnIletiimHatt.setBackground(Color.WHITE);
		btnIletiimHatt.setBounds(208, 79, 121, 21);
		contentPane.add(btnIletiimHatt);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(75, 10, 351, 59);
		contentPane.add(textArea);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("zyro-image (11).png")));
		lblNewLabel_1.setBounds(-12, 10, 67, 51);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(2, 364, 543, 9);
		contentPane.add(lblNewLabel_2);
		
		mesaj_1 = new JTextField();
		mesaj_1.setBounds(85, 374, 244, 25);
		contentPane.add(mesaj_1);
		mesaj_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AkilliAsistan frame=new AkilliAsistan();
				
				
				if (mesaj_1.getText().equals("Geri")) {
					Menu menu = new Menu();
					menu.show();
				}
				
				
				if (mesaj_1.getText().equals("Çıkış")) {
					System.exit(0);
				}
				
				
				if (mesaj_1.getText().equals("QR İşlemler")) {
					QR qr = new QR();
					qr.show();
				}
				
				if (mesaj_1.getText().equals("Para Gönder")) {
					paraGonder pg = new paraGonder();
					pg.show();
				}
				
				if (mesaj_1.getText().equals("Para Çek")) {
					paraCek pc = new paraCek();
					pc.show();
				}
				
				if (mesaj_1.getText().equals("Para Yatır")) {
					paraYatir py= new paraYatir();
					py.show();
				}
				
				if (mesaj_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame,"Lütfen İnfo kutusundaki kısayolları giriniz! ","Uyarı", JOptionPane.WARNING_MESSAGE);
				}
			
				}
				
				 
				
				
			
			
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon(getClass().getResource("zyro-image (21).png")));
		btnNewButton_1.setBounds(331, 378, 27, 20);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setEnabled(false);
		textArea_4.setEditable(false);
		textArea_4.setBounds(93, 374, 265, 25);
		contentPane.add(textArea_4);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AkilliAsistan frame=new AkilliAsistan();
				JOptionPane.showMessageDialog(frame, "KISAYOLLAR\n"+"-Geri: Ana Menüyü açar\n"
						+ "-Para Yatır: Para Yatırma alanını açar\n"
						+ "-Para Çek: Para Çekme alanını açar\n"
						+ "-Para Gönder: Para Gönder alanını açar\n"
						+ "-QR İşlemler: QR İşlemler alanını açar\n"
						+ "-Çıkış: Uygulamadan çıkış yapar. ");
			}
		});
		btnNewButton_2.setBackground(new Color(217, 100, 0));
		btnNewButton_2.setIcon(new ImageIcon(getClass().getResource("zyro-image (24).png")));
		btnNewButton_2.setBounds(436, 10, 89, 77);
		contentPane.add(btnNewButton_2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
