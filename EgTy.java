
package logD;
import dao.*;
import javax.swing.*;

import Alogin.Ptrio;
import Guty.DeReg;
import Guty.Guty;
import beansd.PLbens;

import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.color.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.nio.channels.ShutdownChannelGroupException;
import java.awt.Image;
public class EgTy {
	private JTextField txt_ldisplay=new JTextField();
	private JTextField txt_pdisplay=new JTextField();
	
	private JFrame frm_login;
	private JButton jb_Login=new JButton();
	private JButton jb_New=new JButton();
	private JLabel jlbl_user=new JLabel();
	private JLabel jlbl_Id=new JLabel("Enter your firstname ");
	private JLabel jlbl_pas=new JLabel("Enter your password");
	public EgTy() {
		txt_ldisplay.setBounds(175,75,250,30);
		txt_pdisplay.setBounds(175,125,250,30);
		jb_Login.setBounds(175, 175, 100, 30);
		jb_New.setBounds(175, 225, 150, 30);
		jlbl_Id.setBounds(35, 75, 200, 30);
		jlbl_pas.setBounds(35, 125, 200, 30);
		jlbl_Id.setBackground(Color.RED);
		jlbl_pas.setBackground(Color.pink);
		jlbl_Id.setForeground(Color.pink);
		jlbl_pas.setForeground(Color.cyan);
		jb_New. addMouseListener(new MouseAdapter() { 
	          public void mouseEntered(MouseEvent me) { 
	              jb_New.setBackground(Color.WHITE);
	              //JOptionPane.showMessageDialog(null,"Login here");
	            } 
	          }); 
		jb_New. addMouseListener(new MouseAdapter() { 
	          public void mouseExited(MouseEvent me) { 
	              jb_New.setBackground(Color.green);
	            } 
	          }); 
		jb_Login. addMouseListener(new MouseAdapter() { 
	          public void mouseExited(MouseEvent me) { 
	              jb_Login.setBackground(Color.GREEN);
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
		jb_New.setText("New REGISTER");
		jb_New.setBackground(Color.green);
		txt_ldisplay.setBackground(Color.WHITE);
		txt_pdisplay.setBackground(Color.white);
		jlbl_Id.setFont(new Font("Enter your firstname", Font.BOLD, 13));
		jlbl_pas.setFont(new Font("Enter your password", Font.BOLD, 13));
		jb_Login.setText("LOGIN");
		jb_Login.setBackground(Color.GREEN);
	//	jb_New.setBounds(x, y, width, height);
		frm_login=new JFrame("PLEASE LOGIN HERE");
		frm_login.setResizable(false);
		Image img=new ImageIcon(this.getClass().getResource("/01 APF - entry_4.jpg")).getImage();
		jlbl_user.setIcon(new ImageIcon(img));
		frm_login.setSize(500, 500);
		//frm_login.add(jlbl_user);
		frm_login.add(txt_ldisplay);
		frm_login.add(jb_Login);
		frm_login.add(jb_New);
		frm_login.add(txt_pdisplay);
		frm_login.add(jlbl_Id);
		frm_login.add(jlbl_pas);
		frm_login.add(jlbl_user);
		frm_login.setVisible(true);
		

	}
	private void jb_NewActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
		Guty ob1=new Guty();
		//DeReg er=new DeReg();
	
		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	} 
	private void jb_LoginActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_ldisplay.setText("hio");
		
//	DeReg er=new DeReg();
		if(txt_ldisplay.getText().equals("")||txt_pdisplay.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "please fill up the textboxes");
		}
		else{
	DBConnection ob=new DBConnection();
	ob.getConnection();
	PLbens sbo=new PLbens();
	sbo.setU(txt_ldisplay.getText());
	sbo.setP(txt_pdisplay.getText());

	boolean b=ob.ploi(sbo);
	if(b) {
		JOptionPane.showMessageDialog(null,"welcome");
		Ptrio re=new Ptrio(sbo);
	}
	else {
		JOptionPane.showMessageDialog(null,"password or userword");
	}
		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	} 
	}
	}

