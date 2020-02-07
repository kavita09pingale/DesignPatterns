package com.example.productimpl;

import com.example.Enum.Make;
import com.example.Enum.Model;
import com.example.product.Vehicle;

public class Truck implements Vehicle{

	@Override
	public String getModel() {
		return Model.THAR.toString();
	}

	@Override
	public String getMake() {
		return Make.MAHINDRA.toString();
	}

}
