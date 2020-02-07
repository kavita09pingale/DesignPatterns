package com.example.App;

import com.example.abstarctfactory.VehicleFactory;
import com.example.factoryproducer.FactoryProducer;
import com.example.product.Vehicle;

public class Client {

	public static void main(String[] args) {
		VehicleFactory vehiclefactory=FactoryProducer.create("FieldManager");
		Vehicle vehicle = vehiclefactory.getVehicle();
		System.out.println("Make : " +vehicle.getMake() +"\nModel :  " +vehicle.getModel());
	}

}
