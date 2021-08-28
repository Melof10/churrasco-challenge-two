package churrasco.services;

import java.util.List;

import churrasco.entities.Comment;

public interface ICommentService {
	
	public List<Comment> findAll();
	
	public Comment save(Comment comment);
	
	public void deleteById(int id);
		
}
