package churrasco.services;

import java.util.List;

import churrasco.entities.Career;

public interface ICareerService {
	
	public List<Career> findAll();
	
	public Career save(Career career);
	
	public void deleteById(int id);
		
}
