package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jdbcversion3.CRUDV1;
public class CRUDONGUI1 extends JFrame {
	JLabel labelpid,labelname,labeladdress;
	JTextField fieldpid,fieldname,fieldaddress;
	JButton btnsave,btnclose;
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==btnsave)
//		{
//			System.exit(0);
//		}
//		else if( e.getSource()==btnclose)
//		{
//			int pid = Integer.parseInt(fieldpid.getText());
//			String name =  fieldname.getText();
//			String address = fieldaddress.getText();
//			System.out.println(pid+""+name+""+address);
//			boolean result = new CRUDV1().insert(pid,name,address);
//			if(result)
//			{
//				JOptionPane.showMessageDialog(this, "Saved Successfully");
//				
//			}
//			else
//			{
//				JOptionPane.showMessageDialog(this, "Error to saved");
//			}
//		}
//		
//	}
	public CRUDONGUI1()
	{
		setTitle("CRUD");
		
		labelpid = new JLabel("PID");
		labelpid.setBounds(50, 50, 80, 30);
		fieldpid = new JTextField("Enter id");
		fieldpid.setBounds(150, 50, 150, 30);
		
		labelname = new JLabel("Name");
		labelname.setBounds(50, 100, 80, 30);
		fieldname = new JTextField("Enter name");
		fieldname.setBounds(150, 100, 150, 30);
		
		labeladdress = new JLabel("Address");
		labeladdress.setBounds(50, 150, 80, 30);
		fieldaddress = new JTextField("Enter address");
		fieldaddress.setBounds(150, 150, 150, 30);
		
		btnsave = new JButton("Save");
		btnsave.setBounds(145, 200, 80, 30);
		
		btnclose = new JButton("Close");
		btnclose.setBounds(225, 200, 80, 30);
//		btnsave.addActionListener(this);
//		btnclose.addActionListener(this);
//		btnsave.addActionListener(e -> {
//			int pid = Integer.parse.getText();
//		});
		
		btnsave.addActionListener(e->{
			int pid = Integer.parseInt(fieldpid.getText());
			String name = fieldname.getText();
			String address = fieldaddress.getText();
			boolean result = new CRUDV1().insert(pid,name,address);
			if(result)
			{
				JOptionPane.showMessageDialog(btnsave, "Inserted Successfully");
				
			}
			else
			{
				JOptionPane.showMessageDialog(btnsave, "Error to saved");
			}
		});
		btnclose.addActionListener(e ->{
			System.exit(0);
		});
		add(labelpid);
		add(fieldpid);
		add(labelname);
		add(fieldname);
		add(labeladdress);
		add(fieldaddress);
		add(btnsave);
		add(btnclose);
		
		setSize(500,500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CRUDONGUI1();
		
		
	}
	
	
}
