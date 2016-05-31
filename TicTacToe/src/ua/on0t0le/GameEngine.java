package ua.on0t0le;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class GameEngine implements ActionListener {
	String label, player;
	int count=0;
	Window parent;
	
	
	public GameEngine(Window parent){
		this.parent=parent;
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent b) {
		if(count%2==0){
			label="X";
			player="First (X) ";
		}else{
			label="O";
			player="Second (O) ";
		}
		if(b.getSource()==parent.b1){ 
			parent.b1.setText(label);
			parent.b1.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b2){			
			parent.b2.setText(label);
			parent.b2.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b3){			
			parent.b3.setText(label);
			parent.b3.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b4){			
			parent.b4.setText(label);
			parent.b4.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b5){			
			parent.b5.setText(label);
			parent.b5.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b6){			
			parent.b6.setText(label);
			parent.b6.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b7){			
			parent.b7.setText(label);
			parent.b7.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b8){			
			parent.b8.setText(label);
			parent.b8.setEnabled(false);
			count++;}
		if(b.getSource()==parent.b9){			
			parent.b9.setText(label);
			parent.b9.setEnabled(false);
			count++;}
		
		if((parent.b1.getText()==parent.b2.getText()&parent.b2.getText()==parent.b3.getText()&parent.b1.getText()!="")||
		   (parent.b4.getText()==parent.b5.getText()&parent.b5.getText()==parent.b6.getText()&parent.b4.getText()!="")||
		   (parent.b7.getText()==parent.b8.getText()&parent.b8.getText()==parent.b9.getText()&parent.b7.getText()!="")||
		   (parent.b1.getText()==parent.b5.getText()&parent.b5.getText()==parent.b9.getText()&parent.b1.getText()!="")||
		   (parent.b3.getText()==parent.b5.getText()&parent.b5.getText()==parent.b7.getText()&parent.b3.getText()!="")||
		   (parent.b1.getText()==parent.b4.getText()&parent.b4.getText()==parent.b7.getText()&parent.b1.getText()!="")||
		   (parent.b2.getText()==parent.b5.getText()&parent.b5.getText()==parent.b8.getText()&parent.b2.getText()!="")||
		   (parent.b3.getText()==parent.b6.getText()&parent.b6.getText()==parent.b9.getText()&parent.b3.getText()!="")){
			JOptionPane.showMessageDialog(null, "Player "+player+" wins!");
			parent.dispose();
		}
		
			
		
	}

}
