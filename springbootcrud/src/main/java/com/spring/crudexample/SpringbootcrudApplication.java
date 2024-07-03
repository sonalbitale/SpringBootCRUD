package com.spring.crudexample;

import java.util.Optional;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

import com.spring.crudexample.dao.StudentRepository;
import com.spring.crudexample.entities.Student;

@SpringBootApplication
public class SpringbootcrudApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SpringbootcrudApplication.class, args);
		 StudentRepository studentRepository =  context.getBean(StudentRepository.class);
		 
		 
         //CREATE 
		     Student student = new Student();
		     student.setId(1);
			 student.setName("sonali");
			 student.setCity("pune");
			 Student save = studentRepository.save(student);
			 System.out.println(save);
		 
		  // READ 
	 
			 Iterable<Student> all = studentRepository.findAll();
	         all.forEach(Stu->System.out.println(Stu));	 
	 
	      // UPDATE 
	 
			 Optional<Student> byId = studentRepository.findById(1);
			 Student student2 = byId.get();
			 student2.setCity("mumbaii");
			 
		     Student save1 = studentRepository.save(student2);
		     System.out.println(save1);
		     
	  
	      // DELETE
	     
		  studentRepository.deleteById(2);
	 
	 
	 
	 
	 
	 
	 
	 
		 

	}

}
