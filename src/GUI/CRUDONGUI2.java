package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.Global.Global;
import com.jdbcversion3.CRUDV1;

public class CRUDONGUI2 extends JFrame{
	JLabel labelpid,labelname,labeladdress;
	JTextField fieldpid,fieldname,fieldaddress;
	JButton btnsearch,btnclose;
	public CRUDONGUI2()
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
		
		btnsearch = new JButton("Search");
		btnsearch.setBounds(145, 200, 80, 30);
		
		btnclose = new JButton("Close");
		btnclose.setBounds(225, 200, 80, 30);
		
		btnsearch.addActionListener(e->{
			int pid = Integer.parseInt(fieldpid.getText());
			boolean result = new CRUDV1().search(pid);
			
			if(result)
			{
				fieldname.setText(Global.name);
				fieldaddress.setText(Global.address);
				JOptionPane.showMessageDialog(btnsearch, "Search Successfully");
	
		
			}
			else
			{
				fieldname.setText(null);
				fieldaddress.setText(null);
				JOptionPane.showMessageDialog(btnsearch, "Error to search");
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
		add(btnsearch);
		add(btnclose);
		
		setSize(500,500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new CRUDONGUI2();
		
		
	}
	
	
}


