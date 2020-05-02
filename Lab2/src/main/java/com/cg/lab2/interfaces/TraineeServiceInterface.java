package com.cg.lab2.interfaces;

import java.util.List;

import com.cg.lab2.entity.Trainee;

public interface TraineeServiceInterface {
	


	public Trainee addtrainee(Trainee t);

	public List<Trainee> retrieve();
	
	public void delete(int traineeid);
	
}
