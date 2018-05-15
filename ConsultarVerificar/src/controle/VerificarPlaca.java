package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.ValidarPlaca;

/**
 * Servlet implementation class VerificarPlaca
 */
@WebServlet("/VerificarPlaca")
public class VerificarPlaca extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificarPlaca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String v1 = (request.getParameter("placa"));
		
		ValidarPlaca validarPlaca = new ValidarPlaca();
		
		String result = validarPlaca.validarPlaca(v1);
		
		request.setAttribute("resultado", result);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/verificacoes/VerificarPlaca.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
