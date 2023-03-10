package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImplUser implements IDAO<User>{

	private ArrayList<User> users;
	private Connection cnx;
	
	
	public ImplUser() {
		try {
			try {
				cnx=ConnectionDB.getInstance();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public void addElement(User u) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=cnx.prepareStatement("insert into Users values(?,?,?,?,?)");
			ps.setInt(1,u.getId());
			ps.setString(2,u.getUsername());
			ps.setString(3, u.getEmail());
			ps.setString(4,u.getPassword());
			
			ps.executeUpdate();
			
			cnx.commit();
			System.out.println("User added");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				cnx.rollback();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			try {
				cnx.rollback();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void uppdateElement(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteElement(int t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getElement(int id) {
		// TODO Auto-generated method stub
		
		try {
			Statement s=cnx.createStatement();
			ResultSet rs=s.executeQuery("select * from Users where idU = "+id);
			
			if(rs.next()) {
				return new User(rs.getString(2),rs.getNString(3),rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;	}

	@Override
	public List<User> getElements() {
		// TODO Auto-generated method stub
		return null;
	}

}
