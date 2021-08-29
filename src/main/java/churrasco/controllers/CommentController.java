package churrasco.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import churrasco.config.RestClient;
import churrasco.entities.Comment;

@RestController
@RequestMapping(value = "/api/comments")
public class CommentController {

	private RestClient restClient = new RestClient();

	@GetMapping(value = "/all/{id}")
	public ResponseEntity<?> findAll(@PathVariable("id") int idTicket) {
		try {
			ResponseEntity<?> result = restClient.getComments(idTicket);

			if (result != null)
				return result;
			else
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping(value = "/save/{id}")
	public ResponseEntity<?> save(@Valid @RequestBody Comment comment, @PathVariable("id") int idTicket) {
		try {
			ResponseEntity<?> result = restClient.createComment(idTicket, comment);

			if (result != null)
				return result;
			else
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch(Exception error) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
