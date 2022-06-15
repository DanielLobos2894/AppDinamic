package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Estudiante;
import model.EstudianteDAO;

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
	
		String op = request.getParameter("op");
		String strId = request.getParameter("id");
		
		int id =0;
		
		if (strId != null) 
			id = Integer.parseInt(strId);
		
				
		EstudianteDAO eDAO = new EstudianteDAO();
		
		if(op==null && id > 0) {
			//codigo para consultar 
			
			
			Estudiante E = eDAO.read(id);
			
			request.setAttribute("estudiantes", E);
			
			getServletContext().getRequestDispatcher("/View/DetalleEstudiante.jsp").forward(request,response);
			
			System.out.println(id +" "+op);
		}else if (id==0){
			
			getServletContext().getRequestDispatcher("/View/DetalleEstudiante.jsp").forward(request,response);
		
		}else if(op.equalsIgnoreCase("del")) {
			
			eDAO.delete(id);
			
			response.sendRedirect(request.getContextPath()+ "/EstudianteServlet");
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 

		String rut = request.getParameter("rut"); 
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		
		String strId = request.getParameter("id");
		Estudiante E=null;
		EstudianteDAO eDAO = new EstudianteDAO();
		
		if(!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			E = new Estudiante(id,rut,nombre,email,telefono);
			eDAO.update(E);
		}else {
			E = new Estudiante();
			E.setRut(rut);
			E.setNombre(nombre);
			E.setEmail(email);
			E.setTelefono(telefono);
			
			eDAO.crear(E);
		}
		
		response.sendRedirect(request.getContextPath() + "/EstudianteServlet");
		
	}
	
	

}
