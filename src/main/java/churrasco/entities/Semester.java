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
@Table(name = "semester")
public class Semester {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSemester;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Course> course = new ArrayList<Course>();

	public Semester(int idSemester, String name, List<Course> course) {
		super();
		this.idSemester = idSemester;
		this.name = name;
		this.course = course;
	}

	public Semester() {
		
	}

	public int getIdSemester() {
		return idSemester;
	}

	public void setIdSemester(int idSemester) {
		this.idSemester = idSemester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Semester {"
					+ "idSemester=" + idSemester + ", "
					+ "name=" + name + ", "
					+ "course=" + course 
				+ "}";
	}

	
}
