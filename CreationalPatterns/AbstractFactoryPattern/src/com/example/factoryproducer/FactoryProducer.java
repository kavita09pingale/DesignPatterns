package com.example.factoryproducer;

import com.example.abstarctfactory.VehicleFactory;
import com.example.concretefactory.CarConcreteFactory;
import com.example.concretefactory.TruckConcreteFactory;

public class FactoryProducer {
 VehicleFactory vehicleFactory; 
 
 public static VehicleFactory create(String employeeType) {
	 if(employeeType.equalsIgnoreCase("FieldManager")) {
		 
		 return new TruckConcreteFactory();
	 }
	 else if (employeeType.equalsIgnoreCase("FloorManager")) {
		 return new CarConcreteFactory();
		 
		 
	 }
	 else if(employeeType.equalsIgnoreCase("SeniorManager")) {
		 
		 return new CarConcreteFactory();
	 }
	 
	 
	 return null;
 }
 
}
