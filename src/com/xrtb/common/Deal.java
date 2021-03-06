package com.xrtb.common;

/**
 * Identifies a private or preferred deal
 * @author Ben M. Faul
 *
 */
public class Deal  {

	/** The Id of the deal */
	public String id;
	/** The price to auction at, or if in the bidRequest, it is bidFloor */
	public double price;
	
	public Deal() {
		
	}
	
	public Deal(String id, double price)  {
		this.id = id;
		this.price = price;
	}
	
	@Override 
	public boolean equals(Object who) {
		Deal x = (Deal)who;
		return x.id.equals(id);
	}
}
