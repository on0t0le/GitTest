package ua.on0t0le;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ProgramEngine implements ActionListener{

	Window parent;
	ArrayList<Car> l = new ArrayList<>();
	ProgramEngine(Window parent){
		this.parent=parent;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==parent.b1){
			String name = (String)parent.getName();
			String model = (String)parent.getModel();
			l.add(new Car(name, model));
		}
		if(e.getSource()==parent.b2){
			System.out.printf("Your list is\n");
			for(Car i: l){
				System.out.println(i.getName()+" "+i.getModel());
			}
		}
	}

}
