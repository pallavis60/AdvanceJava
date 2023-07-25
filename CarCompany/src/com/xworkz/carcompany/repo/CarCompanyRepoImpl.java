package com.xworkz.carcompany.repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.carcompany.config.CarCompanyConfig;
import com.xworkz.carcompany.dto.CarCompanyDto;

public class CarCompanyRepoImpl implements CarCompanyRepo {
	
	         SessionFactory factory =CarCompanyConfig.getSessionFactory();
	
	

	@Override
	public boolean save(CarCompanyDto dto) {
	Session session  =factory.openSession();
	      Transaction transaction   =session.beginTransaction();
	      session.save(dto);
	      transaction.commit();
	      session.close();
	      System.out.println("Data is saved");
		  return true;
	}

	@Override
	public List<CarCompanyDto> readAll() {
	Session session =	factory.openSession();
	      Query query=session.createQuery("From CarCompanyDto");
	          List<CarCompanyDto> dto =query.list();
		       return dto;
	}

	@Override
	public CarCompanyDto findById(int id) {
		 Session session =factory.openSession();
		 CarCompanyDto dto	= session.find(CarCompanyDto.class, id);
		  return dto; 
	}

	@Override
	public CarCompanyDto findBYName(String name) {
		    Session session =factory.openSession();
		    String query ="From CarCompanyDto where companyName =" + name;
		      Query<CarCompanyDto> query1=  session.createQuery(query, CarCompanyDto.class);
		      CarCompanyDto dto =  query1.getSingleResult();
		      return dto;
	}

	@Override
	public boolean updateBYId(int id, String name) {
		Session session =factory.openSession();
		   Transaction transaction=session.beginTransaction();
		CarCompanyDto dto  = session.find(CarCompanyDto.class, id);
		dto.setCompanyName(name);
		   session.update(dto);
		   transaction.commit();
		   session.close();
		System.out.println("Name is Updated");
		return true;
	}

	@Override
	public boolean updateBYIdAndName(int id, String name, String brand) {
		 Session session =factory.openSession();
		 Transaction transaction=session.beginTransaction();
		 CarCompanyDto dto = findById(id);
		 CarCompanyDto dto1 = findBYName(name);
		 if(dto.equals(dto1)) {
			 System.out.println("Data is matching");
			 dto.setBrand(brand);
			 session.update(dto);
			 transaction.commit();
			 session.close();
			 System.out.println("Data is updated");
			 return true;
		 }
		 
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		
		 Session session =factory.openSession();
		 Transaction transaction=session.beginTransaction();
		 CarCompanyDto dto = findById(id);
		 session.delete(dto);
		 transaction.commit();
		 session.close();
		 System.out.println("Data is deleted");
		return true;
	}

}
