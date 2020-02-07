package com.example.concretefactory;

import com.example.abstarctfactory.VehicleFactory;
import com.example.product.Vehicle;
import com.example.productimpl.Truck;

public class TruckConcreteFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle() {
		return new Truck();
	}

}
