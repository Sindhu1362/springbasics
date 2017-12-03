package com.srinivas.spring.springcore.lc.TicketReservationProj;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int ticketId;
	private String passengerName;
	
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public void setPassengerName(String passengerName) {
		System.out.println("Setting the property");
		this.passengerName = passengerName;
	}
	
	@Override
	public String toString() {
		return "TicketReservation [ticketId=" + ticketId + ", passengerName=" + passengerName + "]";
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("Inside init method:");
	}
	
	@PreDestroy
	public void bye() {
		System.out.println("Inside destroy method:");
	}
	
	
}
