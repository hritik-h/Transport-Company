package services;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.Booking;

public class BookingService implements BookingCrud {
	public Boolean book(Booking bookingDao) {
		try{
		Connection con=VehicleConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into Booking(idBooking,user_id, vehicle_id,source,destination) values(?,?,?,?,?)");
		ps.setInt(1, 0);
		ps.setInt(2, bookingDao.getUser_id());
		ps.setString(3, bookingDao.getVehicle_id());
		ps.setString(4,bookingDao.getSource());
		ps.setString(5, bookingDao.getDestination());
		
		ps.execute();
		con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	public Boolean cancel(int idBooking) {
		try{
			Connection con=VehicleConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from Booking where idBooking =?");
			ps.setInt(1, idBooking);
			ps.execute();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}
}
