package Guty;

//public class Guty {
	
import dao.*;
import beansd.*; 
	import javax.swing.*;

	import java.awt.Color;
	import java.awt.EventQueue;
	import java.awt.Font;
	import java.awt.color.*;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import java.nio.channels.ShutdownChannelGroupException;
	import java.awt.Image;
	public class Guty  {
		private JTextField txt_fname=new JTextField();
		private JTextField jtxt_lname=new JTextField();
		private JTextField jtxt_dob=new JTextField();
		private JTextField jtxt_gen=new JTextField();
		private JTextField jtxt_street=new JTextField();
		private JTextField jtxt_loc=new JTextField();
		private JTextField jtxt_mobno=new JTextField();
		private JTextField jtxt_email=new JTextField();
		//private JTextField jtxt_password=new JTextField();
		private JLabel jlbl_frame=new JLabel("FIRST NAME");
		private JLabel jlbl_lname=new JLabel("LAST NAME");
		private JLabel jlbl_dob=new JLabel("Date of birth");
		private JLabel jlbl_gen=new JLabel("GENDER");
		private JLabel jlbl_street=new JLabel("STREET");
		private JLabel jlbl_loc=new JLabel("LOCATION");
		private JLabel jlbl_mobno=new JLabel("MOBILE NO");
		private JLabel jlbl_email=new JLabel("EMAIL");
		private JLabel jlbl_password=new JLabel("PASSWORD");
		private JTextField jtxt_password=new JTextField();
		private JLabel jlbl_user=new JLabel();
		private JButton jb_ok=new JButton("SUBMIT");
		
		
			public Guty() {
			jlbl_frame.setBounds(175,75,80,20);
			jlbl_lname.setBounds(175,125,80,20);
			jb_ok.setBounds(175, 550, 130, 40);
			//jb_Login.setBounds(175, 175, 100, 30);
			//jb_New.setBounds(175, 225, 150, 30);
			//jlbl_Id.setBounds(35, 75, 200, 30);
			//jlbl_pas.setBounds(35, 125, 200, 30);
			jb_ok.setBackground(Color.lightGray);
			jb_ok.setForeground(Color.red);
			jlbl_frame.setBackground(Color.RED);
			jlbl_lname.setBackground(Color.pink);
			jlbl_frame.setForeground(Color.red);
			jlbl_lname.setForeground(Color.cyan);
			jlbl_dob.setBounds(175, 175, 80, 20);
			jlbl_gen.setBounds(175, 225, 80, 20);
			jlbl_street.setBounds(175, 275, 80, 20);
			jlbl_loc.setBounds(175, 325, 80, 20);
			jlbl_mobno.setBounds(175, 375, 80, 20);
			jlbl_email.setBounds(175, 425,80, 20);
			txt_fname.setBounds(260, 75, 325, 30);
			jtxt_lname.setBounds(260, 125, 325, 30);
			jtxt_dob.setBounds(260, 175,325 , 30);
			jtxt_gen.setBounds(260, 225, 325, 30);
			jtxt_street.setBounds(260, 275, 325, 30);
			jtxt_loc.setBounds(260, 325, 325, 30);
			jtxt_mobno.setBounds(260, 375, 325, 30);
			jtxt_email.setBounds(260, 425, 325, 30);
			jlbl_password.setBounds(175, 475, 325, 20);
			jtxt_password.setBounds(260, 475, 325, 30);
		//	JFrame frame_register= new JFrame();
			jlbl_dob.setForeground(Color.red);
			jlbl_gen.setForeground(Color.CYAN);
			jlbl_street.setForeground(Color.red);
			jlbl_loc.setForeground(Color.CYAN);
			jlbl_mobno.setForeground(Color.red);
			jlbl_email.setForeground(Color.cyan);
			//txt_fname.setBounds(80, 10, 50, 20);
			//jtxt_lname.setBounds(80, 20, 50, 20);
			//jtxt_dob.setBounds(80, 30, 50, 20);
			//jtxt_gen.setBounds(80, 40, 50, 20);
			//jtxt_street.setBounds(80, 50, 50, 20);
			//jtxt_loc.setBounds(80, 60, 50, 20);
			//jtxt_mobno.setBounds(80, 70, 50, 20);
			//jtxt_email.setBounds(80, 70, 60, 20);
			jlbl_password.setBackground(Color.RED);
			jlbl_password.setForeground(Color.red);
			 JLabel jlbl_pic=new JLabel();
			 jlbl_pic.setBounds(100, 200, 300, 300);
			JFrame jframeo=new JFrame("For new Register Fillup the from");
			jframeo.setSize(800, 640);
			jb_ok. addMouseListener(new MouseAdapter() { 
		          public void mouseEntered(MouseEvent me) { 
		              jb_ok.setBackground(Color.WHITE);
		              //JOptionPane.showMessageDialog(null,"Login here");
		            } 
		          }); 
			jb_ok.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent me) {
					jb_ok.setBackground(Color.LIGHT_GRAY);
				}
			});
			jframeo.add(jlbl_frame);
			jframeo.add(jlbl_lname);
			jframeo.add(jlbl_dob);
			jframeo.add(jlbl_dob);
			jframeo.add(jlbl_gen);
			jframeo.add(jlbl_street);
			jframeo.add(jlbl_loc);
			jframeo.add(jlbl_mobno);
			jframeo.add(jlbl_email);
			jframeo.add(txt_fname);
			jframeo.add(jtxt_lname);
			jframeo.add(jtxt_dob);
			jframeo.add(jtxt_dob);
			jframeo.add(jtxt_gen);
			jframeo.add(jtxt_street);
			jframeo.add(jtxt_loc);
			jframeo.add(jtxt_mobno);
			jframeo.add(jtxt_email);
			jframeo.add(jtxt_password);
			jframeo.add(jlbl_password);
			jframeo.add(jb_ok);
			 jframeo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Image img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
			jlbl_user.setIcon(new ImageIcon(img));
			jframeo.add(jlbl_user);
			jframeo.setVisible(true);
			jframeo.setResizable(false);
			jframeo.addMouseListener(new MouseAdapter() { 
		          public void mouseEntered(MouseEvent me) { 
		        	  Image img=new ImageIcon(this.getClass().getResource("/01 APF - entry_4.jpg")).getImage();
		  		jlbl_user.setIcon(new ImageIcon(img));
		  			jframeo.add(jlbl_user);
		              jb_ok.setBackground(Color.WHITE);
		             // JOptionPane.showMessageDialog(null,"Login here");
		            } 
		          }); 
			jframeo.addMouseListener(new MouseAdapter() { 
		          public void mouseExited(MouseEvent me) { 
		        	  Image img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
		  			jlbl_user.setIcon(new ImageIcon(img));
		  			jframeo.add(jlbl_user);
		              jb_ok.setBackground(Color.WHITE);
		              //JOptionPane.showMessageDialog(null,"Login here");
		            } 
		          }); 
			jb_ok.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jb_okActionPerformed(evt);
				}
			});		 

			
		}
	public void preg() {
		PatientBean sbo=new PatientBean();
		sbo.setDob(jtxt_dob.getText());
		sbo.setEmail(jtxt_email.getText());
		sbo.setFname(txt_fname.getText());
		sbo.setLname(jtxt_lname.getText());
		sbo.setGen(jtxt_gen.getText());
		sbo.setLoc(jtxt_loc.getText());
		sbo.setPassword(jtxt_password.getText());
		sbo.setMob(jtxt_mobno.getText());
		sbo.setStree(jtxt_street.getText());
		DBConnection ob=new DBConnection();
		ob.getConnection();
		boolean b = ob.registerpatient(sbo);
		if(b) {
			System.out.println("1 Record Updated Successfully");
		}
		else {
			JOptionPane.showMessageDialog(null,"Some error Ocurred ,check wheather yor name is registered or not");
		}
		ob.closeALL();

	}
	private void jb_okActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
//	DoReg er=new DoReg();
	if(txt_fname.getText().equals("")||jtxt_dob.getText().equals("")||jtxt_email.getText().equals("")||jtxt_gen.getText().equals("")||jtxt_lname.getText().equals("")||jtxt_loc.getText().equals("")||jtxt_mobno.getText().equals("")||jtxt_password.getText().equals("")||jtxt_street.getText().equals(""))
	{
		JOptionPane.showMessageDialog(null, "Please fill up all the text");
	}
	else{
	preg();
	}//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	}

}



