package P1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Mylistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("버튼이 눌려졌습니다.");
	}
	
}
