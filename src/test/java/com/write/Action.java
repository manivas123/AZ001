package com.write;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.Company;
import com.pojo.RootPojo;

public class Action {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File f  = new File("C:\\Users\\SCLPT 059\\eclipse-workspace\\SampleWrite\\src\\test\\resources\\mani.json");
		ObjectMapper mapper = new ObjectMapper();
		Company c =  new Company("Wipro", 1234);
		Address  a = new Address("1st", "Karur", "TamilNadu");
		Address a1 = new Address("2nd", "Chennai", "TamilNadu");
		Address a2 = new Address("3rd", "tuty", "tamilnady");
		ArrayList<Address> l = new ArrayList<Address>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		RootPojo rp = new RootPojo("mani", "maini@gmial.com", 99999999, l, c);
		mapper.writeValue(f, rp);
		
		
	
	
	}

}