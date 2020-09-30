package dao;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import oracle.jdbc.OracleDriver;
import beansd.*;

public class DBConnection {
	private static Connection con = null;
	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user="HETC";
	private static final String password="1234";
	private static Connection co=null;
	private PreparedStatement ps=null;
	private PreparedStatement o=null;
	private ResultSet rs = null;
	private ResultSet r=null;
	//private String p;
	//private String u;
	public Connection getConnection() {
		Driver driver = new OracleDriver();
		Driver d=new OracleDriver();
		try {
			DriverManager.registerDriver(d);
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(url, user, password);
			co=DriverManager.getConnection(url,user,password);
		} catch(SQLException sqe) {
			sqe.printStackTrace();
			System.out.println("DB Connection Object: "+con);
		}
		return con;
	}
	public void closeConnection(){
		con.close();
	}
	public boolean registerpatient(PatientBean sbo) {
		String sql = "insert into PTABLEE values(?,?,?,?,?,?,?,?,?)";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, sbo.getMob());
			ps.setString(2,sbo.getFname() );
			ps.setString(3, sbo.getLname());
			ps.setString(4, sbo.getDob());
			ps.setString(5, sbo.getGen());
			ps.setString(6, sbo.getStree());
			ps.setString(7, sbo.getLoc());
			ps.setString(8, sbo.getEmail());
			ps.setString(9, sbo.getPassword());
	//		ps.setString(1, sbo.getRoll());
		//	ps.setString(2, sbo.getName());
			//ps.setDouble(3, sbo.getGrade());
			int ret = ps.executeUpdate();
			if(ret > 0) {
				return true;
			}
		} catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		return false;
	}
	public boolean dRegister(DocBeans sbo) {
		String sql = "insert into DTABLE values(?,?,?,?,?,?,?,?,?)";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, sbo.getId());
			ps.setString(2,sbo.getName() );
			ps.setString(3, sbo.getDob());
			ps.setString(4, sbo.getDoj());
			ps.setString(5, sbo.getSpeacial());
			ps.setString(6, sbo.getStreet());
			ps.setString(7, sbo.getYox());
			ps.setString(8, sbo.getMobno());
			ps.setString(9, sbo.getPassword());
			int ret = ps.executeUpdate();
			if(ret > 0) {
				return true;
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		
	return false;
	}
	public void closeALL() {
		try {
			if(con != null) 
				con.close();
			if(ps != null) 
				ps.close();
		} catch(SQLException sqe) {
			sqe.printStackTrace();
		}
	

}
	public boolean ploi(PLbens sbo) {
		
		
		String sql = "select * from PTABLEE where FNAME =? and PASSWORD=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, sbo.getU());
			ps.setString(2, sbo.getP());
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		return false;
	}
	public boolean dloi(DLbean sbo) {
		String sql="select * from DTABLE where NAME=? and PASSWORD=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, sbo.getUsername());
			ps.setString(2, sbo.getPassword());
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();
		}
		return false;
	}
	public boolean calo(Adlogi sbo) {
		String sql = "insert into DATABLE values(?,?,?,?)";
		String s="select * from DATABLE where NAME=?";
		String sw="Update DATABLE set D1='"+sbo.getD1stavdate()+"',  D2='"+sbo.getD2ndavdate()+"' , D3='"+sbo.getD3rdavdate()+"'"; 
		try {
			ps=con.prepareStatement(s);
			ps.setString(1, sbo.getName());
			rs=ps.executeQuery();
			if(rs.next())
			{
				try{
					o=co.prepareStatement(sw);
					//o.setString(1, sbo.getD1stavdate());
					//o.setString(2, sbo.getD2ndavdate());
					//o.setString(3, sbo.getD3rdavdate());
					//o.setString(1, sbo.getName());
					o.execute();
				//JOptionPane.showMessageDialog(null, message, title, messageType);
				JOptionPane.showMessageDialog(null, "update success fully");
				return true;
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			else{
		try {
			o= co.prepareStatement(sql);
			o.setString(1, sbo.getName());
			o.setString(2,sbo.getD1stavdate() );
			o.setString(3, sbo.getD2ndavdate());
			o.setString(4, sbo.getD3rdavdate());
			System.out.println("rt");
			int ret = o.executeUpdate();
			if(ret > 0) {
				return true;
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();
		}
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();
		}
	return false;
	}
	public void getResultSet(DLbean dbo) {
		String sql="select * from DTABLE where NAME=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, dbo.getUsername());
			rs=ps.executeQuery();
	}catch(SQLException sqe) {
		sqe.printStackTrace();
	}
		
	}
	public DLbean getAllStudentDetails() {
		DLbean sbo=new DLbean();
			try{
				if(rs.next()) {
					sbo.setUsername(rs.getString(2));
					sbo.setPassword(rs.getString(9));
					
					return sbo;
					
				}
			}catch(SQLException sqe) {
				sqe.printStackTrace();
			}
			return null;
	}
	public DocBeans dcheck(DLbean sbo){
		String u=sbo.getUsername();
		DocBeans ob=new DocBeans(); 
		ob.setName(u);
		String sql="select * from DTABLE where NAME=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, sbo.getUsername());
			rs=ps.executeQuery();
			try{
				if(rs.next()) {
					ob.setSpeacial(rs.getString(5));
					ob.setMobno(rs.getString(8));
					
					
					
				}
			}catch(SQLException sqe) {
				sqe.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ob;
	}
	public boolean pwdrt(Adlogi sbo){
		String sql = "insert into PTOI values(?,?,?,?,?,?,?)";
		try {
			ps= con.prepareStatement(sql);
			ps.setString(1, sbo.getName());
			ps.setString(2,sbo.getPassword() );
			ps.setString(3, sbo.getD1stavdate());
			ps.setString(4, sbo.getD2ndavdate());
			ps.setString(5, sbo.getD3rdavdate());
			ps.setString(6, sbo.getProblem());
			ps.setString(7, sbo.getDocname());
			int ret = ps.executeUpdate();
			if(ret > 0) {
				return true;
			}
	}catch(SQLException e){
		e.printStackTrace();
	}
		return false;
	}
	public Adlogi rtlog(Adlogi sbo){
		String sql="select * from DATABLE where NAME=?";
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, sbo.getDocname());
			rs = ps.executeQuery();
			con.prepareStatement(sql);
			if(rs.next()) {
				
				sbo.setD1stavdate(rs.getString(2));
				sbo.setD2ndavdate(rs.getString(3));
				sbo.setD3rdavdate(rs.getString(4));
			}
		}catch(SQLException sqe) {
			sqe.printStackTrace();

		}
		return sbo;
	} 
}
