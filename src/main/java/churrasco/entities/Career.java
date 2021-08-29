package churrasco.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Semester> semester = new ArrayList<Semester>();

	public Career(int idCareer, String name, String description, List<Semester> semester) {
		super();
		this.idCareer = idCareer;
		this.name = name;
		this.description = description;
		this.semester = semester;
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

	public List<Semester> getSemester() {
		return semester;
	}

	public void setSemester(List<Semester> semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "career {" + "idCareer=" + idCareer + ", " + "name=" + name + ", " + "description=" + description + ", "
				+ "semester=" + semester + "}";
	}

}
