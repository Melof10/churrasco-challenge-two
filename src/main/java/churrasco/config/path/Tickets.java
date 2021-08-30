package churrasco.config.path;

public class Tickets {
	
	public Tickets() {
		
	}

	public String getComments(int idTicket, String subdomain) {
		return "https://" + subdomain + ".zendesk.com/api/v2/tickets/" + idTicket + "/comments.json";
	}

	public String createComment(int idTicket, String subdomain) {
		return "https://" + subdomain + ".zendesk.com/api/v2/tickets/" + idTicket + ".json";
	}
	
}