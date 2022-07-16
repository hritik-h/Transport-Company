package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService {
	public Boolean login(String uname,String password) {
		boolean returnValue = true;
		try{
			Connection con = VehicleConnection.getConnection();
			ResultSet rs;
			PreparedStatement ps = con.prepareStatement("select password from userdetails where uname=?");
			ps.setString(1, uname);
			rs = ps.executeQuery();
			if (rs.next() && rs.getString(1).equals(password)) returnValue =  true;
			else returnValue= false;
			System.out.println(returnValue);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return returnValue;
	}
	public int getId(String uname) {
		int userId = 0;
		try {
		Connection con = VehicleConnection.getConnection();
		ResultSet rs;
		PreparedStatement ps = con.prepareStatement("select id from userdetails where uname=?");
		ps.setString(1, uname);
		rs = ps.executeQuery();
		if (rs.next()) userId =  rs.getInt(1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return userId;
	}
}
