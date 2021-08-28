package churrasco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import churrasco.entities.Comment;

@Repository
public interface ICommentRepository extends JpaRepository<Comment, Integer> {

}
