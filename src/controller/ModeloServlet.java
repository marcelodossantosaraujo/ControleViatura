package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

/**
 * Servlet implementation class ModeloServlet
 */
@WebServlet("/CadastroModelo")
public class ModeloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModeloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teste = 0;
		System.out.println(teste);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		String nome = request.getParameter("modelo");
		
		
		saida.print("Chamando metodo post"+nome);
		saida.print("vaaaaaaaaaaaaaaaaiiiiiiiiiiiii");
		
		System.out.println("Chamando metodo post");

		System.out.println("modelo: "+nome);
	}

}
