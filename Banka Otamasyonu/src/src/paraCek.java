package src;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class paraCek extends JFrame {

	private JPanel contentPane;
	private JTextField cekM;
	private JTextField ba_3;
	protected String s2;
	Menu menu11=new Menu();
	

	 public  void setBa_1Value(String value) {
	        ba_3.setText(value);
	 }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paraCek frame = new paraCek();
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
	public paraCek() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ING_Logo_TuruncuBG_Big2.png")  ));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mevcut Bakiyeniz:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(302, 49, 118, 33);
		contentPane.add(lblNewLabel);
		
		ba_3 = new JTextField();
		ba_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		ba_3.setEditable(false);
		ba_3.setText("5000.0");
		ba_3.setBackground(new Color(217, 100, 0));
		ba_3.setBounds(425, 56, 96, 19);
		contentPane.add(ba_3);
		ba_3.setColumns(10);
		
		
		
		JButton btnCek = new JButton("Çek");
		btnCek.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bas=cekM.getText();
				paraCek frame=new paraCek();
				if (cekM.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(frame,"Lütfen çekilecek tutarı giriniz","Uyarı", JOptionPane.WARNING_MESSAGE);

				}else {
					String cem1=cekM.getText();
					double numara3= Double.parseDouble(cem1);
					
					String ba3=ba_3.getText();
					double numara2= Double.parseDouble(ba3);
					
					double sonuc=numara2-numara3;
					
					 s2=String.valueOf(sonuc);
					
					
					
					if (numara2>=numara3) {
						JOptionPane.showMessageDialog(frame,"Bakiyenizden "+numara3+" TL tutarında para çekildi!");
						ba_3.setText(s2);
					}else {
						JOptionPane.showMessageDialog(frame,"Bakiyenizden fazla para çekemezsiniz!!","Uyarı", JOptionPane.WARNING_MESSAGE);
					}
					
				
			}
				
			}
		});
		btnCek.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCek.setBounds(200, 219, 85, 21);
		contentPane.add(btnCek);
		
		JLabel lblNewLabel_2 = new JLabel("Para Çek");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(21, 10, 142, 55);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setBackground(new Color(217, 100, 0));
		textArea.setBounds(0, 0, 535, 107);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(33, 148, 432, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cekM = new JTextField();
		cekM.setBounds(246, 34, 132, 19);
		panel.add(cekM);
		cekM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cekM.setBackground(new Color(240, 240, 240));
		cekM.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Çekmek istediğiniz miktari giriniz:");
		lblNewLabel_1.setBounds(10, 25, 232, 39);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("Menü");
		btnNewButton_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu = new Menu();
	             menu.setBa_1Value(s2);
	             ba_3.setText(menu11.ba_1.getText());
				menu.show();
			}
		});
		btnNewButton_1_1_1_2_1.setForeground(new Color(217, 100, 0));
		btnNewButton_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1.setBackground(SystemColor.menu);
		btnNewButton_1_1_1_2_1.setBounds(374, 370, 157, 32);
		contentPane.add(btnNewButton_1_1_1_2_1);
	}
}
