package com.xworkz.onlineshoppingrepo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.onlineshoppingconfig.OnlineShoppingConfig;
import com.xworkz.onlineshoppingdto.OnlineShoppingDto;

public class OnlineShoppingRepoImpl implements OnlineShoppingRepo {

	SessionFactory fact = OnlineShoppingConfig.getSessionFactory();

	@Override
	public boolean save(OnlineShoppingDto dto) {

		Session session = fact.openSession();

		Transaction tran = session.beginTransaction();
		session.save(dto);
		tran.commit();
		session.close();

		System.out.println("Data is saved");

		return true;
	}

	@Override
	public List<OnlineShoppingDto> readAll() {
		Session session = fact.openSession();

		Query quary = session.createQuery(" From OnlineShoppingDto");
		List<OnlineShoppingDto> list = quary.list();
		return list;

	}

	@Override
	public OnlineShoppingDto findById(int id) {
		Session session = fact.openSession();
		OnlineShoppingDto read = session.get(OnlineShoppingDto.class, id);
		return read;
	}

	@Override
	public boolean update(OnlineShoppingDto dto) {

		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		session.update(dto);
		trans.commit();
		session.close();
		System.out.println("Dto is updated");
		return true;
	}

	@Override
	public boolean delete(OnlineShoppingDto dto) {
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(dto);
		trans.commit();
		session.close();
		System.out.println("Dto is deleted");
		return true;
	}

	@Override
	public boolean deleteBYId(int id) {

		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(id);
		trans.commit();
		session.close();
		System.out.println("Dto is deleted");

		return true;
	}

}
