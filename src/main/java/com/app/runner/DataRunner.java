package com.app.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Adress;
import com.app.document.Student;
import com.app.repo.StudentRepository;
@Component
public class DataRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<String> l1=new ArrayList<>();
		l1.add("Telugu");
		l1.add("ComputerNetwork");
		l1.add("Embaded");
		l1.add("VLSI");
		l1.add("lica");
		
		Adress a=new Adress("Gollapalem", "machilipatnam", "krishna", 521001, "AP");
		repo.save(new Student(434, "Balaraju", "10000", l1, a));
		System.out.println("one record placed sucessfully");
		System.out.println("-----------------------------------------------");
		repo.findAll().forEach(System.out::println);

	}

}
