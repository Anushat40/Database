package Sample_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("164.52.194.143", "ihubbusinessreaduser", "ihubbusinessreaduser");
		Class.forName("com.mysql.jdbc.Driver");
		Statement stmt = con.createStatement();

	}

}
