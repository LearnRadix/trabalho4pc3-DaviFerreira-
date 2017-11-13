package br.prog3web.trabalho4;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RESULTADO")

public class Resultado extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doPost(req, resp);
			}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String matricula;
		String nome;
		String idade;
		String sexo;
		
		matricula = req.getParameter("matricula");
		nome = req.getParameter("nome");
		idade = req.getParameter("idade");
		sexo = req.getParameter("sexo");
		out.println("<hr>");
		out.println("<CENTER><i>CADASTRO PARA O EX�RCITO</i></CENTER>");
		out.println("<hr>");
		out.println("<HTML><HEAD><TITLE>RESULTADO");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<BR><STRONG>Ol� " + nome + "</STRONG>!<br>");
		out.println("Sua matricula �: <STRONG>" + matricula + "</STRONG> <br>");
		out.println("Sua idade �: <STRONG>" + idade + "</STRONG> <br>");
        if(sexo.equals("masculino"))
        {
        	out.println("Do sexo <STRONG>MASCULINO</STRONG><br>");
        }
        else
        {
        	out.println("Do sexo <STRONG>FEMININO</STRONG><br>");
        }
		
		int id = Integer.parseInt(idade);
		
		if(sexo.equals("masculino"))
		{
			if(id >= 18)
			{
				out.println("<br><i><STRONG>Voc� precisa servir ao exercito!</STRONG></i>");
			}
			else
			{
				out.println("<br>Voc� est� ok com suas obriga��es militares!");
			}			
		}
		
		if(sexo.equals("feminino"))
		{
			out.println("<br>Voc� n�o precisa servir ao ex�rcito!");
		}
		
		out.println("<br> </body> </html>");
		out.close();
	}

}
