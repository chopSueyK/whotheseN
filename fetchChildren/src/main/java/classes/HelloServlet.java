package classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDAO;
import entity.Student;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	public void init() {
		message = "hello, bitch aaah nigga";
		dao.test.establishConnection();
		/*StudentDAO studentDAO = new StudentDAO();
		Student student = new Student("Who", "These Niggas");
		studentDAO.saveStudent(student);*/
		
		//List<Student> students = studentDAO.getStudents();
		//students.forEach(s -> System.out.println(s.getFirstName()));
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(message);
		request.setAttribute("message", "Ay, who these niggas!");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/example.jsp");
		dispatcher.forward(request, response);

	}
	/*public void service(HttpServletRequest req,
			HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>Hello World!</title></head>");
		out.println("<body><h1>Hello World!</h1></body></html>");
	}*/
}
