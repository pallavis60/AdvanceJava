package com.xworkz;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.instagram2.config.Instagram2Config;
import com.xworkz.instagram2.dto.Instagram2Dto;

public class Instagram2Runner {

	public static void main(String[] args) {

		SessionFactory factory = Instagram2Config.getSessionFactory();

		Session session = factory.openSession();

		Instagram2Dto dto = new Instagram2Dto(1, "Sheela", "sheela@gmail.com", 9898987878L, "Banglore", "sheela@.123");
		Instagram2Dto dto1 = new Instagram2Dto(2, "Nikitha", "nikki@gmail.com", 8798787678L, "Banglore", "nikki@.123");
		Instagram2Dto dto2 = new Instagram2Dto(3, "Gowri", "gowri1234@gmail.com", 8767879876L, "Banglore",
				"gowri@.123");

		Transaction transaction = session.beginTransaction();
		// session.save(dto);
		// session.save(dto1);
		// session.save(dto2);
		session.update(dto2);
		session.delete(dto);

//		Instagram2Dto read =session.get(Instagram2Dto.class,1);
//		System.out.println(read);
//		

		// Criteria criteria = session.createCriteria(Instagram2Dto.class);

		// List<Instagram2Dto> list = criteria.list();

//Query query =	session.createQuery(" From Instagram2Dto where name='Sheela'");
		Query query = session.createQuery(" From Instagram2Dto");
		List<Instagram2Dto> list = query.list();

		for (Instagram2Dto instagram2Dto : list) {
			System.out.println(instagram2Dto);

		}

		transaction.commit();
		session.close();

	}
}
