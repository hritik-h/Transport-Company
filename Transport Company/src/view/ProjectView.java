package view;

import java.util.Scanner;

import services.LoginService;
import view.VehicleView;
public class ProjectView {
	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("1. User login. \n2. For user registeration and updation. \n3. For Vehicle ");
			
			int choice = scn.nextInt();
			switch(choice) {
			case 1: 
				LoginView loginView = new LoginView();
				loginView.login();
				break;
			case 2:
				UserView userView = new UserView();
				userView.view();
				break;
			case 3:
				VehicleView vehicleView = new VehicleView();
				vehicleView.view();
				break;
			}
		}
	}
}
