package P1;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEventTest(){
		panel = new JPanel(new GridLayout(0, 2));
		panel.add(new JLabel("문자를 입력하시오: "));
		
	}
}
