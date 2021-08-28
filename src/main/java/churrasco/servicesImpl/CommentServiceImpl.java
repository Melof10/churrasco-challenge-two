package churrasco.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import churrasco.entities.Comment;
import churrasco.repositories.ICommentRepository;
import churrasco.services.ICommentService;

@Service
public class CommentServiceImpl implements ICommentService {

	@Autowired
	private ICommentRepository iCommentRepository;

	@Override
	public List<Comment> findAll() {
		return iCommentRepository.findAll();
	}

	@Override
	public Comment save(Comment comment) {
		return iCommentRepository.save(comment);
	}

	@Override
	public void deleteById(int id) {
		iCommentRepository.deleteById(id);
	}
	
}
