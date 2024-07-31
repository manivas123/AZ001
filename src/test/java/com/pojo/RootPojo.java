package com.pojo;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RootPojo {
	
	private String name;
	private String email;
	private long phoneNo;
	private ArrayList<Address> add;
	private Company comp;

}
