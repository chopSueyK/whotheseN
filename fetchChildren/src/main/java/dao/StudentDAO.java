package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entity.Student;
import util.HibernateUtil;
import java.util.List;

public class StudentDAO {
	public void saveStudent(Student student) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			// transaction start
			tx = session.beginTransaction();
			
			// save student object
			session.save(student);
			
			// commit transaction
			tx.commit();
		} catch (Exception e) {
			if(tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	
	/*public List<Student> getStudents() {
		try(){
			if(session != null) {
			return session.createQuery("from student", Student.class).list();
			}
			else {
				session = HibernateUtil.getSessionFactory().openSession();
				return session.createQuery("from student", Student.class).list();
			}
		}
	}*/
}