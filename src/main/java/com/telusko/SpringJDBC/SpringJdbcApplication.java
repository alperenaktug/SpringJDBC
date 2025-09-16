package com.telusko.SpringJDBC;

import com.telusko.SpringJDBC.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcApplication.class, args);

		Student student = context.getBean(Student.class);

		student.setRollNo(101);
		student.setName("Polat");
		student.setMarks(78);

		

	}


}
