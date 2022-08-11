package com.tectoro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.tectoro.entity.Employee;

@Repository
public interface IEmployeeRepository extends MongoRepository<Employee, Integer> {

}
