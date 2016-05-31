package ua.on0t0le;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	
	public Window(String name){
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,3));
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton();
		b8 = new JButton();
		b9 = new JButton();
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		
		GameEngine engine = new GameEngine(this);
		b1.addActionListener(engine);
		b2.addActionListener(engine);
		b3.addActionListener(engine);
		b4.addActionListener(engine);
		b5.addActionListener(engine);
		b6.addActionListener(engine);
		b7.addActionListener(engine);
		b8.addActionListener(engine);
		b9.addActionListener(engine);
		
		setTitle(name);
		setSize(300,300);
		setVisible(true);
		setContentPane(p1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
