package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.jdbcversion3.CRUDV1;

public class CRUDONGUI6 extends JFrame{
	JLabel labelpid, labelname, labeladdress;
	JTextField fieldpid, fieldname, fieldaddress;
	JButton export, btnclose;

	public CRUDONGUI6()
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
		
		export = new JButton("Export");
		export.setBounds(145, 200, 80, 30);
		
		btnclose = new JButton("Close");
		btnclose.setBounds(225, 200, 80, 30);
		
		export.addActionListener(e->{
			boolean result = new CRUDV1().dbexport();
			
			if(result)
			{
			
				JOptionPane.showMessageDialog(export, "Export Successfully");
	
		
			}
			else
			{
				fieldname.setText(null);
				fieldaddress.setText(null);
				JOptionPane.showMessageDialog(export, "Error to search");
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
		add(export);
		add(btnclose);
		
		setSize(500,500);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CRUDONGUI6();

	}
}
