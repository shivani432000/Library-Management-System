package com.example.library.studentlibrary;

import com.example.library.studentlibrary.Models.Card;
import com.example.library.studentlibrary.Models.Student;
import com.example.library.studentlibrary.repositories.CardRepository;
import com.example.library.studentlibrary.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentLibraryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CardRepository cardRepository;

	@Override
	public void run(String... args) throws Exception {

//		Student student = new Student("abc@gmail.com","abc",20,"USA");
//		Card card = new Card();
//		card.setStudent(student);
//		student.setCard(card);
//
//		cardRepository.save(card);
//		cardRepository.findAll().stream().forEach(System.out::println);
	}
}
