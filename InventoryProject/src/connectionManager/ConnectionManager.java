package connectionManager;

import java.sql.*;

public class ConnectionManager {

	Connection con=null;
	public Connection establishConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return con=DriverManager.getConnection("jdbc:mysql://localhost:3306/InventoryProject","root","Jai@1602valli");
	
	}
	public void closeConnection() throws SQLException
	{
		con.close();
	}
		// TODO Auto-generated method stub


}
