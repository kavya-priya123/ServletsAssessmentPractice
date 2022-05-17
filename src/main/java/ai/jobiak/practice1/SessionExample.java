package ai.jobiak.practice1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionExample
 */
@WebServlet("/SessionExample")
public class SessionExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out=response.getWriter();
			//1.get form data
			String fname=request.getParameter("n1");
			String lname=request.getParameter("n2");
			//2.HttpSession Creation
			HttpSession hs=request.getSession();
				hs.setAttribute("key1",fname);
				hs.setAttribute("key2",lname);
		
			RequestDispatcher rd=request.getRequestDispatcher("okaySession");
			rd.forward(request, response);
			
			//response.sendRedirect("okaySession");	//URL of OkaySession
			
			// else { out.println("Not Working"); }
	}
}
