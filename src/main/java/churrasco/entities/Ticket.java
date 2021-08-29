package churrasco.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {
	
	private Comment comment;

	public Ticket(Comment comment) {
		super();
		this.comment = comment;
	}
	
	public Ticket() {
		
	}
	
	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Ticket {"
				+ "comment=" + comment + 
				"}";
	}
	
}