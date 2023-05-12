import dao.StudentDAO;
import entity.Student;

import java.util.List;

import javax.servlet.annotation.WebServlet;


public class app {
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		Student student = new Student("Who", "These Niggas");
		studentDAO.saveStudent(student);
		
		/*List<Student> students = studentDAO.getStudents();
		students.forEach(s -> System.out.println(s.getFirstName()));*/
	}
}