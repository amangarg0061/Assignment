package com.cg.lab2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.lab2.entity.Trainee;
import com.cg.lab2.interfaces.TraineeServiceInterface;

@SpringBootApplication
public class Lab2Application{

@Autowired
TraineeServiceInterface td;

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}
	
	
}
