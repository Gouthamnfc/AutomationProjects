package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBUtil 
{
	
	static Connection con = null;
	static String dbUrl = "jdbc:sqlserver://hq210rs;databaseName=SRS1;";
	static String username = "nfcsolutions";
	static String password = "P@ssw0rd1!";
	
	public static void main(String[] args) throws Exception {
		// NYHireData("Temp", "NY");
		// NYHireDetailsUpdate(260302, "P", "Candidate submitted successfully");
		//GetloginDetails();
		//NewHireAuditDetails("Successfully","TEMP", "NY");
	}
	
	
	public static ArrayList<String> GetloginDetails() throws SQLException {
		ArrayList<String> ShiftWiseVendorlogins = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
			System.out.println("Connected to database Successfully");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("{call UspGet_VendorLoginDetails}");
			System.out.println("Connected to database Successfully");
			while (rs.next()) {
				ShiftWiseVendorlogins.add(
						rs.getString("Client_id").trim() + "," + rs.getString("emailid") + "," + rs.getString("password").trim());
			}
			System.out.println(ShiftWiseVendorlogins);
			con.close();
			System.out.println("Database Connection closed Successfully");
			
			
		} catch (Exception e) {
			System.out.println("Exception found at GetloginDetails():" + e.getMessage());
			
		} finally {
			con.close();
			System.out.println("Database Connection Closed Successfully");
			
		}

		return ShiftWiseVendorlogins;
	}
	

}
