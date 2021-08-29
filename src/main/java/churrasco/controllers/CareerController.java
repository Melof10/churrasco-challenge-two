package churrasco.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import churrasco.entities.Career;
import churrasco.services.ICareerService;

@RestController
@RequestMapping(value = "/api/careers")
public class CareerController {

	@Autowired
	private ICareerService iCareerService;
	
	@GetMapping(value = "/all")
    public ResponseEntity<List<Career>> findAll(){
		try {
			List<Career> careers = iCareerService.findAll();
			
			if(careers.size() > 0)
				return new ResponseEntity<>(careers, HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@PostMapping(value = "/save")
	public ResponseEntity<Career> save(@Valid @RequestBody Career career){
		try {
			Career careerSaved = iCareerService.save(career);
			
			if(careerSaved != null)
				return new ResponseEntity<>(careerSaved, HttpStatus.OK);
			else
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int idCareer) {
		try {
			iCareerService.deleteById(idCareer);
			return new ResponseEntity<>(null, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
