package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Menu extends JFrame {

	private static final int LoginSayfasi = 0;
	private JPanel contentPane;
	protected JTextField ba_1;

	 public void setBa_1Value(String value) {
	        ba_1.setText(value);
	    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setTitle("Ana Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 100, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("ING_Logo_TuruncuBG_Big4.png")));
		lbl_logo.setBounds(186, 281, 193, 125);
		contentPane.add(lbl_logo);		
		JButton btnNewButton_1_1_1 = new JButton("Para Yatır");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1.setBackground(new Color(240, 255, 255));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					
					paraYatir py=new paraYatir();
					py.show();
					
				
					
				
				
			}
		});
		btnNewButton_1_1_1.setBounds(0, 329, 157, 32);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Para Çek");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				paraCek pc=new paraCek();
				
				pc.show();
				
			}
		});
		btnNewButton_1_1_1_1.setBackground(new Color(240, 255, 255));
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1_1.setBounds(374, 329, 157, 32);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Havale/EFT/FAST");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                paraGonder pg=new paraGonder();
				
				pg.show();
				
			}
		});
		btnNewButton_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_2.setBackground(new Color(240, 255, 255));
		btnNewButton_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1_2.setBounds(0, 246, 157, 32);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("YBS BANKASI");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_1.setBounds(245, 11, 276, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bir bankadan daha fazlası");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(265, 54, 256, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("İNÖNÜ ÜNİVERTESİ/MALATYA ŞUBESİ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(78, 106, 397, 27);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mevcut Bakiyeniz:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(127, 143, 162, 33);
		contentPane.add(lblNewLabel_4);
		
		ba_1 = new JTextField();
		String f="5000.0";
		ba_1.setText(f);
		ba_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ba_1.setEditable(false);
		ba_1.setColumns(10);
		ba_1.setBackground(new Color(217, 100, 0));
		ba_1.setBounds(275, 150, 96, 19);
		contentPane.add(ba_1);
		
		
		
		double numara2= Double.parseDouble(f);
		
		
		
		
		
		
		
		
		JLabel iban_1 = new JLabel("TR58 0001 5001 5800 7214 8017 40");
		iban_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		iban_1.setBounds(182, 186, 265, 13);
		contentPane.add(iban_1);
		
		JLabel lblNewLabel_6 = new JLabel("IBAN:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(127, 186, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JButton cikis_1 = new JButton("");
		cikis_1.setIcon(new ImageIcon(getClass().getResource("zyro-image (7).png")));
		cikis_1.setBackground(new Color(217, 100, 0));
		cikis_1.setBounds(10, 11, 83, 83);
		contentPane.add(cikis_1);
		
		JButton btnNewButton_1_1_1_3 = new JButton("Akıllı Asistan");
		btnNewButton_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AkilliAsistan aA= new AkilliAsistan();
				aA.show();
			}
		});
		btnNewButton_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1_1_3.setBackground(new Color(240, 255, 255));
		btnNewButton_1_1_1_3.setBounds(374, 246, 157, 32);
		contentPane.add(btnNewButton_1_1_1_3);
		cikis_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			LoginSayfasi ldon = new LoginSayfasi();
	            
				ldon.show();
			}
		});
		
		
		
		
		
		
	}
}
