package estruct.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserPass;
	private JTextField textFieldUsserName;
	JLabel LblError = new JLabel("New label");
	

	
	public login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Acept");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Verificy()) {
					LblError.setVisible(false);
					Principal windowsPirnicpal = new Principal();
					windowsPirnicpal.setVisible(true);
					
					
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
		
		textFieldUserPass = new JTextField();
		textFieldUserPass.setBounds(247, 130, 202, 20);
		contentPane.add(textFieldUserPass);
		textFieldUserPass.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Introducing Pass");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(247, 115, 180, 14);
		contentPane.add(lblNewLabel);
		
		textFieldUsserName = new JTextField();
		textFieldUsserName.setBounds(247, 84, 202, 20);
		contentPane.add(textFieldUsserName);
		textFieldUsserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Introducing Name");
		lblNewLabel_1.setBounds(247, 69, 202, 14);
		contentPane.add(lblNewLabel_1);
		LblError.setForeground(Color.RED);
		
		
		LblError.setBounds(259, 161, 212, 14);
		contentPane.add(LblError);
		LblError.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Cesar Escalona\\Documents\\proyectoBD\\src\\img\\bandera.png"));
		lblNewLabel_2.setBounds(0, 0, 481, 373);
		contentPane.add(lblNewLabel_2);
	}
	
	public boolean Verificy() {
		boolean bandera=false;
		String nameUser=textFieldUsserName.getText();
		String passUser=textFieldUserPass.getText();
		if(nameUser.equals("Cesar")|| nameUser.equals("Raul")){
            if(passUser.equals("cesar123") || passUser.equals("raul123")){
                bandera=true;
            } else {
            	LblError.setText("El nombre es incorrecto");
            	LblError.setVisible(true);
            }
            
        }else {
        	LblError.setText("La contraseña es incorrecta");
        	LblError.setVisible(true);
        }
		
		return bandera;
	}
	
}
