package com.hackingchicago.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hackingchicago.model.Donor;
 
//@RepositoryRestResource
@Repository
@Component
public interface DonorRepository extends CrudRepository<Donor, Long> {

	Donor findByLastName(String string);
 
}
