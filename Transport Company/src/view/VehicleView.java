package view;

import java.util.List;
import java.util.Scanner;

import controller.VehicleController;
import model.Vehicle;

public class VehicleView {
		public void view() {
		VehicleController vehiclectrl = new VehicleController();
		int result;
		Vehicle vehicle = null;
		String vehicle_id;
		String vehicle_type;
		String vehicle_desription;
		int vehicle_customer_id;
		int vehicle_number;
		int choice;
		
		while(true){
		System.out.println("1. Add Vehicle");
		System.out.println("2. Update Vehicle");
		System.out.println("3. Delete Vehicle");
		System.out.println("4. View Vehicle");
		System.out.println("5. View a Vehicle");
		System.out.println("0. Exit ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		 choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			
			System.out.println("Enter Vehicle Id, Vehicle Type, Vehicle Description, Vehicle Customer Id and Vehicle Number:- ");
			sc.nextLine();
			vehicle_id = sc.nextLine();
			//sc.nextLine();
			System.out.println("vehicle_id: "+vehicle_id);
			vehicle_type = sc.nextLine();
			//sc.nextLine();
			System.out.println("vehicle_type: "+vehicle_type);
			vehicle_desription = sc.nextLine();
			System.out.println("vehicle_desription: "+vehicle_desription);
			vehicle_customer_id = sc.nextInt();
			sc.nextLine();
			vehicle_number = sc.nextInt();
			
			System.out.println("vehicle_id: "+vehicle_id+" vehicle_type: "+vehicle_type+" vehicle_desription: "+vehicle_desription+" vehicle_customer_id: "+vehicle_customer_id+" vehicle_number: "+vehicle_number);
			vehicle = new Vehicle(vehicle_id, vehicle_type, vehicle_desription,vehicle_customer_id,vehicle_number);
			//vehicle = new Vehicle("HJKHIU", "Car", "Sedan small",12297,19257);
			System.out.println(vehicle.toString());
			result = vehiclectrl.insertRecord(vehicle);
			if (result > 0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record not inserted");
			break;
		case 2:
			System.out.println("Enter Vehicle Id, Vehicle Type, Vehicle Description, Vehicle Customer Id and Vehicle Number:- ");
			sc.nextLine();
			vehicle_id = sc.nextLine();
			//sc.nextLine();
			vehicle_type = sc.nextLine();
			//sc.nextLine();
			vehicle_desription = sc.nextLine();
			vehicle_customer_id = sc.nextInt();
			sc.nextLine();
			vehicle_number = sc.nextInt();
			
			System.out.println("vehicle_id: "+vehicle_id+" vehicle_type: "+vehicle_type+" vehicle_desription: "+vehicle_desription+" vehicle_customer_id: "+vehicle_customer_id+" vehicle_number: "+vehicle_number);
			
			vehicle = new Vehicle(vehicle_id, vehicle_type, vehicle_desription,vehicle_customer_id,vehicle_number);
			//vehicle = new Vehicle("HJKHIU", "Car", "Sedan small",12297,19257);
			//result = vehiclectrl.insertRecord(vehicle);
			result = vehiclectrl.updateRecord(vehicle);
			if (result > 0)
				System.out.println("Record updated");
			else
				System.out.println("Record not found");
			break;

		case 3:
			System.out.println("Enter Vehicle Number");
			vehicle_number = sc.nextInt();
			result = vehiclectrl.deleteRecord(vehicle_number);
			if (result > 0)
				System.out.println("Record deleted");
			else
				System.out.println("Record not found");
			break;
		case 4:
			List<Vehicle> list=vehiclectrl.getAllRecords();
			for(Vehicle vehicles : list){
				System.out.println(vehicles.getVehicle_id()+"\t"+vehicles.getVehicle_desription()+" "+vehicles.getVehicle_customer_id());
			}
		break;
		
		case 5:
			System.out.println("Enter vehicle_number");
			vehicle_number=sc.nextInt();
			vehicle=vehiclectrl.getVehicleByVehicleNumber(vehicle_number);
			System.out.println("Vehicle Id="+vehicle.getVehicle_id());
			System.out.println("Vehicle Description="+vehicle.getVehicle_desription());
			System.out.println("Vehicle customer Id="+vehicle.getVehicle_customer_id());
			break;
		case 0: return;

		}
	}
}
}
