package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Vehicle;

public class VehicleService implements VehicleCrud{
	

	public int insertRecord(Vehicle vehicle) {
		int result=0;
		try{
			Connection con=VehicleConnection.getConnection();
			//java.sql.Date sdob=new java.sql.Date(vehicle.getDob().getTime());
			//To insert records 
			PreparedStatement ps=con.prepareStatement("insert into Vehicle(vehicle_id, vehicle_type,vehicle_desription, vehicle_customer_id, vehicle_number) values(?,?,?,?,?)");
			
			ps.setString(1,vehicle.getVehicle_id());
			ps.setString(2,vehicle.getVehicle_type());
			ps.setString(3,vehicle.getVehicle_desription());
			ps.setInt(4, vehicle.getVehicle_customer_id());
			ps.setInt(5,vehicle.getVehicle_number());
			result=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return result;
	}


	public int updateRecord(Vehicle vehicle) {
		int result=0;
		try{
			Connection con=VehicleConnection.getConnection();
			//java.sql.Date sdob=new java.sql.Date(student.getDob().getTime());
			
			//To insert records 
			PreparedStatement ps=con.prepareStatement("update Vehicle set vehicle_type=?,vehicle_desription=?,vehicle_customer_id=?,vehicle_number=? where vehicle_id=?");
			
			ps.setString(5,vehicle.getVehicle_id());
			ps.setString(1,vehicle.getVehicle_type());
			ps.setString(2,vehicle.getVehicle_desription());
			ps.setInt(3, vehicle.getVehicle_customer_id());
			ps.setInt(4,vehicle.getVehicle_number());
			result=ps.executeUpdate();
			con.close();
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}

	//@Override
	public int deleteRecord(int vehicle_number) {
		int result=0;
		try{
			Connection con=VehicleConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from Vehicle where vehicle_number=?");
			
			ps.setInt(1,vehicle_number);
			
			result=ps.executeUpdate();
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return result;
	}

	//@Override
	public List<Vehicle> getAllRecords() {
		
		ArrayList<Vehicle> list=new ArrayList<>();
		try{
		Connection con=VehicleConnection.getConnection();
		//To get all Records
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Vehicle");
		//Add all Records in ArrayList		
						
		while(rs.next()) {
			
			list.add(new Vehicle(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5)));
			//Student student=new Student(rs.getInt(1),rs.getString(2),rs.getDate(3));
			//list.add(student);
					
		}
		stmt.close();
		con.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	//@Override
	public Vehicle getVehicleByVehicleNumber(int vehicleNumber) {
		
		Vehicle vehicle=null;
		try{
			Connection con=VehicleConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("Select * from Vehicle where vehicle_number=?");
			ps.setInt(1, vehicleNumber);
			ResultSet rs=ps.executeQuery(); 
			if(rs.next())
				vehicle=new Vehicle(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
			
			con.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return vehicle;
	}



}
