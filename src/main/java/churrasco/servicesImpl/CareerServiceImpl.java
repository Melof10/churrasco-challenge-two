package churrasco.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import churrasco.entities.Career;
import churrasco.repositories.ICareerRepository;
import churrasco.services.ICareerService;

@Service
public class CareerServiceImpl implements ICareerService{
	
	@Autowired
	private ICareerRepository iCareerRepository;

	@Override
	public List<Career> findAll() {
		return iCareerRepository.findAll();
	}

	@Override
	public Career save(Career career) {
		return iCareerRepository.save(career);
	}

	@Override
	public void deleteById(int id) {
		iCareerRepository.deleteById(id);
	}

}
