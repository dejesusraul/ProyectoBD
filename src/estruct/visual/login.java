package estruct.visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField textFieldUserPass;
	private JTextField textFieldUsserName;
	JLabel LblError = new JLabel("error");
	

	
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/img/votacion.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Verificy()) {
					LblError.setVisible(true);
					textFieldUsserName.setText("");
					textFieldUserPass.setText("");
					
					
					
				}else{
					//Principal windowsPirnicpal = new Principal();
					//windowsPirnicpal.setVisible(true);
					Progress p = new Progress();
					p.setVisible(true);
					dispose();
				}
			}
		});
		btnNewButton.setBounds(247, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
				
			}
		});
		btnNewButton_1.setBounds(362, 209, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textFieldUserPass = new JPasswordField();
		textFieldUserPass.setBounds(247, 130, 202, 20);
		contentPane.add(textFieldUserPass);
		textFieldUserPass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contrase\u00F1a");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(247, 115, 180, 14);
		contentPane.add(lblNewLabel);
		
		textFieldUsserName = new JTextField();
		textFieldUsserName.setBounds(247, 84, 202, 20);
		contentPane.add(textFieldUsserName);
		textFieldUsserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(247, 69, 202, 14);
		contentPane.add(lblNewLabel_1);
		LblError.setFont(new Font("Tahoma", Font.BOLD, 14));
		LblError.setForeground(Color.RED);
		
		
		LblError.setBounds(259, 161, 212, 23);
		contentPane.add(LblError);
		
		JLabel fondo = new JLabel("New label");
		fondo.setIcon(new ImageIcon(login.class.getResource("/img/peque.png")));
		fondo.setBounds(0, 0, 481, 373);
		contentPane.add(fondo);
		LblError.setVisible(false);
	}
	
	public boolean Verificy() {
		boolean bandera=false;
		String nameUser=textFieldUsserName.getText();
		@SuppressWarnings("deprecation")
		String passUser=textFieldUserPass.getText();
		if(nameUser.equals("Cesar")|| nameUser.equals("Raul")){
            if(passUser.equals("cesar123") || passUser.equals("raul123")){
                bandera=true;
            } else {
            	LblError.setText(" La contraseña es incorrecta");
            	LblError.setVisible(true);
            }
            
        }else {
        	LblError.setText("El nombre es incorrecto");
        	LblError.setVisible(true);
        }
		
		return bandera;
	}
}
