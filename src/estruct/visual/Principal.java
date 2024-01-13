package estruct.visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable tableReport;

	
	public Principal() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 625, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 143, 457);
		contentPane.add(panel);
		
		JButton BtnReport = new JButton("Report");
		panel.add(BtnReport);
		
		tableReport = new JTable();
		tableReport.setBounds(143, 0, 466, 457);
		contentPane.add(tableReport);
	}
}
