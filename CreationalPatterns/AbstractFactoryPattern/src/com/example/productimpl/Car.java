package com.example.productimpl;

import com.example.Enum.Make;
import com.example.Enum.Model;
import com.example.product.Vehicle;

public class Car implements Vehicle{

	@Override
	public String getModel() {
		return Model.ALTO.toString();
	}

	@Override
	public String getMake() {
		return Make.MARUTI.toString();
	}

}
