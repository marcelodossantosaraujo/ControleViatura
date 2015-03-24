package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Modelo;
import model.dao.ICRUD;
import model.dao.ModeloDao;
import model.dao.categorias.SetVeiculo;
import model.dao.categorias.TipoVeiculo;
import model.jdbc.Conexao;

/**
 * Servlet implementation class ModeloServlet
 */
@WebServlet(name = "ModeloServlet", urlPatterns = {"/CadastroModelo"})
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
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter saida = response.getWriter();
        saida.println("chegou aqui");
        

        TipoVeiculo teste = TipoVeiculo.categoria(1);
        SetVeiculo set = teste.setCategoria();
        Modelo mod = set.setCategoria();
        mod.setMarca(request.getParameter("marca"));
        mod.setModelo(request.getParameter("modelo"));

        ICRUD<Modelo> mode;

        mode = new ModeloDao();
        try {
            mode.create(mod);
            System.out.println("dados cadastrados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Falha ao cadastrar!");
            e.printStackTrace();
        }

//-------------------------------------------------------------------
    }

}
