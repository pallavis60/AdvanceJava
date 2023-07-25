	package com.xworkz.doctor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.doctor.dto.DoctorDto;

public class DoctorRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("doctorConnection");
		EntityManager em = emf.createEntityManager();

		DoctorDto dto = new DoctorDto(1, "Sheela", "Eye", 25, "Jayadev");
		DoctorDto dto1 = new DoctorDto(2, "Nikitha", "Heart", 26, "Ashoka");
		DoctorDto dto2 = new DoctorDto(3, "Maha", "Ear", 23, "Asara");

		// EntityTransaction trans = em.getTransaction();
		// trans.begin();
		// em.persist(dto);
		// em.persist(dto1);
		// em.persist(dto2);
		// trans.commit();
		// em.close();
		
		System.out.println("-------------------------------------------");
		
		// EntityTransaction trans = em.getTransaction();
		// trans.begin();

		// DoctorDto update= em.merge(dto2);
		// System.out.println(update);

		// trans.commit();
		// em.close();
		
		System.out.println("-----------------------------------------");

		DoctorDto findeddto = em.find(DoctorDto.class, 1);
		System.out.println(findeddto);
		
		System.out.println("----------------------------------------");
		
		// EntityTransaction trans = em.getTransaction();
		// trans.begin();
		// em.remove(em.getReference(DoctorDto.class, 2));
		 //em.remove(em.find(DoctorDto.class, 2));
		// trans.commit();
		// em.close();
		
		
		
	}

}
