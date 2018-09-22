package Alogin;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyTestIt implements ActionListener{
	JFrame f1;
	TextField t1,t2;
	JButton b1,b2;
	JLabel lbl_1,lbl_2;
	
	MyTestIt()
	{
		f1=new JFrame();
		t1=new TextField();
		t2=new TextField();
		b1=new JButton("ADD");
		b2=new JButton("Subtract");
		lbl_1=new JLabel("Enter the first no");
		lbl_2=new JLabel("Enter the second no");
		lbl_1.setBounds(50, 100, 100, 100);
		lbl_2.setBounds(50, 140, 100, 100);
		t1.setBounds(50, 50, 100,50);
		t2.setBounds(150,140,100,50);
		b1.setBounds(200,170,100,100);
		b2.setBounds(300,170,100,100);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.setSize(600, 600);
		f1.setVisible(true);
		f1.add(lbl_1);
		f1.add(lbl_2);
		f1.add(t1);
		f1.setLayout(null);
		f1.add(t2);
		f1.add(b1);
		f1.add(b2);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTestIt();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
		if(arg0.getSource()==b1)
		{
			System.out.println("Hiiiiii");
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a+b;
			t2.setText(String.valueOf(c));
			
		}
		if(arg0.getSource()==b2)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=a-b;
			t2.setText(String.valueOf(c));
		}
	}catch(Exception e)
		{
		System.out.println("Error happen");
		}
	}
}
