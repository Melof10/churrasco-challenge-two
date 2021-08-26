package churrasco.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "career")
public class Career {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCareer;
	
	@Column(name = "name", unique = true)
	private String name;
	
	@Column(name = "description")
	private String description;

	public Career(int idCareer, String name, String description) {
		this.idCareer = idCareer;
		this.name = name;
		this.description = description;
	}
	
	public Career() {
		
	}

	public int getIdCareer() {
		return idCareer;
	}

	public void setIdCareer(int idCareer) {
		this.idCareer = idCareer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Career [idCareer=" + idCareer + ", name=" + name + ", description=" + description + "]";
	}
	
}
