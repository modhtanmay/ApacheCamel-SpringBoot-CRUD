package com.cts.camelspringbootjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private String street;
	private String streetName;
	private String buildingNumber;
	private String city;
	private String zipcode;
	private String country;
	private String countryCode;

}
