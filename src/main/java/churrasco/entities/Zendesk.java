package churrasco.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Zendesk {
	
	private Ticket ticket;
	
	public Zendesk(Ticket ticket) {
		super();
		this.ticket = ticket;
	}
	
	public Zendesk() {
		
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Zendesk {"
				+ "ticket=" + ticket + 
				"}";
	}
	
}
