package ai.jobiak.practice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class OkaySession
 */
@WebServlet("/okaySession")
public class OkaySession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OkaySession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession hs=request.getSession();
		String fname=(String)hs.getAttribute("key1");
		String lname=(String)hs.getAttribute("key2");
		out.println("First Name : "+fname+"<br/>");
		out.println("Last Name : "+lname+"<br/>");
		out.println("<h3><a href='logOut'>LogOut</h3><br/>");
	}
}
