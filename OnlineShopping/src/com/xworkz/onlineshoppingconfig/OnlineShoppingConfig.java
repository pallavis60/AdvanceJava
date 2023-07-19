package com.xworkz.onlineshoppingconfig;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.onlineshoppingdto.OnlineShoppingDto;

public class OnlineShoppingConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration conf = new Configuration();

			Properties prop = new Properties();

			prop.put(Environment.URL, "jdbc:mysql://localhost:3306/online_shopping");
			prop.put(Environment.USER, "root");
			prop.put(Environment.PASS, "Xworkzodc@123");
			prop.put(Environment.SHOW_SQL, "true");
			// prop.put(Environment.HBM2DDL_AUTO, "create");
			prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

			conf.setProperties(prop);
			conf.addAnnotatedClass(OnlineShoppingDto.class);

			ServiceRegistry session = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();

			sessionFactory = conf.buildSessionFactory();

			return sessionFactory;

		}
		return sessionFactory;
	}

}
