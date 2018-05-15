package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.OrganizadorSala;

/**
 * Servlet implementation class ConsultarSala
 */
@WebServlet("/ConsultarSala")
public class ConsultarSala extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultarSala() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String v1 = " ";
		
		v1 = (request.getParameter("nome"));
		Double v2 = Double.parseDouble(request.getParameter("curso"));
		
		OrganizadorSala organizarSala = new OrganizadorSala();
		
		String result = organizarSala.organizarSala(v1, v2);
		
		request.setAttribute("resultado", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/consultas/ConsultarSala.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
