package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JComboBox;

public class paraGonder extends JFrame {

	private JPanel contentPane;
	private JTextField ba_4;
	private JTextField txtTr;
	private JTextField aciklama_1;
	private JTextField tutar1;
	protected String s2;
	Menu menu11=new Menu();
	

	 public  void setBa_1Value(String value) {
	        ba_4.setText(value);
	 }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paraGonder frame = new paraGonder();
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
	public paraGonder() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Havale/EFT/FAST");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(10, 10, 234, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vadesiz TL");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(31, 84, 169, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TR58 0001 5001 5800 7214 8017 40");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(30, 118, 265, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mevcut Bakiye");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(31, 153, 96, 13);
		contentPane.add(lblNewLabel_3);
		
		ba_4 = new JTextField();
		ba_4.setEditable(false);
		ba_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ba_4.setText("5000.0");
		ba_4.setBackground(new Color(192, 192, 192));
		ba_4.setBounds(129, 150, 130, 19);
		contentPane.add(ba_4);
		ba_4.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setBackground(new Color(217, 100, 0));
		textArea.setBounds(0, 0, 521, 63);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEnabled(false);
		textArea_1.setBounds(10, 89, 511, 92);
		contentPane.add(textArea_1);
		
		JLabel lblNewLabel_4 = new JLabel("Ödeme Aracı");
		lblNewLabel_4.setBounds(31, 73, 77, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Alıcı Bilgileri");
		lblNewLabel_5.setBounds(31, 201, 77, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("IBAN");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_6.setBounds(41, 233, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		txtTr = new JTextField();
		txtTr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTr.setText("TR45 0001 0090 1026 2043 1054 07");
		txtTr.setBounds(31, 256, 264, 19);
		contentPane.add(txtTr);
		txtTr.setColumns(10);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEnabled(false);
		textArea_2.setBounds(10, 215, 511, 70);
		contentPane.add(textArea_2);
		
		JLabel lblNewLabel_7 = new JLabel("Tutar");
		lblNewLabel_7.setBounds(41, 305, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Açıklama");
		lblNewLabel_8.setBounds(174, 305, 70, 13);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Gönderim Türü");
		lblNewLabel_9.setBounds(310, 305, 88, 13);
		contentPane.add(lblNewLabel_9);
		
		String secenek[]= {"Bireysel Ödeme","Kira Ödeme","Çalışan Ödemesi","Aidat Ödemesi","Ticari Ödeme"};
		JComboBox gonderim_1 = new JComboBox(secenek);
		gonderim_1.setBackground(new Color(255, 255, 255));
		gonderim_1.setBounds(290, 328, 126, 19);
		contentPane.add(gonderim_1);
		
		aciklama_1 = new JTextField();
		aciklama_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		aciklama_1.setColumns(10);
		aciklama_1.setBounds(152, 328, 126, 19);
		contentPane.add(aciklama_1);
		
		tutar1 = new JTextField();
		tutar1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tutar1.setColumns(10);
		tutar1.setBounds(16, 328, 126, 19);
		contentPane.add(tutar1);
		
		JButton btnNewButton = new JButton("Gönder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				paraGonder frame= new paraGonder();
				paraGonder frame2=new paraGonder();
				paraGonder frame3=new paraGonder();
				if (tutar1.getText().isEmpty()||aciklama_1.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(frame,"Lütfen boş alanları doldurun","Uyarı", JOptionPane.WARNING_MESSAGE);

				}else {
					
					
					String tutar=tutar1.getText();
					double numara3= Double.parseDouble(tutar);
					
					String ba4=ba_4.getText();
					double numara2= Double.parseDouble(ba4);
					
					double sonuc=numara2-numara3;
					
					 s2=String.valueOf(sonuc);
					
					
					
					if (numara2>=numara3) {
						JOptionPane.showMessageDialog(frame,"Bakiyenizden "+numara3+" TL tutarında para gönderildi!");
						ba_4.setText(s2);
					}else {
						JOptionPane.showMessageDialog(frame,"Bakiyenizden fazla para gönderemezsiniz!!","Uyarı", JOptionPane.WARNING_MESSAGE);
					}
					
					if (tutar1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frame2,"Lütfen tutar alanını doldurun!","Uyarı", JOptionPane.WARNING_MESSAGE);
					}else {
						
					}
					
					if (aciklama_1.getText().isEmpty()) {
						JOptionPane.showMessageDialog(frame3,"Lütfen açıklama alanını doldurun!","Uyarı", JOptionPane.WARNING_MESSAGE);
					}
					else {
						
					}
					
			
			}
			}
		});
		btnNewButton.setBounds(193, 372, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("Menü");
		btnNewButton_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu2 = new Menu();
	             menu2.setBa_1Value(s2);
	             ba_4.setText(menu11.ba_1.getText());
				menu2.show();
				
			}
		});
		btnNewButton_1_1_1_2_1.setForeground(new Color(217, 100, 0));
		btnNewButton_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1.setBackground(SystemColor.menu);
		btnNewButton_1_1_1_2_1.setBounds(374, 370, 157, 32);
		contentPane.add(btnNewButton_1_1_1_2_1);
		
	
	}
}
