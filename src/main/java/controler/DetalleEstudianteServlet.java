package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Estudiante;
import model.EstudianteDAO;
import model.IEstudianteDAO;

/**
 * Servlet implementation class DestalleEstudianteServlet
 */
@WebServlet("/DetalleEstudianteServlet")
public class DetalleEstudianteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetalleEstudianteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		EstudianteDAO eDAO = new EstudianteDAO();
		
		Estudiante E = eDAO.read(id);
		
		request.setAttribute("estudiantes", E);
		
		getServletContext().getRequestDispatcher("/View/DetalleEstudiante.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		String rut = request.getParameter("rut"); 
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Estudiante E = new Estudiante(id,rut,nombre,email,telefono);
		EstudianteDAO eDAO = new EstudianteDAO();
		
		eDAO.update(E);
		
		response.sendRedirect(request.getContextPath()+ "/EstudianteServlet");
	}

}
