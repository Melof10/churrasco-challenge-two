package churrasco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import churrasco.entities.Career;

@Repository
public interface ICareerRepository extends JpaRepository<Career, Integer>{

}