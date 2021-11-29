package Academy.E2EProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/apeksha","root","Apeksha1%");
		//Connection URL syntax: "jdbc:mysql://"+host+":"+port+"/databasename";
		Statement s=conn.createStatement();
		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name='Sam'");
		rs.next();
		System.out.println(rs.getString("name"));//column name is passed, this can be used in scripts as well to get the data

	}

}
