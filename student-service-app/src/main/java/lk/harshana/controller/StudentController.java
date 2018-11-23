package lk.harshana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lk.harshana.domain.Student;
import lk.harshana.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value= {"/", "/index"})
	public String getHomePage(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String getLoginPage(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/students")
	public String getStudentsViewPage(Model model) {
		List<Student> list = this.studentService.getAllStudents();
		model.addAttribute("students", list);
		return "students-view";
	}
	
	
}
