package com.cg.lab2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.lab2.entity.Trainee;
import com.cg.lab2.interfaces.TraineeDaoInterafce;

@Transactional
@Repository
public class TraineeDao implements TraineeDaoInterafce{
	
	@PersistenceContext
	EntityManager em;


	@Override
	public List<Trainee> retrieve() {
		
		String Qstr="SELECT trainee FROM Trainee trainee";
		TypedQuery<Trainee> query=em.createQuery(Qstr,Trainee.class);
		return query.getResultList();
	}

//	@Override
//	public Trainee findbyid(int traineeid) {
//		
//		return em.find(Trainee.class, traineeid);
//	}

	@Override
	public boolean addtrainee(Trainee t) {
		// TODO Auto-generated method stub
		em.persist(t);
		return true;
	}

	@Override
	public void deletetrainee(int traineeid) {
		// TODO Auto-generated method stub
		Trainee t=em.find(Trainee.class, traineeid);
		System.out.println(t.getTraineeid() +" "+t.getTraineename() + " "+t.getTraineedomain()+ " "+t.getTraineelocation()+ "is removed");
		em.remove(t);
	}

//	@Override
//	public void modifytrainee(int traineeid) {
//		// TODO Auto-generated method stub
//		Trainee tr=em.find(Trainee.class, traineeid);
//		tr.setTraineedomain("red");
//		System.out.println("updated");
//		em.flush();
//	}

}
