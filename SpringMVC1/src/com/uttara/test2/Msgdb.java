package com.uttara.test2;

import org.springframework.stereotype.Repository;

@Repository
public class Msgdb implements DAO {
	
	
	
	
	public Msgdb() {
		System.out.println("no arg constr..");
	}

	public String getdbjoke() {
		
		return "teddy meddy";
	}

}
