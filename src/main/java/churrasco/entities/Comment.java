package churrasco.entities;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idComment;
	
	@Column(name = "id_tocket")
	private int idTicket;
	
	@Column(name = "body")
	private String body;
	
}
