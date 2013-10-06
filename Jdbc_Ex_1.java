import java.sql.*;

class Jdbc_Ex_1 
{
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		// Registering the driver

		Class.forName("com.mysql.jdbc.Driver");

		//Establishing the Connection

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/raj","root","root");

		//Preparing SQL Statment 

		Statement st = c.createStatement();

		//Executing the sql Query and Processing the result
		
		int i  = st.executeUpdate("insert into empdata values(1,'ranjith')");

		System.out.println(i +" row inserted");
		
		//Closing the resoures

		st.close();
		c.close();
	}
}
