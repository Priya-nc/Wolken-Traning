package com.wolken.market.map;



import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
			statement=connection.createStatement();
			statement.execute("insert into airport_details values(7,'kia','ban',10)");
			ResultSet set=statement.executeQuery("select * from airport_details");
			
			while(set.next()) {
				
				int id=set.getInt(1);
				String airport_name=set.getString(2);
				String location=set.getString(3);
				int no_of_airline=set.getInt(4);
				System.out.println(id + "\t" +airport_name+"\t" +location+ "\t" +no_of_airline);
			
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			
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
		

	}

}
