package com.xworkz.facebook.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import com.xworkz.facebook.dto.FaceBookDto;

public class FaceBookRepoImpl implements FaceBookRepo {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("facebookconnection");
	
	 EntityManager em  =  emf.createEntityManager();
	

	@Override
	public boolean save(FaceBookDto dto) {
		    EntityTransaction transaction=em.getTransaction();
		    transaction.begin();
		    em.persist(dto);
		    transaction.commit(); 
		    System.out.println("Data is saved");
		   return true;
	}

	@Override
	public List<FaceBookDto> readAll() {
		 Query query =em.createQuery("From  FaceBookDto");
		 List<FaceBookDto> dtos = query.getResultList();
		return dtos;
	}

	@Override
	public FaceBookDto findById(int id) {
		FaceBookDto dto =em.find(FaceBookDto.class, id);
		return dto;
	}

	@Override
	public FaceBookDto findByName(String name) {
		String query = "From  FaceBookDto where name =" + name;
		TypedQuery<FaceBookDto> dtos  =em.createQuery(query, FaceBookDto.class);
		FaceBookDto dto =	dtos.getSingleResult();
		return dto;
	}

	@Override
	public boolean updateById(int id, String name) {
		
		 EntityTransaction transaction=em.getTransaction();
		    transaction.begin();
		    FaceBookDto dto =  findById(id);
		    dto.setName(name);
		    em.merge(dto);
		    transaction.commit();
		    System.out.println("Data is updated");
		    return true;
	}

	@Override
	public boolean updateByNameAndId(String name, int id, String email) {
		
		 EntityTransaction transaction=em.getTransaction();
		    transaction.begin();
		    FaceBookDto dto =  findById(id);
		    FaceBookDto dto1 = findByName(name);
		    if(dto.equals(dto1)) {
		    	System.out.println("data is matching");
		    	dto.setEmail(email);
		    	em.merge(dto);
		    	transaction.commit();
		    	System.out.println("email is updated");
		    	return true;
		    	
		    }
		System.out.println("email is not updated");
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		
		EntityTransaction transaction=em.getTransaction();
	    transaction.begin();
	    FaceBookDto dto =  findById(id);
	    em.remove(dto);
	    transaction.commit();
	    System.out.println("Data is deleted");
		return true;
	}

}
