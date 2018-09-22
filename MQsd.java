package menu;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import logD.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Guty.DeReg;
import beansd.DLbean;

public class MQsd {
	private JButton jb_about=new JButton("About us");
	private JTextField txt_pdisplay=new JTextField("password");
	private Timer t1=new Timer();
	private Timer t2=new Timer();
	private TimerTask t;
	private TimerTask t4;
	private JFrame frm_login;
	private JButton jb_Login=new JButton();
	private JButton jb_New=new JButton();
	private JLabel jlbl_user=new JLabel();
	private JLabel jlbl_Id=new JLabel("Depend on us for life,Changing lives ");
	private JLabel jlbl_pas=new JLabel("Keeping You Well,Hope at Every Turn");
	 int s=0;
	 boolean tuo=true;
	 boolean toy=true;
	public   MQsd() {
		jb_about.setBounds(270,1,130,20);
		txt_pdisplay.setBounds(1,400,2,30);
		//txt_pdisplay.isBackgroundSet();
		jb_Login.setBounds(1, 1, 130, 20);
		jb_New.setBounds(130, 1, 150, 20);
		jlbl_Id.setBounds(35, 75, 500, 30);
		jlbl_pas.setBounds(200, 125, 500, 30);
		jlbl_Id.setBackground(Color.RED);
		jlbl_pas.setBackground(Color.pink);
		jlbl_Id.setForeground(Color.red);
		jlbl_pas.setForeground(Color.blue);
		jb_New. addMouseListener(new MouseAdapter() { 
	          public void mouseEntered(MouseEvent me) { 
	              jb_New.setBackground(Color.WHITE);
	              //JOptionPane.showMessageDialog(null,"Login here");
	            } 
	          }); 
		jb_New. addMouseListener(new MouseAdapter() { 
	          public void mouseExited(MouseEvent me) { 
	              jb_New.setBackground(Color.yellow);
	            } 
	          }); 
		jb_about. addMouseListener(new MouseAdapter() { 
	          public void mouseEntered(MouseEvent me) { 
	              jb_about.setBackground(Color.white);
	            } 
	          }); 
		jb_about. addMouseListener(new MouseAdapter() { 
	          public void mouseExited(MouseEvent me) { 
	              jb_about.setBackground(Color.yellow);
	            } 
	          }); 

		jb_Login. addMouseListener(new MouseAdapter() { 
	          public void mouseExited(MouseEvent me) { 
	              jb_Login.setBackground(Color.yellow);
	            } 
	          }); 
		jb_Login. addMouseListener(new MouseAdapter() { 
	          public void mouseEntered(MouseEvent me) { 
	              jb_Login.setBackground(Color.WHITE);
	            } 
	          }); 
		
		
		jb_New.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_NewActionPerformed(evt);
			}
		});
		jb_Login.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_LoginActionPerformed(evt);
			}
		});
		jb_about.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jb_aboutActionPerformed(evt);
			}
		});
	
		jb_New.setText("Doc Login");
		jb_New.setBackground(Color.yellow);
		//txt_ldisplay.setBackground(Color.WHITE);
		txt_pdisplay.setBackground(Color.red);
		jlbl_Id.setFont(new Font("Depend on us for life,Changing lives,", Font.ITALIC, 20));
		jlbl_pas.setFont(new Font("Keeping You Well,Hope at Every Turn", Font.ITALIC,20));
		jb_Login.setText("Patient login");
		jb_Login.setBackground(Color.yellow);
		jb_about.setBackground(Color.yellow);
		txt_pdisplay.setVisible(false);
	//	jb_New.setBounds(x, y, width, height);
		frm_login=new JFrame("Welcome to ITU clinic");
		Image img=new ImageIcon(this.getClass().getResource("/4529805782.jpg")).getImage();
		jlbl_user.setIcon(new ImageIcon(img));
		frm_login.setSize(700, 500);
		//frm_login.add(jlbl_user);
		frm_login.add(jb_about);
		frm_login.setResizable(false);
		frm_login.add(jb_Login);
		frm_login.add(jb_New);
		frm_login.add(txt_pdisplay);
		frm_login.add(jlbl_Id);
		frm_login.add(jlbl_pas);
		frm_login.add(jlbl_user);
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
						Image img=new ImageIcon(this.getClass().getResource("/1.jpg")).getImage();
						jlbl_user.setIcon(new ImageIcon(img));
					}
					if(s==5){
						s=0;
					}
					
					s++;
				}
			}; 
	
			t4=new TimerTask(){
				public void run() {
					
					if(s==1){
		//			Image img=new ImageIcon(this.getClass().getResource("/0057_020.jpg")).getImage();
			//		jlbl_user.setIcon(new ImageIcon(img));
						
						//txt_pdisplay.setEditable(false);
						txt_pdisplay.setBounds(1, 400, 20, 30);
						frm_login.add(txt_pdisplay);
						//txt_pdisplay.setVisible(true);
					}
					if(s==2){
						//Image img=new ImageIcon(this.getClass().getResource("/doctor-computer-1920-950x534.jpg")).getImage();
						//jlbl_user.setIcon(new ImageIcon(img));
						//frm_login.setLayout(new FlowLayout());
						//txt_pdisplay.setBounds(1, 400, 600, 30);
						//frm_login.add(txt_pdisplay);
					}
					if(s==3){
						//Image img=new ImageIcon(this.getClass().getResource("/01 APF - entry_4.jpg")).getImage();
						//jlbl_user.setIcon(new ImageIcon(img));
						frm_login.setLayout(new FlowLayout());
						txt_pdisplay.setBounds(1, 400, 900, 30);
						frm_login.add(txt_pdisplay);
					}
					if(s==4) {
					DeReg ob=new DeReg();
						//Image img=new ImageIcon(this.getClass().getResource("/1.jpg")).getImage();
						//jlbl_user.setIcon(new ImageIcon(img));
					//	txt_pdisplay.setBounds(1, 400, 1000, 30);
						//frm_login.add(txt_pdisplay);
					}
					if(s==5){
						
						//txt_pdisplay.setVisible(false);
					//	t2.cancel();
					//DeReg ob=new DeReg();
					}
					//txt_pdisplay.setVisible(false);
					
					
					t2.cancel();
					s++;
				}
			}; 
	

		frm_login.setVisible(true);
		frm_login.addMouseListener(new MouseAdapter()  { 
	          //@SuppressWarnings("static-access")
			public void mouseEntered(MouseEvent me) { 
	        	  Image img=new ImageIcon(this.getClass().getResource("/doctor-computer-1920-950x534.jpg")).getImage();
	  			jlbl_user.setIcon(new ImageIcon(img));
	  			frm_login.add(jlbl_user);
	  			if(tuo==true) {
	  		t1.scheduleAtFixedRate(t, 1000, 2000);
	  			}
	  			tuo=false;
	  		//jtxt_doj.setText("1");
	  			
	  			//tim.schuleAtFixedRate(tesk, 1000, 1000);
	              //jb_ok.setBackground(Color.WHITE);
	              //JOptionPane.showMessageDialog(null,"Login here");
	            } 
	          });	

	}
	private void jb_NewActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
//		Guty ob1=new Guty();
		txt_pdisplay.setVisible(true);
		if(toy==true){
	//t2.scheduleAtFixedRate(t4, 1000, 3000);
	//t2.cancel();
	//DeReg er=new DeReg();
			JOptionPane.showMessageDialog(null,"Please enter your password and username");
			frm_login.setVisible(false);
			LogDeg on=new LogDeg();
	toy=false;
	
	//txt_pdisplay.setCaretColor(Color.red);
	//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	} 
	}
	private void jb_LoginActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
//	DoReg er=new DoReg();
	DLbean sbo=new DLbean();
	//sbo.setUsername(txt_ldisplay.getText());
	sbo.setPassword(txt_pdisplay.getText());
	JOptionPane.showMessageDialog(null,"Please enter your password and username");
	EgTy ure=new EgTy();
}
	private void jb_aboutActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
//		Guty ob1=new Guty();
	
		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	}
}
