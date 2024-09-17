package com.example.testProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.testProject.entity.User;
import com.example.testProject.repository.UserRepository;

@SpringBootApplication
public class TestProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);

	}
	@Autowired
	private UserRepository  userRepository;

//	@Override
	public void run(String... args) throws Exception {

		User user1 = new User("Souleymane", "souleymane@gmail.com", "12345678");
		userRepository.save(user1);

		User user2 = new User("Abdoul Karim", "karim@gmail.com", "12345678");
		userRepository.save(user2);

		User user3 = new User("Houbba", "hbb@gmail.com", "12345678");
		userRepository.save(user3);

	}

}
