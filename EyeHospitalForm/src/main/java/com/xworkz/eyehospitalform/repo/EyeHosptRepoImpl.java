package com.xworkz.eyehospitalform.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.xworkz.eyehospitalform.dto.EyeHospitalFormDto;

public class EyeHosptRepoImpl implements EyeHosptRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hospitalConnection");
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(EyeHospitalFormDto dto) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		// em.close();
		System.out.println("Data is saved");
		return true;

	}

	@Override
	public List<EyeHospitalFormDto> readAll() {
		TypedQuery<EyeHospitalFormDto> query = em.createQuery("From EyeHospitalFormDto", EyeHospitalFormDto.class);
		return query.getResultList();

	}

	@Override
	public EyeHospitalFormDto findByPatientName(String name) {

		String query = " From EyeHospitalFormDto where patientName = " + name;
		TypedQuery<EyeHospitalFormDto> query1 = em.createQuery(query, EyeHospitalFormDto.class);
		EyeHospitalFormDto dto = query1.getSingleResult();
		return dto;

	}

	@Override
	public EyeHospitalFormDto findById(int id) {
		EyeHospitalFormDto dto = em.find(EyeHospitalFormDto.class, id);
		return dto;
	}

	@Override
	public boolean updateHospitalNameByName(String hosptName, String name) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		EyeHospitalFormDto dto = findByPatientName(name);
		dto.setHospitalName(hosptName);
		em.merge(dto);
		transaction.commit();
		System.out.println("Hospital Name is updated");
		return true;

	}

	@Override
	public boolean deleteByAge(int age) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		String query = "From EyeHospitalFormDto where age= " + age;
		TypedQuery<EyeHospitalFormDto> dto = em.createQuery(query, EyeHospitalFormDto.class);
		EyeHospitalFormDto singledto = dto.getSingleResult();
		em.remove(singledto);
		transaction.commit();
		System.out.println("Data is deleted");
		return true;
	}

	@Override
	public boolean deleteByIdAndName(int id, String patName) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		EyeHospitalFormDto dto = findById(id);
		System.out.println(dto);
		EyeHospitalFormDto dto1 = findByPatientName(patName);
		System.out.println(dto1);
		if (dto.equals(dto1)) {
			System.out.println(dto1);
			em.remove(dto1);
			transaction.commit();
			System.out.println("Values are matching Dto is deleted");
			return true;
		} 
		System.out.println("Values are not Matching");
		return false;
	}

	@Override
	public boolean updateAgeAndisFirstvisitByHospitalName(int age, boolean isFirstvisit, String hosptName) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		 String queryy = "From EyeHospitalFormDto where HospitalName =" + hosptName;
		 TypedQuery<EyeHospitalFormDto> query1 = em.createQuery(queryy, EyeHospitalFormDto.class);
		 EyeHospitalFormDto dto = query1.getSingleResult();
		 dto.setAge(age);
		 dto.setFirstvisit(isFirstvisit);
		 em.merge(dto);
		 transaction.commit();
		 System.out.println("Data is updated");
		 return true; 
	}

}
