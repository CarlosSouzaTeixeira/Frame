package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tela_login extends JFrame {

	private JPanel Login;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_login frame = new Tela_login();
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
	public Tela_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 246);
		Login = new JPanel();
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Login);
		Login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(74, 37, 56, 20);
		Login.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(74, 101, 62, 17);
		Login.add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(161, 40, 86, 20);
		Login.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(161, 102, 86, 20);
		Login.add(txtSenha);
		
		JButton btnEntrar = new JButton("entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(checkLogin(txtLogin.getText(),new String(txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(Login, "Login efetuado com sucesso!");
					
				} else {
					JOptionPane.showMessageDialog(Login, "Login ou senha incorreto!");
					
				}
				
				
			}
		});
		btnEntrar.setBounds(111, 158, 89, 23);
		Login.add(btnEntrar);
	}

	
	public boolean checkLogin(String login, String senha) {
	return login.equals("admin") && senha.equals("swordfish");
	}
	}
