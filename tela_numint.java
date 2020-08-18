package frame;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela_numint extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Tela;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_numint frame = new tela_numint();
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
	public tela_numint() {
		getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("New button");
		btn1.setBounds(155, 206, 89, 23);
		getContentPane().add(btn1);
		
		txt1 = new JTextField();
		txt1.setBounds(238, 56, 86, 20);
		getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(238, 124, 86, 20);
		getContentPane().add(txt2);
		txt2.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 219);
		Tela = new JPanel();
		Tela.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Tela);
		Tela.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(39, 38, 46, 14);
		Tela.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(39, 84, 46, 14);
		Tela.add(lblNewLabel_1);
		
		txtA = new JTextField();
		txtA.setBounds(128, 38, 86, 20);
		Tela.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(128, 84, 86, 20);
		Tela.add(txtB);
		txtB.setColumns(10);
		
		JButton btnMostrarNumeros = new JButton("Mostrar n\u00FAmeros");
		btnMostrarNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				String txtA= txt1.getText();
				String txtB= txt2.getText();
				int a= Integer.parseInt(txtA);
				int b= Integer.parseInt(txtB);
				String value = "";
				
				for(int x=a; x<=b; x++) {
					if (x>a && x<b) {
						value = value + x ;
					}
				}
				JOptionPane.showMessageDialog(Tela,"Valores entre" + a + " e"+ b + " :" + value);
			}
		});
		btnMostrarNumeros.setBounds(51, 126, 163, 23);
		Tela.add(btnMostrarNumeros);
	}

}
