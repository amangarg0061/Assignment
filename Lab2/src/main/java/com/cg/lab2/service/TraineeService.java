package com.cg.lab2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab2.entity.Trainee;
import com.cg.lab2.interfaces.TraineeDaoInterafce;
import com.cg.lab2.interfaces.TraineeServiceInterface;


@Service
@Transactional
public class TraineeService implements TraineeServiceInterface {

	@Autowired
	private TraineeDaoInterafce td;
	
	@Override
	public Trainee addtrainee(Trainee t) {
		
		boolean result=td.addtrainee(t);
		
		if(result)
		{
			return t;
		}
		else
			return null;
	}
	
	@Override
	public List<Trainee> retrieve() {
		
		return td.retrieve();
	}
	
	@Override
	public void delete(int traineeid) {
		
		td.deletetrainee(traineeid);
	}

}
