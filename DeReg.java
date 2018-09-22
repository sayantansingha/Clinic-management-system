package Guty;
import dao.*;
import javax.swing.*;
import Timert.*;
import java.awt.Color;
//import java.awt.EventQueue;
//import java.awt.Font;
//import java.awt.color.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.nio.channels.ShutdownChannelGroupException;
import java.awt.Image;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import beansd.*;
public class DeReg {
	//protected static final TimerTask tesk = null;
	private JTextField txt_name=new JTextField("name");
	private JTextField jtxt_id=new JTextField("Id");
	private JTextField jtxt_dob=new JTextField("dob");
	private JTextField jtxt_doj=new JTextField("doj");
	private JTextField jtxt_street=new JTextField("street");
	private JTextField jtxt_yox=new JTextField("yox");
	private JTextField jtxt_mobno=new JTextField("mobno");
	private JTextField jtxt_speacial=new JTextField("so");
	//private JTextField jtxt_password=new JTextField();
	private JLabel jlbl_name=new JLabel("FIRST NAME");
	private JLabel jlbl_id=new JLabel("Doctor Id");
	private JLabel jlbl_dob=new JLabel("Date of birth");
	private JLabel jlbl_doj=new JLabel("Date of joint");
	private JLabel jlbl_street=new JLabel("STREET");
	private JLabel jlbl_speacial=new JLabel("Speacialist");
	private JLabel jlbl_mobno=new JLabel("MOBILE NO");
	private JLabel jlbl_yox=new JLabel("Year of experience");
	private JLabel jlbl_password=new JLabel("PASSWORD");
	private JTextField jtxt_password=new JTextField();
	private JLabel jlbl_user=new JLabel();
	private JButton jb_ok=new JButton("SUBMIT");
	private static Thread thread=new Thread();
	private Timer t1=new Timer();
	int s=0;
	private TimerTask t;
	private boolean tuo=true;
	
	
	public  DeReg() {
		
			jlbl_name.setBounds(175,75,80,20);
			jlbl_id.setBounds(175,125,80,20);
			jb_ok.setBounds(175, 550, 130, 40);
			//jb_Login.setBounds(175, 175, 100, 30);
			//jb_New.setBounds(175, 225, 150, 30);
			//jlbl_Id.setBounds(35, 75, 200, 30);
			//jlbl_pas.setBounds(35, 125, 200, 30);
			jb_ok.setBackground(Color.lightGray);
			jb_ok.setForeground(Color.red);
			jlbl_name.setBackground(Color.RED);
			jlbl_id.setBackground(Color.pink);
			jlbl_name.setForeground(Color.red);
			jlbl_id.setForeground(Color.cyan);
			jlbl_dob.setBounds(175, 175, 80, 20);
			jlbl_doj.setBounds(175, 225, 80, 20);
			jlbl_street.setBounds(175, 275, 80, 20);
			jlbl_speacial.setBounds(175, 325, 80, 20);
			jlbl_mobno.setBounds(175, 375, 80, 20);
			jlbl_yox.setBounds(175, 425,80, 20);
			txt_name.setBounds(260, 75, 325, 30);
			jtxt_id.setBounds(260, 125, 325, 30);
			jtxt_dob.setBounds(260, 175,325 , 30);
			jtxt_doj.setBounds(260, 225, 325, 30);
			jtxt_street.setBounds(260, 275, 325, 30);
			jtxt_speacial.setBounds(260, 325, 325, 30);
			jtxt_mobno.setBounds(260, 375, 325, 30);
			jtxt_yox.setBounds(260, 425, 325, 30);
			jlbl_password.setBounds(175, 475, 325, 20);
			jtxt_password.setBounds(260, 475, 325, 30);
		//	JFrame frame_register= new JFrame();
			jlbl_dob.setForeground(Color.red);
			jlbl_doj.setForeground(Color.CYAN);
			jlbl_street.setForeground(Color.red);
			jlbl_speacial.setForeground(Color.CYAN);
			jlbl_mobno.setForeground(Color.red);
			jlbl_yox.setForeground(Color.cyan);
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
		        	  //Timerclass ob=new Timerclass(); 
		              jb_ok.setBackground(Color.WHITE);
		              //JOptionPane.showMessageDialog(null,"Login here");
		            } 
		          }); 
			jb_ok.addMouseListener(new MouseAdapter() {
				public void mouseExited(MouseEvent me) {
					jb_ok.setBackground(Color.LIGHT_GRAY);
				}
			});
			jframeo.add(jlbl_name);
			jframeo.add(jlbl_id);
			jframeo.add(jlbl_dob);
			jframeo.add(jlbl_doj);
			jframeo.add(jlbl_speacial);
			jframeo.add(jlbl_street);
			jframeo.add(jlbl_yox);
			jframeo.add(jlbl_mobno);
			//jframeo.add(jlbl_password);
			jframeo.add(txt_name);
			jframeo.add(jtxt_id);
			jframeo.add(jtxt_dob);
			jframeo.add(jtxt_doj);
			jframeo.add(jtxt_speacial);
			jframeo.add(jtxt_street);
			jframeo.add(jtxt_yox);
			jframeo.add(jtxt_mobno);
	//		jframeo.add(jtxt_email);
			jframeo.add(jtxt_password);
			jframeo.add(jlbl_password);
			jframeo.add(jb_ok);
			jframeo.setResizable(false);
			 jframeo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Image img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
			jlbl_user.setIcon(new ImageIcon(img));
			jframeo.add(jlbl_user);
			 t=new TimerTask(){
				public void run() {
					
					if(s==1){
					Image img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
					jlbl_user.setIcon(new ImageIcon(img));
					}
					if(s==2){
						Image img=new ImageIcon(this.getClass().getResource("/doctor-computer-1920-950x534.jpg")).getImage();
						jlbl_user.setIcon(new ImageIcon(img));
					}
					if(s==3){
						Image img=new ImageIcon(this.getClass().getResource("/01 APF - entry_4.jpg")).getImage();
						jlbl_user.setIcon(new ImageIcon(img));
					}
					if(s==4) {
						s=0;
					}
					s++;
				}
			}; 
	
			jframeo.setVisible(true);
			jframeo.addMouseListener(new MouseAdapter()  { 
		          //@SuppressWarnings("static-access")
				public void mouseEntered(MouseEvent me) { 
		        	  Image img=new ImageIcon(this.getClass().getResource("/doctor-computer-1920-950x534.jpg")).getImage();
		  			jlbl_user.setIcon(new ImageIcon(img));
		  			jframeo.add(jlbl_user);
		  			if(tuo==true) {
		  		t1.scheduleAtFixedRate(t, 1000, 3000);
		  			}
		  			tuo=false;
		  		jtxt_doj.setText("1");
		  			
		  			//tim.schuleAtFixedRate(tesk, 1000, 1000);
		              //jb_ok.setBackground(Color.WHITE);
		              //JOptionPane.showMessageDialog(null,"Login here");
		            } 
		          }); 
			jframeo.addMouseListener(new MouseAdapter() {
				
				
		          public void mouseExited(MouseEvent me) {
		        	  Image img=null;
		        
		        	  //t1.cancel();
		        	 // /*Image*/ img=new ImageIcon(this.getClass().getResource("/doctor-computer-1920-950x534.jpg")).getImage();
		  			//jlbl_user.setIcon(new ImageIcon(img));
		  			//System.out.println(""+ob.sec);
		        	 
		        	 
		        	  img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
				  			jlbl_user.setIcon(new ImageIcon(img));
		        	 
		  			jframeo.add(jlbl_user);
		              //jb_ok.setBackground(Color.WHITE);
		              //JOptionPane.showMessageDialog(null,"Login here");
		             
		          }
		          
		          });
			jb_ok.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					jb_okActionPerformed(evt);
				}
			});
	}
	public void docr() {
	DocBeans sbo=new DocBeans();
	sbo.setName(txt_name.getText());
	sbo.setId(jtxt_id.getText());
	sbo.setDob(jtxt_dob.getText());
	sbo.setDoj(jtxt_doj.getText());
	sbo.setSpeacial(jtxt_speacial.getText());
	sbo.setMobno(jtxt_mobno.getText());
	sbo.setYox(jtxt_yox.getText());
	sbo.setStreet(jtxt_street.getText());
	sbo.setPassword(jtxt_password.getText());
	DBConnection ob=new DBConnection();
	ob.getConnection();
	boolean b = ob.dRegister(sbo);
	if(b) {
		System.out.println("1 Record Updated Successfully");
	}
	else {
		JOptionPane.showMessageDialog(null,"Some error Ocurred , your name is registerd or amything else happen,please contract with administrator");
	}
	ob.closeALL();

	}
	private void jb_okActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
//	DoReg er=new DoReg();
		if(txt_name.getText().equals("")||jtxt_dob.getText().equals("")||jtxt_doj.getText().equals("")||jtxt_id.getText().equals("")||jtxt_mobno.getText().equals("")||jtxt_password.getText().equals("")||jtxt_speacial.getText().equals("")||jtxt_street.getText().equals("")||jtxt_yox.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"please fill up the all texts");
		}	
		else{
	docr();
		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	} 
	}
}
