package com.example.concretefactory;

import com.example.abstarctfactory.VehicleFactory;
import com.example.product.Vehicle;
import com.example.productimpl.Car;

public class CarConcreteFactory implements VehicleFactory{

	@Override
	public Vehicle getVehicle() {
		return new Car();
	}

}
