package controller;

import java.util.List;

import model.Vehicle;
import services.VehicleService;

public class VehicleController {
	VehicleService vehicleservice = new VehicleService();
	
	public void vehicleController() {
		vehicleservice=new VehicleService();
	}


	public int insertRecord(Vehicle vehicle) {
		int result=vehicleservice.insertRecord(vehicle);
		return result;
	}


	public int updateRecord(Vehicle student) {
		
		int result=vehicleservice.updateRecord(student);
		return result;
	}

	
	public int deleteRecord(int rollno) {
		
		int result=vehicleservice.deleteRecord(rollno);
		return result;
	}

	
	public List<Vehicle> getAllRecords() {
		
		List <Vehicle> list=vehicleservice.getAllRecords();
		return list;
	}

	
	public Vehicle getVehicleByVehicleNumber(int vehicleNumber) {
		
		Vehicle vehicle=vehicleservice.getVehicleByVehicleNumber(vehicleNumber);
		return vehicle;
	}

}
