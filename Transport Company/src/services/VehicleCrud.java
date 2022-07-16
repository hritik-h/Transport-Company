package services;

import java.util.List;

import model.Vehicle;

public interface VehicleCrud {
	
	int insertRecord(Vehicle vehicle);
	int updateRecord(Vehicle vehicle);
	int deleteRecord(int rollno);
	List<Vehicle> getAllRecords();
	Vehicle getVehicleByVehicleNumber(int vehicleNumber);
}
