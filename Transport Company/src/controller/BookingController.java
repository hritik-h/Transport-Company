package controller;

import java.util.Scanner;

import dao.Booking;
import services.BookingService;

public class BookingController {
	BookingService bookingService = new BookingService();
	Scanner scn = new Scanner(System.in);
	public void book(int userId) {
		
		Booking bookingDao = new Booking();
		bookingDao.setUser_id(userId);
		System.out.println("Enter Vehicle Id: ");
		bookingDao.setVehicle_id(scn.nextLine());
		System.out.println("Enter Source: ");
		bookingDao.setSource(scn.nextLine());
		System.out.println("Enter Destination: ");
		bookingDao.setDestination(scn.nextLine());
		bookingService.book(bookingDao);
	}
	public void cancelBooking(int bookingId) {
		bookingService.cancel(bookingId);
		System.out.println("Booking Cancelled Sucessfully!");
	}
}
