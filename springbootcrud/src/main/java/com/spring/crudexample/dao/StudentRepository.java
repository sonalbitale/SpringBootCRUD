package com.spring.crudexample.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.crudexample.entities.Student;

public interface StudentRepository  extends CrudRepository<Student, Integer>{

}
