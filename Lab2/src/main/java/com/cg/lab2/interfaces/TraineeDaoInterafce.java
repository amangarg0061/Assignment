package com.cg.lab2.interfaces;

import java.util.List;

import com.cg.lab2.entity.Trainee;

public interface TraineeDaoInterafce {
	
	public boolean addtrainee (Trainee t);
	public void deletetrainee (int traineeid);
	public List<Trainee> retrieve();

}
