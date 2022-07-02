package controler;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Datos;
import model.DatosDAO;

/**
 * Servlet implementation class Datos
 */
@WebServlet("/DatosServlet")
public class DatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DatosServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String strId = request.getParameter("id");

		int id = 0;

		if (strId != null)
			id = Integer.parseInt(strId);

		DatosDAO dDAO = new DatosDAO();

		if (id > 0) {

			Datos D = dDAO.read(id);

			request.setAttribute("datos", D);

			getServletContext().getRequestDispatcher("/View/Datos.jsp").forward(request, response);

		}else if (id==0){
			
			getServletContext().getRequestDispatcher("/View/Datos.jsp").forward(request,response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect(request.getContextPath() + "/DatosServlet");

	}

}
