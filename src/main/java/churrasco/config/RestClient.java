package churrasco.config;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import churrasco.config.path.Tickets;
import churrasco.entities.Comment;
import churrasco.entities.Ticket;
import churrasco.entities.Zendesk;

public class RestClient {
	
	private RestTemplate restTemplate = new RestTemplate();
	private HttpHeaders headers = new HttpHeaders();
	private Tickets ticketsPath = new Tickets();

	public RestClient() {
	
	}

	public ResponseEntity<?> getComments(int idTicket, String username, String password, String subdomain) {
		headers.setBasicAuth(username, password);
		HttpEntity<?> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<?> result = restTemplate.exchange(ticketsPath.getComments(idTicket, subdomain), HttpMethod.GET, entity,	String.class);
		return result;
	}
	
	public ResponseEntity<?> createComment(int idTicket, Comment comment, String username, String password, String subdomain){
		headers.setBasicAuth(username, password);
		Comment newComment = new Comment(comment.getBody());
		Ticket ticket = new Ticket(newComment);
		Zendesk zendesk = new Zendesk(ticket);
		
		HttpEntity<Zendesk> requestUpdate = new HttpEntity<>(zendesk, headers);
		
		ResponseEntity<?> result = restTemplate.exchange(ticketsPath.createComment(idTicket, subdomain), HttpMethod.PUT, requestUpdate, String.class);
		return result;
	}
	
}