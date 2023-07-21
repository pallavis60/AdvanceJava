package com.xworkz.medicine.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.medicine.config.MedicineConfig;
import com.xworkz.medicine.dto.MedicineDto;

public class MedicineRepoImpl implements MedicineRepo {

	SessionFactory fact = MedicineConfig.getSessionFactory();

	@Override
	public boolean save(MedicineDto dto) {

		Session session = fact.openSession();
		Transaction trans = session.getTransaction();
		trans.begin();
		session.save(dto);
		trans.commit();
		session.close();
		System.out.println("Data is saved");
		return true;
	}

	@Override
	public MedicineDto findByName(String name) {
		Session session = fact.openSession();
		String query1 = " From MedicineDto where name= " + name;
		Query<MedicineDto> query = session.createQuery(query1, MedicineDto.class);
		MedicineDto dto = query.getSingleResult();
		return dto;

	}

	@Override
	public boolean updateusedForByName(String name, String usedFor) {
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		MedicineDto dto = findByName(name);
		dto.setUsedFor(usedFor);
		session.update(dto);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updateNameAndIdBysideEffect(String name, int rate, String sideEffect) {

		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();

		String query = "From MedicineDto where sideEffect = " + sideEffect;
		Query<MedicineDto> query1 = session.createQuery(query, MedicineDto.class);
		MedicineDto dto = query1.getSingleResult();
		dto.setName(name);
		dto.setRate(rate);
		session.update(dto);
		trans.commit();
		session.close();
		return true;

	}

	@Override
	public List<MedicineDto> readAll() {
		Session session = fact.openSession();
		Query query = session.createQuery("from MedicineDto");
		List<MedicineDto> list = query.list();
		return list;

	}

	@Override
	public boolean deleteByName(String name) {
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		MedicineDto dto = findByName(name);
		session.delete(dto);
		trans.commit();
		session.close();
		System.out.println("Data is deleted");
		return true;
	}

	@Override
	public boolean deleteByNameAndSideEffect(String name, String sideEffect) {
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		String query = "from MedicineDto where name= " + name;
		Query<MedicineDto> query1 = session.createQuery(query, MedicineDto.class);

		MedicineDto dto = query1.getSingleResult();

		String query2 = "from MedicineDto where sideEffect= " + sideEffect;
		Query<MedicineDto> query4 = session.createQuery(query2, MedicineDto.class);

		MedicineDto dto1 = query4.getSingleResult();

		if (dto.getSideEffect().equals(dto1.getSideEffect())) {
			if (dto.getName().equals(dto1.getName())) {
				session.delete(dto);
				trans.commit();
				session.close();
				System.out.println("Data is deleted");
				return true;
			}

			System.out.println("Data is not deleted");
			return false;
		}
		System.out.println("Data is not deletd");
		return false;
	}

}
