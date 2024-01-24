package estruct.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Cursor;
import java.util.Locale;

@SuppressWarnings("serial")
public class Progress extends JFrame {
	JProgressBar progressBar;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Progress frame = new Progress();
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
	public Progress() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 178);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setLocale(new Locale("es", "CU"));
		progressBar.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.WHITE);
		progressBar.setForeground(new Color(50, 205, 50));
		progressBar.setBounds(0, 60, 750, 71);
		contentPane.add(progressBar);
		
		JLabel lblCargandoSistema = new JLabel("Cargando Sistema...");
		lblCargandoSistema.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCargandoSistema.setBounds(294, 21, 138, 17);
		contentPane.add(lblCargandoSistema);
		
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		arrancar();
	}
	
	public void arrancar() {
		Thread hilo = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) {
					try {
						progressBar.setValue(i);
						Thread.sleep(25);
						if (i==100) {
							Principal p = new Principal();
							p.setVisible(true);
							dispose();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		hilo.start();
		
		
	}

	

}
