package view;

import java.util.List;
import java.util.Scanner;

import controller.BookingController;
import controller.VehicleController;
import model.Vehicle;

public class BookingView {
	Scanner scn = new Scanner(System.in);
	VehicleController vechcleController = new VehicleController();
	BookingController bookingController = new BookingController();
	public void view(int userId) {
		while(true) {
		System.out.println("1. View Vehicles.\n2. Book Vehicle.\n3. Cancel Booking.\n4. Logout\n");
		
		int choice = scn.nextInt();
		
		switch(choice) {
		case 1:
			List<Vehicle> vehicles = vechcleController.getAllRecords();
			for(Vehicle each: vehicles) System.out.println(each.getVehicle_id()+" "+
			each.getVehicle_type()+" "+each.getVehicle_number());
			break;
		case 2:
			bookingController.book(userId);
			break;
		case 3:
			System.out.println("Enter Booking Id: ");
			int bookingId = scn.nextInt();
			bookingController.cancelBooking(bookingId);
			break;
		case 4:
			return ;
			}
			
		}
	}
}
