package ua.on0t0le;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame{
	
	private JTextField t1,t2;
	JLabel l1,l2;
	JButton b1,b2;
	
	public void setName(String val){
		t1.setText(val);
	}
	public String getName(){
		return t1.getText();
	}
	
	public void setModel(String val){
		t2.setText(val);
	}
	public String getModel(){
		return t2.getText();
	}
	
	ProgramEngine progeng = new ProgramEngine(this);
	
	public Window(String name){
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1));
		b1 = new JButton("Add");
		b2 = new JButton("Show");
		p2.add(b1);
		p2.add(b2);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(1,4));
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel("Name");
		l2=new JLabel("Model");
		
		p3.add(l1);
		p3.add(t1);
		p3.add(l2);
		p3.add(t2);
		
		
		p1.add(p3, "North");
		p1.add(p2, "Center");
		
		
		
		
		setTitle(name);
		setContentPane(p1);
		setVisible(true);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		b1.addActionListener(progeng);
		b2.addActionListener(progeng);
		
		
	}
	
}
