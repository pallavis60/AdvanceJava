package com.xworkz.carcompany.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.xworkz.carcompany.dto.CarCompanyDto;

public class CarCompanyConfig {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {

			Configuration config = new Configuration();
			Properties properties = new Properties();

			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/online_shopping");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "Xworkzodc@123");
			properties.put(Environment.SHOW_SQL, "true");
			//properties.put(Environment.HBM2DDL_AUTO, "create");
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");

			config.setProperties(properties);
			config.addAnnotatedClass(CarCompanyDto.class);

			ServiceRegistry session = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
					.build();

			sessionFactory = config.buildSessionFactory(session);

			return sessionFactory;

		}
		return sessionFactory;

	}

}
