package com.uttara.test1;

import org.springframework.beans.factory.annotation.Autowired;

import com.uttara.test2.Msgdb;
@org.springframework.stereotype.Service
public class Msgservice implements Service {

	
	
	
	@Autowired
	Msgdb dao;
	public Msgservice() {
		System.out.println("no arg constr..");
	}
	public String getjoke() {
		
		return dao.getdbjoke();
	}

}
