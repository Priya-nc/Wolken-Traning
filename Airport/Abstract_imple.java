package com.wolken.market.map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Abstract_imple implements Abstract{
	
	
	@Override
	public boolean save(Encapsulated encap) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		boolean result=false;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
			statement=connection.prepareStatement("insert into airport_details values(?,?,?,?)");
			statement.setInt(1,encap.getId() );
			statement.setString(2,encap.getName());
			statement.setString(3, encap.getLocation());
			statement.setInt(4, encap.getNo_of_airlines());
			
			result=statement.execute();
			result=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		finally {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		

		
		return result;
	}

	@Override
	public boolean displayAll(Encapsulated encap) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		boolean result=false;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
			statement=connection.createStatement();
			ResultSet set=statement.executeQuery("select * from airport_details");
              while(set.next()) {
				
				int id=set.getInt(1);
				String airport_name=set.getString(2);
				String location=set.getString(3);
				int no_of_airline=set.getInt(4);
				System.out.println(id + "\t" +airport_name+"\t" +location+ "\t" +no_of_airline);
			
			}
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			
			finally {
				try {
					statement.close();
					connection.close();
				}
				catch(SQLException e) {
					System.err.println(e.getMessage());
				}
			}
			

			
			return result;
		
		
	}

	@Override
	public boolean update(Encapsulated encap) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		boolean result=false;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
			statement=connection.prepareStatement("update airport_details set airport_name=? where id=? ;");
			statement.setInt(2,encap.getId() );
			statement.setString(1,encap.getName());
			
			
			result=statement.execute();
			result=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		finally {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		

		
		return result;
		
	}

	@Override
	public boolean deleteByName(Encapsulated encap) {
		// TODO Auto-generated method stub
		
		Connection connection=null;
		PreparedStatement statement=null;
		boolean result=false;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
			statement=connection.prepareStatement("delete from airport_details where airport_name=?;");
			statement.setString(1,encap.getName() );
			
			
			
			result=statement.execute();
			result=true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
		finally {
			try {
				statement.close();
				connection.close();
			}
			catch(SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		

		return result;
	}

	
				
}
	



