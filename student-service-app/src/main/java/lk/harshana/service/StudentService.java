package lk.harshana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lk.harshana.domain.Student;

@Service
public class StudentService {

	private static final String STUDENT = "/student";
	
	@Value("${lanka.student.service.url}")
	private String studentServiceURL;
	
//	private final RestTemplate restTemplate;
	@Bean
	@Autowired
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
//	public StudentService(RestTemplate restTemplate) {
//		super();
//		this.restTemplate = this.restTemplate();
//	}
	
	public List<Student> getAllStudents() {
		String url = studentServiceURL + STUDENT;
		HttpEntity<String> requst = new HttpEntity<>(null, null);
		return this.restTemplate().exchange(url, HttpMethod.GET, requst, new ParameterizedTypeReference<List<Student>>() {
		}).getBody();
	}
	
	
}
