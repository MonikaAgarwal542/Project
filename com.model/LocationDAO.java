package com.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationDAO extends CrudRepository<Location,Integer> { 

}
