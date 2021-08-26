package churrasco.dto;

public class CareerDTO {
	
	private int idCareer;
	private String name;
	private String description;
	
	public CareerDTO(int idCareer, String name, String description) {
		this.idCareer = idCareer;
		this.name = name;
		this.description = description;
	}
	
	public CareerDTO() {
		
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
	
}
