package ua.on0t0le.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame {

	private JPanel p1;
	private JPanel p2;
	private JTabbedPane tabbedPane;
	private JTextArea txtrEnterUrlOf;
	private JButton btnDownloadImage;
	private JButton btnNewButton;
	private Choice choice;
	private JLabel lblImageFormat;
	private JButton btnView;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmSaveImage;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmExitProgram;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JLabel imageLabel;

	public MainWindow(int width, int height) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setSize(640, 480);
		setResizable(false);
		getContentPane().setLayout(null);
		
		p1 = new JPanel(null);
		p2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 86, 604, 345);
		getContentPane().add(tabbedPane);
		tabbedPane.addTab("Tab 1", p1);
		p1.setLayout(null);
		
		txtrEnterUrlOf = new JTextArea();
		txtrEnterUrlOf.setText("Enter URL of image here ...");
		txtrEnterUrlOf.setBounds(10, 60, 579, 47);
		p1.add(txtrEnterUrlOf);
		
		btnDownloadImage = new JButton("Download Image");
		btnDownloadImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {					
					Main.setImage(new URL(txtrEnterUrlOf.getText()));					
				} catch (MalformedURLException e1) {					
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Invalid URL or No internet connection!");
				}
			}
		});
		btnDownloadImage.setBounds(10, 11, 166, 23);
		p1.add(btnDownloadImage);
		
		btnNewButton = new JButton("Get File");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int reply = chooser.showOpenDialog(null);
				if(reply==JFileChooser.APPROVE_OPTION){
					Main.setImage(chooser.getSelectedFile());
				}
				
			}
		});
		btnNewButton.setBounds(256, 11, 101, 23);
		p1.add(btnNewButton);
		tabbedPane.addTab("Tab 2", p2);
		p2.setLayout(null);
		
		choice = new Choice();
		choice.setBounds(487, 10, 56, 20);
		p2.add(choice);
		
		choice.add("png");
		choice.add("jpg");
		
		lblImageFormat = new JLabel("Image format");
		lblImageFormat.setBounds(376, 10, 89, 20);
		p2.add(lblImageFormat);
		
		btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.getImage()==null){return;};
				imageLabel.setIcon(new ImageIcon(Main.getImage()));
				imageLabel.updateUI();
			}
		});
		btnView.setBounds(10, 11, 89, 23);
		p2.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 533, 261);
		p2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imageLabel = new JLabel("");
		panel.add(imageLabel, BorderLayout.CENTER);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 624, 21);
		getContentPane().add(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmSaveImage = new JMenuItem("Save Image");
		mntmSaveImage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int reply = chooser.showSaveDialog(null);
				if(reply == JFileChooser.APPROVE_OPTION){
					File f = chooser.getSelectedFile();
					f = new File(f.toString()+"."+choice.getSelectedItem());
					Main.saveImage(f, choice.getSelectedItem());
				}
				
			}
		});
		mnNewMenu.add(mntmSaveImage);
		
		mnNewMenu_1 = new JMenu("Options");
		menuBar.add(mnNewMenu_1);
		
		mntmExitProgram = new JMenuItem("Exit Program");
		mntmExitProgram.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		mnNewMenu_1.add(mntmExitProgram);
		
		
		
		
		setVisible(true);
	}
}
