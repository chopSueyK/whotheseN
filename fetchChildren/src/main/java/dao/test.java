package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import entity.Student;
import util.HibernateUtil;
import java.util.List;

import util.HibernateUtil;

public class test {
	public static void establishConnection() {
		SessionFactory sessionFactory =  HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
		sessionFactory.openSession();
	}
}