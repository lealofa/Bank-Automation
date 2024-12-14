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

public class paraYatir extends JFrame {

	private JPanel contentPane;
	private JTextField yaM;
	private JTextField ba_2;
	protected String s2;
	Menu menu11=new Menu();
	

	 public  void setBa_1Value(String value) {
	        ba_2.setText(value);
	 }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paraYatir frame = new paraYatir();
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
	public paraYatir() {
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
		
		ba_2 = new JTextField();
		ba_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		ba_2.setEditable(false);
		ba_2.setText("5000.0");
		ba_2.setBackground(new Color(217, 100, 0));
		ba_2.setBounds(425, 56, 96, 19);
		contentPane.add(ba_2);
		ba_2.setColumns(10);
		
		
		
		JButton btnYtr = new JButton("Yatır");
		btnYtr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bas=yaM.getText();
				paraCek frame=new paraCek();
				if (yaM.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(frame,"Lütfen Yatırılacak tutarı giriniz","Uyarı", JOptionPane.WARNING_MESSAGE);

				}else {
					String yam1=yaM.getText();
					double numara3= Double.parseDouble(yam1);
					
					String ba2=ba_2.getText();
					double numara2= Double.parseDouble(ba2);
					
					double sonuc=numara2+numara3;
					
					 s2=String.valueOf(sonuc);
					
					
				
						ba_2.setText(s2);
						 JOptionPane.showMessageDialog(frame,"Bakiyenize "+numara3+" TL tutarında para yatırıldı!");
					
				
			}
				
			}
		});
		btnYtr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnYtr.setBounds(200, 219, 85, 21);
		contentPane.add(btnYtr);
		
		JLabel lblNewLabel_2 = new JLabel("Para Yatır");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(21, 10, 195, 55);
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
		
		yaM = new JTextField();
		yaM.setBounds(246, 34, 132, 19);
		panel.add(yaM);
		yaM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		yaM.setBackground(new Color(240, 240, 240));
		yaM.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Yatırmak istediğiniz miktari giriniz");
		lblNewLabel_1.setBounds(10, 25, 232, 39);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnNewButton_1_1_1_2_1 = new JButton("Menü");
		btnNewButton_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu menu = new Menu();
	             menu.setBa_1Value(s2);
	             ba_2.setText(menu11.ba_1.getText());
				menu.show();
			}
		});
		btnNewButton_1_1_1_2_1.setForeground(new Color(217, 100, 0));
		btnNewButton_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1_2_1.setBackground(SystemColor.menu);
		btnNewButton_1_1_1_2_1.setBounds(374, 370, 157, 32);
		contentPane.add(btnNewButton_1_1_1_2_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(142, 69, 45, 13);
		contentPane.add(label);
	}
}
