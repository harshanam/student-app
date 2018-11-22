package lk.harshana.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.harshana.service.model.Student;
import lk.harshana.service.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentServiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceController.class);
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping()
	public List<Student> getAllStudent() {
		return new ArrayList<>(this.studentRepository.findAll());
	}
	
	
	
}
