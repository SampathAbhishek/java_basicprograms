import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
public class Hello{
	public static void main(String [] args) {
		new Test();
	}
	
}
class Test extends JFrame{
	
	private static final long serialVersionUID = 1L; 
	JLabel l1;
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	public Test(){
		
		l1 = new JLabel("Greeting");
		t1 = new JTextField(20);
		b = new JButton("Enter");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		ButtonGroup b1 = new ButtonGroup();
		b1.add(r1);
		b1.add(r2);
		add(t1);
		add(b);
		add(r1);
		add(r2);
		add(l1);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = t1.getText();
				if(r1.isSelected()) {
					l1.setText("Hello "+"Mr "+name);
				}
				else {
					l1.setText("Hey "+"Mrs "+name);
				}
				
			}
			
		});
		
		
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(3);
	}
	
}
