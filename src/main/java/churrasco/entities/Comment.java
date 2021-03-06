package churrasco.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {
	
	private String body;
	
	public Comment(String body) {
		super();
		this.body = body;
	}
	
	public Comment() {
		
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Comment {"
				+ "body=" + body + 
				"}";
	}
	
	
	
}
