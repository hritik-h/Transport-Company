package view;

import java.util.Scanner;

import services.LoginService;

public class LoginView {
	LoginService loginService= new LoginService();
	
	public void login() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = scn.nextLine();
		System.out.println("Enter Password: ");
		String password = scn.nextLine();
		if( loginService.login(username, password)) {
			System.out.println("Login Sucessful!!");
			BookingView bookingView = new BookingView();
			int userId = getUserId(username);
			bookingView.view(userId);
		}
		else {
			System.out.println("Invalid Credentials");
			
		}
	}
	public int getUserId(String username) {
		return loginService.getId(username);
	}

}
