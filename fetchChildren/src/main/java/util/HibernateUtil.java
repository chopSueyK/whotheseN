package util;

import java.util.Properties;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entity.Student;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null){
			try {
				Configuration configuration = new Configuration();
				configuration.configure("/hibernate.cfg.xml");
				configuration.addAnnotatedClass(entity.Student.class);

				sessionFactory = configuration.buildSessionFactory();
				
				/*Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false");
				settings.put(Environment.USER, "aaaa");
				settings.put(Environment.PASS, "aaaa");
				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "create-drop");

				configuration.setProperties(settings);

				configuration.addAnnotatedClass(Student.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);*/

			} catch (Exception e) {
				System.out.print("WAAA ZEBI");
				System.out.print(e.getMessage());
				e.printStackTrace();
				System.out.println("\n\n\n");
			}
		}
		return sessionFactory;
	}

}