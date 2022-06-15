package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Estudiante;
import model.EstudianteDAO;
import model.Facilitador;
import model.FacilitadorDAO;

/**
 * Servlet implementation class DetalleFacilitadorServlet
 */
@WebServlet("/DetalleFacilitadorServlet")
public class DetalleFacilitadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetalleFacilitadorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String op = request.getParameter("op");
		String strId = request.getParameter("id");

		int id = 0;

		if (strId != null)
			id = Integer.parseInt(strId);

		FacilitadorDAO fDAO = new FacilitadorDAO();
		
		if(op==null && id>0) {
			
			Facilitador F = fDAO.read(id);
			
			request.setAttribute("facilitador", F);
			
			getServletContext().getRequestDispatcher("/View/DetalleFacilitador.jsp").forward(request,response);
			
			System.out.println(id +" "+op);
		}else if (id==0){
			
			getServletContext().getRequestDispatcher("/View/DetalleFacilitador.jsp").forward(request,response);
		
		}else if(op.equalsIgnoreCase("del")) {
			
			fDAO.delete(id);
			
			response.sendRedirect(request.getContextPath()+ "/FacilitadorServlet");
			
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String rut = request.getParameter("rut"); 
		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String telefono = request.getParameter("telefono");
		String valorhora = request.getParameter("valorhora");
		String banco = request.getParameter("banco");
		String ctabancaria = request.getParameter("ctabancaria");
		
		String strId = request.getParameter("id");
		Facilitador F=null;
		FacilitadorDAO fDAO = new FacilitadorDAO();
		
		if(!strId.isEmpty()) {
			int id = Integer.parseInt(strId);
			F = new Facilitador(id,rut,nombre,email,telefono,valorhora,banco,ctabancaria);
			fDAO.update(F);
		}else {
			F = new Facilitador();
			F.setRut(rut);
			F.setNombre(nombre);
			F.setEmail(email);
			F.setTelefono(telefono);
			F.setValorhora(valorhora);
			F.setBanco(banco);
			F.setCtabancaria(ctabancaria);
			
			fDAO.crear(F);
		}
		
		response.sendRedirect(request.getContextPath() + "/FacilitadorServlet");
		
	}
	

}
