import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Hello{
	public static void main(String[] args) {
	new Test();
	}
}
class Test extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JTextField t1,t2;
	JButton b1;
	JLabel l1;
	Test(){
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b1 = new JButton("OK");
		add(t1);
		add(t2);
		add(b1);
		b1.addActionListener(this);
		l1 = new JLabel("Result");
		add(l1);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		int z = x + y;
		l1.setText(z+"");
	}
}
