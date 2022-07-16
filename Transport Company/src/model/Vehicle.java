package model;

public class Vehicle {
	String vehicle_id;
	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_type=" + vehicle_type + ", vehicle_desription="
				+ vehicle_desription + ", vehicle_customer_id=" + vehicle_customer_id + ", vehicle_number="
				+ vehicle_number + "]";
	}

	String vehicle_type;
	String vehicle_desription;
	int vehicle_customer_id;
	int vehicle_number;
	
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getVehicle_desription() {
		return vehicle_desription;
	}
	public void setVehicle_desription(String vehicle_desription) {
		this.vehicle_desription = vehicle_desription;
	}
	public int getVehicle_customer_id() {
		return vehicle_customer_id;
	}
	public void setVehicle_customer_id(int vehicle_customer_id) {
		this.vehicle_customer_id = vehicle_customer_id;
	}
	public int getVehicle_number() {
		return vehicle_number;
	}
	public void setVehicle_number(int vehicle_number) {
		this.vehicle_number = vehicle_number;
	}
	
	public Vehicle(String vehicle_id, String vehicle_type, String vehicle_desription, int vehicle_customer_id,
			int vehicle_number) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_type = vehicle_type;
		this.vehicle_desription = vehicle_desription;
		this.vehicle_customer_id = vehicle_customer_id;
		this.vehicle_number = vehicle_number;
	}
	
	
}
