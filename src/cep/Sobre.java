package cep;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Sobre() {
		setModal(true);
		setBackground(new Color(0, 0, 255));
		setFont(new Font("Dialog", Font.ITALIC, 12));
		getContentPane().setBackground(SystemColor.controlHighlight);
		getContentPane().setForeground(new Color(0, 0, 0));
		setTitle("Sobre");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/about.png")));
		setBounds(200, 200, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBounds(27, 46, 163, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WEB Service:");
		lblNewLabel_1.setBounds(27, 75, 85, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblWebService = new JLabel("  republicavirtual.com.br");
		lblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br");
			}
		});
		lblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblWebService.setForeground(new Color(0, 128, 255));
		lblWebService.setBounds(107, 75, 197, 14);
		getContentPane().add(lblWebService);
		
		JLabel lblNewLabel_3 = new JLabel("Um pequeno projeto de estudo :) ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(27, 108, 163, 14);
		getContentPane().add(lblNewLabel_3);
		
		JButton btnGitHub = new JButton("");
		btnGitHub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/Zeff1997/Busca_CEP");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 255, 255), new Color(0, 255, 255)));
		btnGitHub.setForeground(SystemColor.control);
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/guthub.png")));
		btnGitHub.setBounds(182, 174, 64, 64);
		getContentPane().add(btnGitHub);
		
		JLabel lblNewLabel_4 = new JLabel("Repositório");
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(107, 197, 85, 14);
		getContentPane().add(lblNewLabel_4);
	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
