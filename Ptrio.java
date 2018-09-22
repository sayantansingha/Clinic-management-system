package Alogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import beansd.Adlogi;
import beansd.PLbens;
import dao.DBConnection;

public class Ptrio {
	private JTextField txt_name=new JTextField();
	private JTextField txt_problem=new JTextField();
	private TimerTask t;
	private boolean tuo=true;
	int s=0;
	private Timer t1=new Timer();
	private JFrame dfrm_login;
	private JButton jb_Login=new JButton();
	private JButton jb_New=new JButton("UPDATE");
	private JLabel jlbl_user=new JLabel();
	private JLabel jlbl_name=new JLabel("NAME ");
	private JLabel jlbl_problem=new JLabel("Problem");
	private JLabel jlbl_avdate1=new JLabel("1st avalable date ");
	private JLabel jlbl_avdate2=new JLabel("2nd avalable date");
	private JLabel jlbl_avdate3=new JLabel("3rd avalable date ");
	private JLabel jlbl_78=new JLabel("Check those avalable date,if you avalable those date pleaswe click on book else change doctor's name ");
	private JTextField jtxt_avdate1=new JTextField();
	private JTextField jtxt_avdate2=new JTextField();
	private JTextField jtxt_avdate3=new JTextField();
	private JTextField jtxt_docn=new JTextField();
	private JLabel jlbl_docn=new JLabel("Doctor's name");
	private String pr;
	public Ptrio(PLbens sbo) {
		txt_name.setBounds(175,75,250,30);
		txt_problem.setBounds(175,125,250,30);
		jb_Login.setBounds(300, 400, 150, 30);
		jb_New.setBounds(175, 400, 150, 30);
		jlbl_user.setBounds(35, 75, 200, 30);
		jlbl_name.setBounds(35, 75, 200, 30);
		jlbl_problem.setBounds(35, 125, 200, 30);
		jlbl_docn.setBounds(35, 175, 200, 30);
		jtxt_docn.setBounds(175, 175, 250, 30);
		jlbl_avdate1.setBounds(35, 250, 200, 30);
		jlbl_avdate2.setBounds(35, 300, 200, 30);
		jlbl_avdate3.setBounds(35, 350, 200, 30);
		jtxt_avdate1.setBounds(175, 250, 250, 30);
		jtxt_avdate2.setBounds(175, 300, 250, 30);
		jtxt_avdate3.setBounds(175, 350, 250, 30);
		jlbl_user.setBackground(Color.RED);
		jlbl_problem.setBackground(Color.pink);
		jlbl_name.setForeground(Color.cyan);
		jlbl_problem.setForeground(Color.cyan);
		jlbl_78.setBounds(95, 200, 600, 30);
		jlbl_avdate1.setForeground(Color.red);
		jlbl_avdate2.setForeground(Color.red);
		jlbl_avdate3.setForeground(Color.red);
		jlbl_78.setForeground(Color.red);
		txt_name.setText(sbo.getU());
		 pr=sbo.getP();
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
		 
		
		jb_New.setText("Book date");
		jb_New.setBackground(Color.green);
		txt_name.setBackground(Color.WHITE);
		txt_problem.setBackground(Color.white);
		jlbl_docn.setForeground(Color.cyan);
		jlbl_name.setFont(new Font("Enter your Id", Font.BOLD, 16));
		jlbl_problem.setFont(new Font("Enter your password", Font.BOLD, 13));
		jb_Login.setText("Search");
		jb_Login.setBackground(Color.GREEN);
//		jb_New.setBounds(x, y, width, height);
		dfrm_login=new JFrame("welcome patient to your page");
		Image img=new ImageIcon(this.getClass().getResource("/1shutterstock_32866618.jpg")).getImage();
		jlbl_user.setIcon(new ImageIcon(img));
		dfrm_login.setSize(800, 600);
		//frm_login.add(jlbl_user);
		dfrm_login.add(txt_name);
		dfrm_login.add(jb_Login);
		dfrm_login.add(jb_New);
		dfrm_login.add(txt_problem);
		dfrm_login.add(jlbl_name);
		dfrm_login.add(jlbl_problem);
		dfrm_login.add(jlbl_avdate1);
		dfrm_login.add(jlbl_avdate2);
		dfrm_login.add(jlbl_avdate3);
		dfrm_login.add(jtxt_avdate1);
		dfrm_login.add(jtxt_avdate2);
		dfrm_login.add(jtxt_avdate3);
		dfrm_login.add(jlbl_docn);
		dfrm_login.add(jtxt_docn);
		dfrm_login.add(jlbl_78);
		dfrm_login.add(jlbl_user);
		t=new TimerTask(){
			public void run() {
				
				if(s==1){
				Image img=new ImageIcon(this.getClass().getResource("/1.jpg")).getImage();
				jlbl_user.setIcon(new ImageIcon(img));
				}
				if(s==2){
					Image img=new ImageIcon(this.getClass().getResource("/1shutterstock_32866618.jpg")).getImage();
					jlbl_user.setIcon(new ImageIcon(img));
				}
				if(s==3){
					Image img=new ImageIcon(this.getClass().getResource("/2024610858.jpg")).getImage();
					jlbl_user.setIcon(new ImageIcon(img));
				}
				if(s==4) {
					s=0;
				}
				s++;
			}
		}; 
		
		dfrm_login.setVisible(true);
		
		dfrm_login.addMouseListener(new MouseAdapter()  { 
	        //@SuppressWarnings("static-access")
			public void mouseEntered(MouseEvent me) { 
	      	  Image img=new ImageIcon(this.getClass().getResource("/1shutterstock_32866618.jpg")).getImage();
				jlbl_user.setIcon(new ImageIcon(img));
				dfrm_login.add(jlbl_user);
				if(tuo==true) {
			t1.scheduleAtFixedRate(t, 1000, 3000);
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
		//txt_name.setText("hio");
		if(txt_name.getText().equals("")||txt_problem.getText().equals("")||jtxt_avdate1.getText().equals("")||jtxt_avdate2.getText().equals("")||jtxt_avdate3.getText().equals("")||jtxt_docn.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Fillup the texts correctly");
		}
		else{
		Adlogi sbo=new Adlogi();
		sbo.setName(txt_name.getText());
		sbo.setPassword(pr);
		sbo.setD1stavdate(jtxt_avdate1.getText());
		sbo.setD2ndavdate(jtxt_avdate2.getText());
		sbo.setD3rdavdate(jtxt_avdate3.getText());
		sbo.setProblem(txt_problem.getText());
		sbo.setDocname(jtxt_docn.getText());
		DBConnection oui=new DBConnection();
		oui.getConnection();
		boolean b=oui.pwdrt(sbo);
		oui.closeALL();
		if(b)
			JOptionPane.showMessageDialog(null, "book success fully");
		else
			JOptionPane.showMessageDialog(null, "Any error occur");
		
//		Guty ob1=new G uty();
		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
	}
	}
	private void jb_LoginActionPerformed(java.awt.event.ActionEvent evt) { 
		//txt_name.setText("hio");
		if(jtxt_docn.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Enter the doctor name");
		}
		else{
		Adlogi u=new Adlogi();
		Adlogi q=new Adlogi();
		u.setDocname(jtxt_docn.getText());
		DBConnection d=new DBConnection();
		d.getConnection();
		q=d.rtlog(u);
		d.closeALL();
		jtxt_avdate1.setText(q.getD1stavdate());
		jtxt_avdate2.setText(q.getD2ndavdate());
		jtxt_avdate3.setText(q.getD3rdavdate());
//		DoReg er=new DoReg();


		//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
		}
	}
}
