package churrasco.config.path;

import org.springframework.beans.factory.annotation.Value;

public class Tickets {
	
	@Value("${zendeskSubdomain}")
	private String subdomain;

	public Tickets() {
	}

	public String getComments(int idTicket) {
		return "https://" + subdomain + ".zendesk.com/api/v2/tickets/" + idTicket + "/comments.json";
	}

	public String createComment(int idTicket) {
		return "https://" + subdomain + ".zendesk.com/api/v2/tickets/" + idTicket + ".json";
	}
}