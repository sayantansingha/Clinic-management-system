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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import beansd.Adlogi;
import beansd.DocBeans;
import dao.DBConnection;

public class Dalogpo {
	private String name;
	private JTextField txt_name=new JTextField();
	private JTextField txt_speacial=new JTextField();
	private TimerTask t;
	private boolean tuo=true;
	int s=0;
	private Timer t1=new Timer();
	private JFrame dfrm_login;
	private JComboBox<String> k=new JComboBox<String>(); 
	private JButton jb_Login=new JButton();
	private JButton jb_New=new JButton("UPDATE");
	private JLabel jlbl_user=new JLabel();
	private JLabel jlbl_name=new JLabel("NAME ");
	private JLabel jlbl_speacial=new JLabel("SPEACIALIST IN");
	private JLabel jlbl_avdate1=new JLabel("1st avalable date ");
	private JLabel jlbl_avdate2=new JLabel("2nd avalable date");
	private JLabel jlbl_avdate3=new JLabel("3rd avalable date ");
	private JLabel jlbl_78=new JLabel("If you want to change your Avalable date please fill red texts");
	private JTextField jtxt_avdate1=new JTextField();
	private JTextField jtxt_avdate2=new JTextField();
	private JTextField jtxt_avdate3=new JTextField();
	private JTextField jtxt_mobno=new JTextField();
	private JLabel jlbl_mobno=new JLabel("Mobile no");
	public Dalogpo(DocBeans sbo) {
	txt_name.setBounds(175,75,250,30);
	txt_speacial.setBounds(175,125,250,30);
	//jb_Login.setBounds(175, 175, 100, 30);
	k.setBounds(175, 75, 250, 30);
	jb_New.setBounds(175, 400, 150, 30);
	jlbl_user.setBounds(35, 75, 200, 30);
	jlbl_name.setBounds(35, 75, 200, 30);
	jlbl_speacial.setBounds(35, 125, 200, 30);
	jlbl_mobno.setBounds(35, 175, 200, 30);
	jtxt_mobno.setBounds(175, 175, 250, 30);
	jlbl_avdate1.setBounds(35, 250, 200, 30);
	jlbl_avdate2.setBounds(35, 300, 200, 30);
	jlbl_avdate3.setBounds(35, 350, 200, 30);
	jtxt_avdate1.setBounds(175, 250, 250, 30);
	jtxt_avdate2.setBounds(175, 300, 250, 30);
	jtxt_avdate3.setBounds(175, 350, 250, 30);
	jlbl_user.setBackground(Color.RED);
	jlbl_speacial.setBackground(Color.pink);
	jlbl_name.setForeground(Color.cyan);
	jlbl_speacial.setForeground(Color.cyan);
	jlbl_78.setBounds(95, 200, 400, 30);
	jlbl_avdate1.setForeground(Color.red);
	jlbl_avdate2.setForeground(Color.red);
	jlbl_avdate3.setForeground(Color.red);
	jlbl_78.setForeground(Color.red);
	txt_name.setText(sbo.getName());
	txt_speacial.setText(sbo.getSpeacial());
	jtxt_mobno.setText(sbo.getMobno());
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
	 
	
	jb_New.setText("UPDATE");
	jb_New.setBackground(Color.green);
	txt_name.setBackground(Color.WHITE);
	txt_speacial.setBackground(Color.white);
	jlbl_mobno.setForeground(Color.cyan);
	jlbl_name.setFont(new Font("Enter your Id", Font.BOLD, 16));
	jlbl_speacial.setFont(new Font("Enter your password", Font.BOLD, 13));
	jb_Login.setText("LOGIN");
	jb_Login.setBackground(Color.GREEN);
//	jb_New.setBounds(x, y, width, height);
	dfrm_login=new JFrame("welcome doc to your page");
	Image img=new ImageIcon(this.getClass().getResource("/1shutterstock_32866618.jpg")).getImage();
	jlbl_user.setIcon(new ImageIcon(img));
	dfrm_login.setSize(800, 600);
	//frm_login.add(jlbl_user);
	dfrm_login.add(txt_name);
	//dfrm_login.add(k);
	//dfrm_login.add(jb_Login);
	dfrm_login.add(jb_New);
	dfrm_login.add(txt_speacial);
	dfrm_login.add(jlbl_name);
	dfrm_login.add(jlbl_speacial);
	dfrm_login.add(jlbl_avdate1);
	dfrm_login.add(jlbl_avdate2);
	dfrm_login.add(jlbl_avdate3);
	dfrm_login.add(jtxt_avdate1);
	dfrm_login.add(jtxt_avdate2);
	dfrm_login.add(jtxt_avdate3);
	dfrm_login.add(jlbl_mobno);
	dfrm_login.add(jtxt_mobno);
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
	//txt_name.setText("hio");
	Adlogi sbo=new Adlogi();
	sbo.setName(txt_name.getText());
	sbo.setD1stavdate(jtxt_avdate1.getText());
	sbo.setD2ndavdate(jtxt_avdate2.getText());
	sbo.setD3rdavdate(jtxt_avdate3.getText());
	DBConnection rt=new DBConnection();
	rt.getConnection();
	boolean b=rt.calo(sbo);
	rt.closeALL();
	System.out.println(""+b);
//	Guty ob1=new Guty();

	//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
} 
private void jb_LoginActionPerformed(java.awt.event.ActionEvent evt) { 
	txt_name.setText("hio");
//	DoReg er=new DoReg();


	//JOptionPane.showMessageDialog(null, "This language just gets better and better!");
} 
//public void uto() {
	
//}

}
