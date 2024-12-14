package src;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class QR extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QR frame = new QR();
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
	public QR() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_logoqr = new JLabel(new ImageIcon(getClass().getResource("qr3.png")));
		lbl_logoqr.setBounds(355, 169, 91, 89);
		contentPane.add(lbl_logoqr);
		
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("aslan.png")));
		lbl_logo.setBounds(191, -17, 479, 167);
		contentPane.add(lbl_logo);
		JLabel lblNewLabel = new JLabel("MTÜ Öğrencilerine");
		lblNewLabel.setForeground(new Color(217, 100, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(20, 145, 145, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("QR Kod işlemleri");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 70, 281, 65);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTl = new JLabel("400 TL");
		lblTl.setForeground(new Color(217, 100, 0));
		lblTl.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTl.setBackground(Color.WHITE);
		lblTl.setBounds(20, 167, 91, 25);
		contentPane.add(lblTl);
		
		JLabel lblYemekBursu = new JLabel("yemek bursu");
		lblYemekBursu.setForeground(new Color(217, 100, 0));
		lblYemekBursu.setBackground(Color.WHITE);
		lblYemekBursu.setBounds(20, 185, 91, 25);
		contentPane.add(lblYemekBursu);
		
		JLabel lblBurstanFaydalanmakIin = new JLabel("burstan faydalanmak için");
		lblBurstanFaydalanmakIin.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblBurstanFaydalanmakIin.setForeground(new Color(217, 100, 0));
		lblBurstanFaydalanmakIin.setBackground(Color.WHITE);
		lblBurstanFaydalanmakIin.setBounds(20, 201, 145, 25);
		contentPane.add(lblBurstanFaydalanmakIin);
		
		JLabel lblMt = new JLabel("MTÜ Obs sistemine giriş yapın");
		lblMt.setForeground(new Color(217, 100, 0));
		lblMt.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMt.setBackground(Color.WHITE);
		lblMt.setBounds(20, 220, 189, 25);
		contentPane.add(lblMt);
		
		JLabel lblNewLabel_3 = new JLabel("Siteye gitmek için QR kodu okutunuz");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(280, 149, 241, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(getClass().getResource("zyro-image (1).png")));
		lblNewLabel_4.setBounds(178, 299, 104, 104);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("YBS BANKASI");
		lblNewLabel_1_1_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1_1_1.setBounds(0, 343, 189, 50);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Malatya Turgut Özal Üniversitesi");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1_1_1.setBounds(283, 347, 248, 50);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Seni düşünür o");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(294, 343, 256, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(getClass().getResource("zyro-image (5).png")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginSayfasi lg= new LoginSayfasi();
				lg.show();
			}
		});
		btnNewButton.setBackground(new Color(217, 100, 0));
		btnNewButton.setBounds(20, 10, 81, 50);
		contentPane.add(btnNewButton);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(217, 100, 0));
		textArea_1.setBounds(0, 289, 531, 114);
		contentPane.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(217, 100, 0));
		textArea.setBounds(-10, 0, 531, 135);
		contentPane.add(textArea);
	}
}
